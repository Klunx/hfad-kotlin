package com.klunx.beeradviser

class BeerExpert {
    fun getBrands(colour: String): List<String> {
        val brands: MutableList<String> = ArrayList<String>()
        when (colour) {
            "amber" -> {
                brands.add("Jack Amber")
                brands.add("Red Moose")
            }
            else -> {
                brands.add("Jail Pale Ale")
                brands.add("Gout Stout")
            }

        }
        return brands
    }
}