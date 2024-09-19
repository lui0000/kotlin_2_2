package com.example.kotline2_2

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Найди NavHostFragment и установи NavController
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHostFragment.navController

        findViewById<Button>(R.id.button_first).setOnClickListener {
            navController.navigate(R.id.fragment1)
        }
        findViewById<Button>(R.id.button_second).setOnClickListener {
            navController.navigate(R.id.fragment2)
        }
        findViewById<Button>(R.id.button_third).setOnClickListener {
            navController.navigate(R.id.fragment3)
        }
    }
}


