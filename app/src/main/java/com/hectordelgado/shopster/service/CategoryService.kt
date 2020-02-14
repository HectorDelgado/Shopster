package com.hectordelgado.shopster.service

import com.hectordelgado.shopster.model.Category

/**
 *  Shopster
 *
 *  @author Hector Delgado
 *
 *  Created on February 11, 2020.
 *  Copyright © 2020 Hector Delgado. All rights reserved.
 */
object CategoryService {
    private var currentCategory: Category? = null

    fun setCurrentCategory(currentCategory: Category) {
        this.currentCategory = currentCategory
    }

    fun getCurrentCategory(): Category? {
        return currentCategory
    }
}