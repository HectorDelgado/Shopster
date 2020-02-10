package com.hectordelgado.shopster

/**
 *  Shopster
 *
 *  @author Hector Delgado
 *
 *  Created on February 09, 2020.
 *  Copyright © 2020 Hector Delgado. All rights reserved.
 */
data class Product(
    val productImage: Int,
    val productContentDescription: String,
    val productName: String,
    val productRating: Float,
    val productPrice: Double)