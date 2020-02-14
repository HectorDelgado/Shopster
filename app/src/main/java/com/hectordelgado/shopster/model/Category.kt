package com.hectordelgado.shopster.model

/**
 *  Shopster
 *
 *  @author Hector Delgado
 *
 *  Created on February 11, 2020.
 *  Copyright © 2020 Hector Delgado. All rights reserved.
 */
data class Category(
    val categoryName: String,
    val categoryImageResource: Int,
    val categoryIdentifier: Int) {

    companion object {
        const val CATEGORY_APPAREL              = 1001
        const val CATEGORY_ELECTRONICS          = 1002
        const val CATEGORY_FOOD_AND_GROCERY     = 1003
        const val CATEGORY_KITCHEN_AND_DINING   = 1004
        const val CATEGORY_PET_SUPPLIES         = 1005
        const val CATEGORY_MOVIES_MUSIC_GAMES   = 1006
    }
}