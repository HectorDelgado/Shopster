package com.hectordelgado.shopster.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hectordelgado.shopster.R
import com.hectordelgado.shopster.model.Product

/**
 *  Shopster
 *
 *  @author Hector Delgado
 *
 *  Created on February 09, 2020.
 *  Copyright © 2020 Hector Delgado. All rights reserved.
 */
class ProductAdapter(private val productList: List<Product>, private val clickListener: (Product, Int) -> Unit)
    : RecyclerView.Adapter<ProductAdapter.ProductRecyclerViewHolder>() {

    class ProductRecyclerViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val productImage: ImageView = view.findViewById(R.id.productImageView)
        val productName: TextView = view.findViewById(R.id.productNameTextView)
        val productRatingBar: RatingBar = view.findViewById(R.id.productRatingBar)
        val productPrice: TextView = view.findViewById(R.id.productPriceTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductRecyclerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.product_item, parent, false)
        return ProductRecyclerViewHolder(
            view
        )
    }

    override fun getItemCount() =
        productList.size

    override fun onBindViewHolder(holder: ProductRecyclerViewHolder, position: Int) {
        holder.productImage.setImageResource(productList[position].productImages[0])
        holder.productImage.contentDescription = productList[position].imageContentDescription
        holder.productName.text = productList[position].productName
        holder.productRatingBar.rating = productList[position].productRating
        val price = "$${String.format("%.2f", productList[position].productPrice)}"
        holder.productPrice.text =  price

        holder.itemView.setOnClickListener {
            clickListener(productList[position], position)
        }
    }
}