package com.example.gl_kotlin_food_app.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gl_kotlin_food_app.activities.adpater.ViewPagerFragmentAdapter
import com.example.gl_kotlin_food_app.databinding.ActivityProductBinding
import com.google.android.material.tabs.TabLayoutMediator

class ProductActivity : AppCompatActivity() {
    private lateinit var binding: ActivityProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductBinding.inflate(layoutInflater)
        setContentView(binding.root)
    init()
    }

    fun init(){
        val adapter = ViewPagerFragmentAdapter(this@ProductActivity)
        binding.viewpager.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewpager) { tab, position ->
            when (position) {
                0 -> tab.text = "Lunch"
                1 -> tab.text = "Breakfast"
                2 -> tab.text = "Dinner"
            }
        }.attach()


    }
}