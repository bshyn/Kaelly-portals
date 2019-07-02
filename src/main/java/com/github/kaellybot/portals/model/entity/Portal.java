package com.github.kaellybot.portals.model.entity;

import com.github.kaellybot.portals.model.constants.Transport;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Duration;
import java.time.Instant;

@Data
@Builder
@Document(collection = "portals")
public class Portal {

    public static final long PORTAL_LIFETIME_IN_DAYS = 2;

    @Id
    private PortalId portalId;
    private Position position;
    private Integer utilisation;
    private Instant creationDate;
    private Author creationAuthor;
    private Instant lastUpdateDate;
    private Author lastAuthorUpdate;
    private Transport nearestZaap;
    private Transport nearestTransportLimited;
    private boolean transportLimitedNearest;
    private boolean isAvailable;
    private boolean isUpdated;

    public boolean isValid(){
        return isAvailable() && Math.abs(Duration.
                between(Instant.now(), getCreationDate()).toDays()) < PORTAL_LIFETIME_IN_DAYS;
    }

    public void merge(Portal portal){
        if (getPortalId().equals(portal.getPortalId()) && portal.getPosition() != null)
            if (portal.getPosition().equals(getPosition()) && getUtilisation() > portal.getUtilisation()) {
                setUpdated(true);
                setUtilisation(portal.getUtilisation());
                setLastUpdateDate(portal.getLastUpdateDate());
                setLastAuthorUpdate(portal.getLastAuthorUpdate());
            }
            else if (getPosition() == null || getPosition() != null && ! getPosition().equals(portal.getPosition())
                    && getCreationDate().toEpochMilli() < portal.getCreationDate().toEpochMilli()) {
                setAvailable(true);
                setUpdated(false);
                setPosition(portal.getPosition());
                setCreationDate(portal.getCreationDate());
                setCreationAuthor(portal.getCreationAuthor());
                setUtilisation(portal.getUtilisation());
                determineTransports();
            }
        }

    private void determineTransports() {
        double minDist = Double.MAX_VALUE;
        double minDistLimited = Double.MAX_VALUE;
        for (Transport transport : Transport.values()) {
            double tmp = transport.getPosition().getDistance(getPosition());
            if (transport.isAvailableUnderConditions() && (getNearestZaap() == null || minDist > tmp)){
                setNearestZaap(transport);
                minDist = tmp;
            }
            if (! transport.isAvailableUnderConditions() && (getNearestTransportLimited() == null
                    || minDistLimited > tmp)){
                setNearestTransportLimited(transport);
                setTransportLimitedNearest(true);
                minDistLimited = tmp;
            }
        }

        if (minDist < minDistLimited) {
            setNearestTransportLimited(null);
            setTransportLimitedNearest(false);
        }
    }
}