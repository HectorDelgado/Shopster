package com.hectordelgado.shopster.model

/**
 *  Shopster
 *
 *  @author Hector Delgado
 *
 *  Created on February 09, 2020.
 *  Copyright © 2020 Hector Delgado. All rights reserved.
 */
data class Product(
    val productASIN: String,
    val productImage: Int,
    val productFullDescription: String,
    val productContentDescription: String,
    val productName: String,
    val productRating: Float,
    val productPrice: Double) {
}