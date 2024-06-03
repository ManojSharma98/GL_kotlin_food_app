package com.example.gl_kotlin_food_app.activities.adpater

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.gl_kotlin_food_app.activities.fragment.Fragment1
import com.example.gl_kotlin_food_app.activities.fragment.Fragment2
import com.example.gl_kotlin_food_app.activities.fragment.Fragment3
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerFragmentAdapter(fragmentActivity: FragmentActivity):
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return Fragment1()
            1 -> return Fragment2()
            2 -> return Fragment3()
        }
        return Fragment1()
    }
}