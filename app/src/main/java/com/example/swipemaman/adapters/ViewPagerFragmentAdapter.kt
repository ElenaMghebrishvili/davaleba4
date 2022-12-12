package com.example.swipemaman.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.swipemaman.pkg.FirstFragment
import com.example.swipemaman.pkg.SecondFragment
import com.example.swipemaman.pkg.ThirdFragment

class ViewPagerFragmentAdapter(activity: FragmentActivity):FragmentStateAdapter(activity) {
    override fun getItemCount() = 3


    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstFragment().apply {
            }
            1 -> SecondFragment()
            2 -> ThirdFragment()
            else -> FirstFragment()
        }
    }
}