package com.example.swipemaman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.example.swipemaman.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {


    private lateinit var viewPager2: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewPager2 = findViewById(R.id.ViewPager)
        tabLayout = findViewById(R.id.tabBar)
        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(this, )

        viewPager2.adapter = viewPagerFragmentAdapter


        TabLayoutMediator(tabLayout, viewPager2,) { page, position ->
            page.text = "Page 1 ${position + 1}"


        }.attach()

    }
}