package com.example.placesofinterest

import androidx.annotation.DrawableRes

data class Place(
    var name: String,
    @DrawableRes var imageResId: Int
) {
    companion object {
        val PLACE_NAMES = arrayOf(
            "Amsterdam Dam",
            "Amsterdam Weesperplein",
            "Rotterdam Euromast",
            "Den Haag Binnenhof",
            "Groningen Martinitoren",
            "Maastricht Vrijthof",
            "New York Vrijheidsbeeld",
            "San Francisco Golden Gate",
            "Ottawa Parliament Hill",
            "Londen Tower Bridge",
            "Brussel Manneken Pis",
            "Berlijn Reichstag",
            "Parijs Eiffeltoren",
            "Barcelona Sagrada Familia",
            "Rome Colosseum",
            "Pompeii",
            "Kopenhagen",
            "Oslo",
            "Helsinki",
            "Moskou Rode Plein",
            "Beijing Verboden Stad",
            "Kaapstad Tafelberg",
            "Rio de Janeiro Copacabana",
            "Hawaii Honolulu",
            "Alaska Denali"
        )

        val PLACE_RES_DRAWABLE_IDS = arrayOf(
            R.drawable.amsterdam_dam,
            R.drawable.amsterdam_weesperplein,
            R.drawable.rotterdam_euromast,
            R.drawable.den_haag_binnenhof,
            R.drawable.groningen_martinitoren,
            R.drawable.maastricht_vrijthof,
            R.drawable.new_york_vrijheidsbeeld,
            R.drawable.san_francisco_golden_gate,
            R.drawable.ottawa_parliament_hill,
            R.drawable.london_tower_bridge,
            R.drawable.brussel_manneken_pis,
            R.drawable.berlijn_reichstag,
            R.drawable.parijs_eiffeltoren,
            R.drawable.barcelona_sagrada_familia,
            R.drawable.rome_colosseum,
            R.drawable.pompeii,
            R.drawable.kopenhagen,
            R.drawable.oslo,
            R.drawable.helsinki,
            R.drawable.moskou_rode_plein,
            R.drawable.beijing_verboden_stad,
            R.drawable.kaapstad_tafelberg,
            R.drawable.rio_de_janeiro_copacabana,
            R.drawable.hawaii,
            R.drawable.alaska_denali
        )
    }
}