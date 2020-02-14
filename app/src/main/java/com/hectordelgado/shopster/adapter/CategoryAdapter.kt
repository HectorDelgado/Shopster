package com.hectordelgado.shopster.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hectordelgado.shopster.R
import com.hectordelgado.shopster.model.Category

/**
 *  Shopster
 *
 *  @author Hector Delgado
 *
 *  Created on February 11, 2020.
 *  Copyright © 2020 Hector Delgado. All rights reserved.
 */
class CategoryAdapter(private val categoryList: List<Category>, private val clickListener: (Category, Int) -> Unit)
    : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val categoryImage: ImageView = view.findViewById(R.id.categoryImage)
        val categoryTitle: TextView = view.findViewById(R.id.categoryTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.category_item, parent, false)
        return CategoryViewHolder(
            view
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.categoryImage.setImageResource(categoryList[position].categoryImageResource)
        holder.categoryTitle.text = categoryList[position].categoryName

        holder.itemView.setOnClickListener {
            clickListener(categoryList[position], position)
        }
    }

    override fun getItemCount() = categoryList.size
}