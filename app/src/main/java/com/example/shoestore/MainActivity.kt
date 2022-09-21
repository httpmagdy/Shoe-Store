package com.example.shoestore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.apply {
            title = ""
            title = "Shoe Store"
            setDisplayHomeAsUpEnabled(true)
        }

        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        onSupportNavigateUp()
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.nav_host_fragment)
        val  currentFragment = navController.currentDestination?.id
        return if (
            currentFragment == R.id.shoeListFragment ||
            currentFragment == R.id.loginFragment
        ) {
            finish()
            true
        } else {
            navController.navigateUp()
        }
    }
}


