package com.klunx.beeradviser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import java.lang.StringBuilder

class FindBeerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_beer)
    }

    fun onClickFindBeer(view: View) {
        val brands: TextView = findViewById(R.id.brands)
        val spinner: Spinner = findViewById(R.id.colour)
        val beerType = spinner.selectedItem.toString()
        val beers = BeerExpert().getBrands(beerType)
        val brandsFormatted = StringBuilder()
        for (beer in beers) {
            brandsFormatted.append(beer).append("\n")
        }
        brands.text = brandsFormatted
    }
}