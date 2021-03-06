package com.github.kaellybot.portals.model.constants;

import com.github.kaellybot.portals.util.Translator;
import lombok.AllArgsConstructor;
import lombok.Getter;

import static com.github.kaellybot.portals.model.constants.Area.*;

@Getter
@AllArgsConstructor
public enum SubArea {

    CENTRE_BONTA               (BONTA              , "sous_zone.centre_bonta"              ),
    CIMETIERE_HEROS            (BONTA              , "sous_zone.cimetiere_heros"           ),
    PORTE_BRAKMAR              (BRAKMAR            , "sous_zone.porte_brakmar"             ),
    CENTRE_BRAKMAR             (BRAKMAR            , "sous_zone.centre_brakmar"            ),
    RIVIERE_KAWAII             (AMAKNA             , "sous_zone.riviere_kawaii"            ),
    VILLAGE_BWORKS             (AMAKNA             , "sous_zone.village_bwork"             ),
    PRESQUILE_DRAGOEUF         (AMAKNA             , "sous_zone.presquile_dragoeuf"        ),
    PENINSULE_GELEES           (AMAKNA             , "sous_zone.peninsule_gelees"          ),
    FORET_MALEFIQUE            (AMAKNA             , "sous_zone.bord_foret_malefique"      ),
    CHATEAU_AMAKNA             (AMAKNA             , "sous_zone.chateau_amakna"            ),
    COIN_BOUFTOUS              (AMAKNA             , "sous_zone.coin_bouftous"             ),
    MONTAGNE_CRAQUELEURS       (AMAKNA             , "sous_zone.montagne_craqueleurs"      ),
    PLAINE_SCARAFEUILLES       (AMAKNA             , "sous_zone.plaine_scarafeuilles"      ),
    PORT_MADRESTAM             (AMAKNA             , "sous_zone.port_madrestam"            ),
    VILLAGE_AMAKNA             (AMAKNA             , "sous_zone.village_amakna"            ),
    MILLIFUTAIE                (AMAKNA             , "sous_zone.millifutaie"               ),
    FORET_AMAKNA               (AMAKNA             , "sous_zone.foret_amakna"              ),
    TERRITOIRE_PORCOS          (AMAKNA             , "sous_zone.territoire_porcos"         ),
    MONTAGNE_BASSE_CRAQUELEURS (AMAKNA             , "sous_zone.montagne_basse_craqueleurs"),
    SUFOKIA                    (BAIE_SUFOKIA       , "sous_zone.sufokia"                   ),
    TEMPLE_ALLIANCES           (BAIE_SUFOKIA       , "sous_zone.temple_alliances"          ),
    RIVAGE_SUFOKIEN            (BAIE_SUFOKIA       , "sous_zone.rivage_sufokien"           ),
    CITE_ASTRUB                (ASTRUB             , "sous_zone.cite_astrub"               ),
    FORET_ASTRUB               (ASTRUB             , "sous_zone.foret_astrub"              ),
    TAINELA                    (ASTRUB             , "sous_zone.tainela"                   ),
    VILLAGE_BRIGANDINS         (PLAINES_CANIA      , "sous_zone.village_brigandin"         ),
    BAIE_CANIA                 (PLAINES_CANIA      , "sous_zone.baie_cania"                ),
    CHAMPS_CANIA               (PLAINES_CANIA      , "sous_zone.champs_cania"              ),
    LAC_CANIA                  (PLAINES_CANIA      , "sous_zone.lac_cania"                 ),
    MASSIF_CANIA               (PLAINES_CANIA      , "sous_zone.massif_cania"              ),
    PLAINE_PORKASS             (PLAINES_CANIA      , "sous_zone.plaine_porkass"            ),
    PLAINES_ROCHEUSES          (PLAINES_CANIA      , "sous_zone.plaines_rocheuses"         ),
    ROUTES_ROCAILLEUSES        (PLAINES_CANIA      , "sous_zone.routes_rocailleuses"       ),
    VILLAGE_KANIGS             (PLAINES_CANIA      , "sous_zone.village_kanigs"            ),
    VILLAGE_DOPEULS            (PLAINES_CANIA      , "sous_zone.village_dopeuls"           ),
    DENTS_PIERRE               (PLAINES_CANIA      , "sous_zone.dents_pierre"              ),
    DOMAINE_FUNGUS             (LANDES_SIDIMOTE    , "sous_zone.domaine_fungus"            ),
    ROUTE_ROULOTTES            (LANDES_SIDIMOTE    , "sous_zone.route_roulottes"           ),
    TERRES_DESACREES           (LANDES_SIDIMOTE    , "sous_zone.terres_desacrees"          ),
    DESOLATION_SIDIMOTE        (LANDES_SIDIMOTE    , "sous_zone.desolation_sidimote"       ),
    VILLAGE_ELEVEURS_KOALAK    (MONTAGNE_KOALAKS   , "sous_zone.village_eleveurs_koalak"   ),
    VALLEE_MORH_KITU           (MONTAGNE_KOALAKS   , "sous_zone.vallee_morh_kitu"          ),
    VILLAGE_AERDALA            (PANDALA_AIR        , "sous_zone.village_aerdala"           ),
    VILLAGE_AKWADALA           (PANDALA_EAU        , "sous_zone.village_akwadala"          ),
    VILLAGE_FEUDALA            (PANDALA_FEU        , "sous_zone.village_feudala"           ),
    FAUBOURGS_PANDALA          (Area.PANDALA_NEUTRE, "sous_zone.faubourgs_pandala"         ),
    VILLAGE_TERRDALA           (PANDALA_TERRE      , "sous_zone.village_terrdala"          ),
    PANDALA_NEUTRE             (Area.PANDALA_NEUTRE, "sous_zone.pandala_neutre"            ),
    ILE_MINOTOROR              (Area.ILE_MINOTOROR , "sous_zone.ile_minotoror"             ),
    TUNNEL_KARTONPATH          (ILOT_MER_DASSE     , "sous_zone.tunnel_kartonpath"         ),
    PLAGE_TORTUE               (ILE_MOON           , "sous_zone.plage_tortue"              ),
    ILE_CAWOTTE                (ILE_WABBIT         , "sous_zone.ile_cawotte"               ),
    LABORATOIRES_ABANDONNES    (ILE_WABBIT         , "sous_zone.laboratoires_abandonnes"   ),
    PLAINES_HERBEUSES          (ILE_OTOMAI         , "sous_zone.plaines_herbeuses"         ),
    VILLAGE_ELEVEURS_OTOMAI    (ILE_OTOMAI         , "sous_zone.village_eleveurs_otomai"   ),
    VILLAGE_COTIER             (ILE_OTOMAI         , "sous_zone.village_cotier"            ),
    FEUILLAGE_ARBRE_HAKAM      (ILE_OTOMAI         , "sous_zone.feuillage_arbre_hakam"     ),
    VILLAGE_ZOTHS              (ILE_OTOMAI         , "sous_zone.village_zoth"              ),
    VILLAGE_CANOPEE            (ILE_OTOMAI         , "sous_zone.village_canopee"           ),
    BOURGADE                   (ILE_FRIGOST        , "sous_zone.bourgade"                  ),
    FRIGOSTIEN                 (ILE_FRIGOST        , "sous_zone.frigostien"                ),
    CHAMPS_GLACE               (ILE_FRIGOST        , "sous_zone.champs_glace"              ),
    SERRE_RM                   (ILE_FRIGOST        , "sous_zone.serre_rm"                  ),
    FORET_PINS_PERDUS          (ILE_FRIGOST        , "sous_zone.foret_pins_perdus"         ),
    EXCAVATION_MR              (ILE_FRIGOST        , "sous_zone.excavation_mr"             ),
    BERCEAU_ALMA               (ILE_FRIGOST        , "sous_zone.berceau_alma"              ),
    LARMES_OURONIGRIDE         (ILE_FRIGOST        , "sous_zone.larmes_ouronigride"        ),
    CREVASSE_PERGE             (ILE_FRIGOST        , "sous_zone.crevasse_perge"            ),
    VILLAGE_ENSEVELI           (ILE_FRIGOST        , "sous_zone.village_enseveli"          ),
    FORET_PETRIFIEE            (ILE_FRIGOST        , "sous_zone.foret_petrifiee"           ),
    CROCS_VERRE                (ILE_FRIGOST        , "sous_zone.crocs_verre"               ),
    MONT_TORRIDEAU             (ILE_FRIGOST        , "sous_zone.mont_torrideau"            ),
    PLAINE_SAKAI               (ILE_FRIGOST        , "sous_zone.plaine_sakai"              ),
    DUNE_OSSEMENTS             (SAHARACH           , "sous_zone.dune_ossements"            ),
    PORT_SARAKECH              (SAHARACH           , "sous_zone.port_sarakech"             ),
    TERRITOIRE_CACTERRE        (SAHARACH           , "sous_zone.territoire_cacterre"       ),
    GORGE_VENTS_HURLANTS       (SAHARACH           , "sous_zone.gorge_vents_hurlants"      );

    private Area area;
    private String key;

    public String getLabel(Language lang){
        return Translator.getLabel(lang, getKey());
    }
}