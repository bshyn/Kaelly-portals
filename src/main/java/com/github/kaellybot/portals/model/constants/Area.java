package com.github.kaellybot.portals.model.constants;

import com.github.kaellybot.portals.util.Translator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Area {

    PLAINES_CANIA     ("area.plaines_cania"   ),
    AMAKNA            ("area.amakna"          ),
    ASTRUB            ("area.astrub"          ),
    BAIE_SUFOKIA      ("area.baie_sufokia"    ),
    BONTA             ("area.bonta"           ),
    ILE_OTOMAI        ("area.ile_otomai"      ),
    ILE_FRIGOST       ("area.ile_frigost"     ),
    ILE_MOON          ("area.ile_moon"        ),
    ILE_WABBIT        ("area.ile_wabbit"      ),
    LANDES_SIDIMOTE   ("area.landes_sidimote" ),
    BRAKMAR           ("area.brakmar"         ),
    ILE_MINOTOROR     ("area.ile_minotoror"   ),
    ILOT_MER_DASSE    ("area.ilot_mer_dasse"  ),
    SAHARACH          ("area.saharach"        ),
    PANDALA_TERRE     ("area.pandala_terre"   ),
    PANDALA_NEUTRE    ("area.pandala_neutre"  ),
    PANDALA_FEU       ("area.pandala_feu"     ),
    PANDALA_EAU       ("area.pandala_eau"     ),
    PANDALA_AIR       ("area.pandala_air"     ),
    MONTAGNE_KOALAKS  ("area.montagne_koalaks");

    private String key;

    public String getLabel(Language lang){
        return Translator.getLabel(lang, getKey());
    }
}