package com.example.gl_kotlin_food_app.activities

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.gl_kotlin_food_app.R
import com.example.gl_kotlin_food_app.activities.adpater.CategoryAdapter
import com.example.gl_kotlin_food_app.activities.modal.Category
import com.example.gl_kotlin_food_app.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    lateinit var categoryList: ArrayList<Category>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        categoryList = ArrayList()

        categoryList.add( Category("Category 1 ", R.drawable.app_logo))
        categoryList.add( Category("Category 2 ", R.drawable.app_logo))
        categoryList.add( Category("Category 3 ", R.drawable.app_logo))
        categoryList.add( Category("Category 4 ", R.drawable.app_logo))
        categoryList.add( Category("Category 5 ", R.drawable.app_logo))

        val courseAdapter = CategoryAdapter(categoryList = categoryList, this@HomeActivity)

        binding.gridView.adapter = courseAdapter
        binding.gridView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            startActivity(Intent(this@HomeActivity, ProductActivity::class.java))

        }
    }
}