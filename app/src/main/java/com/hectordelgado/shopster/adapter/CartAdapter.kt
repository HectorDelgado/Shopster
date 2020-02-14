package com.hectordelgado.shopster.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.hectordelgado.shopster.R
import com.hectordelgado.shopster.model.Product


/**
 *  Shopster
 *
 *  @author Hector Delgado
 *
 *  Created on February 13, 2020.
 *  Copyright © 2020 Hector Delgado. All rights reserved.
 */
class CartAdapter(private val cartItems: List<Product>, private val itemQuantities: List<Int>): RecyclerView.Adapter<CartAdapter.CartHolder>() {

    class CartHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImage = itemView.findViewById<ImageView>(R.id.itemImage)
        val itemName = itemView.findViewById<TextView>(R.id.itemName)
        val itemPrice = itemView.findViewById<TextView>(R.id.itemPrice)
        val itemQuantity = itemView.findViewById<TextView>(R.id.itemQuantity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartHolder {
        val inflater = LayoutInflater.from(parent.context)
        val cardHolderView = inflater.inflate(R.layout.cart_item, parent, false)
        return CartHolder(cardHolderView)
    }

    override fun onBindViewHolder(holder: CartHolder, position: Int) {
        holder.itemImage.setImageResource(cartItems[position].productImages[0])
        holder.itemName.text = cartItems[position].productName
        val productPrice = String.format("Price: $%.2f", cartItems[position].productPrice)
        holder.itemPrice.text = productPrice
        val quantity = "Qty: ${itemQuantities[position]}"
        holder.itemQuantity.text = quantity
    }

    override fun getItemCount() = cartItems.size
}