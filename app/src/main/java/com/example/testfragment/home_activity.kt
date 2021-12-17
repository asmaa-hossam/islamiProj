package com.example.testfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testfragment.home.fragmenthadeeth
import com.example.testfragment.home.fragmentquraan
import com.example.testfragment.home.fragmentradio
import com.example.testfragment.home.fragmenttasbeeh
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class home_activity : AppCompatActivity() {
    lateinit var bottomNavigation:BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        bottomNavigation=findViewById(R.id.bottomnavigation)
        bottomNavigation.setOnItemReselectedListener(NavigationBarView.OnItemReselectedListener
            { menuItem ->
                if (menuItem.itemId == R.id.navigation_quraan) {
                    supportFragmentManager.beginTransaction().replace(
                        R.id.fragment_container, fragmentquraan(),
                    ).addToBackStack(null).commit()
                    return@OnItemReselectedListener
                } else if (menuItem.itemId == R.id.navigation_hadeeth) {
                    supportFragmentManager.beginTransaction().replace(
                        R.id.fragment_container, fragmenthadeeth(),
                    ).addToBackStack(null).commit()

                    return@OnItemReselectedListener
                } else if (menuItem.itemId == R.id.navigation_sebha) {
                    supportFragmentManager.beginTransaction().replace(
                        R.id.fragment_container, fragmenttasbeeh(),
                    ).addToBackStack(null).commit()
                    return@OnItemReselectedListener
                }
                if (menuItem.itemId == R.id.navigation_radio) {
                    supportFragmentManager.beginTransaction().replace(
                        R.id.fragment_container, fragmentradio(),
                    ).commit()
                    return@OnItemReselectedListener
                }



            })
        bottomNavigation.selectedItemId=R.id.navigation_quraan

    }
}