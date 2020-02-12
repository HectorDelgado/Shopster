package com.hectordelgado.shopster.service

import com.hectordelgado.shopster.model.Product
import java.lang.StringBuilder

/**
 *  Shopster
 *
 *  @author Hector Delgado
 *
 *  Created on February 11, 2020.
 *  Copyright © 2020 Hector Delgado. All rights reserved.
 */
object CartService {
    // Represents the cart inventory for a specific product in the form:
    // <product-asin<product,count>>
    private val cartInventory = mutableMapOf<String, Pair<Product, Int>>()

    fun getCartInventory() = cartInventory

    fun getCartInventoryForProductASIN(productASIN: String): Int? {
        return cartInventory[productASIN]?.second
    }

    fun printInventory(): String {
        val inventory = StringBuilder()
        for ((key, product) in cartInventory) {
            inventory.append("Product: ${product.first.productName}. Qty: ${product.second}\n")
        }

        return inventory.toString()
    }

    /**
     * Appends one to the current count the specified product or sets it to one if it already exists.
     */
    fun addToCart(product: Product, isSuccess: (Boolean, String) -> Unit) {
        val newCount = cartInventory[product.productASIN]?.second?.plus(1) ?: 1
        cartInventory[product.productASIN] = Pair(product.copy(), newCount)
        isSuccess(true, "Item Added To Cart")
    }

    fun removeFromCart(product: Product, removalIsSuccessful: (Boolean, String) -> Unit) {
        if (cartInventory.containsKey(product.productASIN)) {
            cartInventory[product.productASIN]?.let { (storedProduct, count) ->
                if (count <= 1) {
                    cartInventory.remove(product.productASIN)
                } else {
                    cartInventory[product.productASIN] = Pair(product.copy(), count - 1)
                }

                removalIsSuccessful(true, "Product removed from cart")
            }
        }
        else {
            removalIsSuccessful(false, "This item is not in your cart")
        }
    }
}