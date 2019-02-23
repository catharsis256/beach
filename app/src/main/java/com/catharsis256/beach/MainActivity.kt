package com.catharsis256.beach

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @Suppress("UNUSED_PARAMETER")
    fun orderTrip(view: View) {
/*
        The following one is not like the material design:

        Toast.makeText(this, "Ваше путешествие заказано!", Toast.LENGTH_SHORT)
                .show()

        But a snackbar is it
*/

        Snackbar.make(
                findViewById(R.id.coordinator),
                "Ваше путешествие заказано!",
                Snackbar.LENGTH_SHORT
        ).show()

/*
        Snackbar =
                all of these are given by implementation 'com.android.support:design:28.0.0'
*/
    }

}
