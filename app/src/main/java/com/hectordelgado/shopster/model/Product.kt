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
    val productName: String,
    val productImages: List<Int>,
    val productDescription: String,
    val imageContentDescription: String,
    val productRating: Float,
    val productPrice: Double)