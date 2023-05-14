package com.example.praktikum05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var viewPager:ViewPager = findViewById(R.id.viewPager) as ViewPager
        var tablayout:TabLayout = findViewById(R.id.tablayout) as TabLayout

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(ChatFragment(), "Pesan")
        fragmentAdapter.addFragment(HomeFragment(), "Status")
        fragmentAdapter.addFragment(SettingsFragment(), "Profil")

        viewPager.adapter = fragmentAdapter
        tablayout.setupWithViewPager(viewPager)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.action_menu, menu);
        return true;
    }
}