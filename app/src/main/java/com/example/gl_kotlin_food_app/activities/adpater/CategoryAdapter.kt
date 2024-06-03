package com.example.gl_kotlin_food_app.activities.adpater

import com.example.gl_kotlin_food_app.R
import com.example.gl_kotlin_food_app.activities.modal.Category
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


internal class CategoryAdapter(
    private val categoryList: List<Category>,
    private val context: Context
) :
    BaseAdapter() {
    private var layoutInflater: LayoutInflater? = null
    private lateinit var cat_name: TextView
    private lateinit var cat_image: ImageView

    override fun getCount(): Int {
        return categoryList.size
    }
    override fun getItem(position: Int): Any? {
        return null
    }
    override fun getItemId(position: Int): Long {
        return 0
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var convertView = convertView
        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null) {
            convertView = layoutInflater!!.inflate(R.layout.category_item, null)
        }
        cat_image = convertView!!.findViewById(R.id.idIVCourse)
        cat_name = convertView!!.findViewById(R.id.idTVCourse)
        cat_image.setImageResource(categoryList.get(position).image)
        cat_name.setText(categoryList.get(position).name)
        return convertView
    }
}
