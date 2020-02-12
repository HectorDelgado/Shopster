package com.hectordelgado.shopster.service

import com.hectordelgado.shopster.model.Product

/**
 *  Shopster
 *
 *  @author Hector Delgado
 *
 *  Created on February 10, 2020.
 *  Copyright © 2020 Hector Delgado. All rights reserved.
 */
object ProductService {
    private var currentProduct: Product? = null

    fun setCurrentProduct(currentProduct: Product) {
        ProductService.currentProduct = currentProduct
    }

    fun getCurrentProduct(): Product? {
        return currentProduct
    }
}