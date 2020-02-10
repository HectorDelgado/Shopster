package com.hectordelgado.shopster

/**
 *  Shopster
 *
 *  @author Hector Delgado
 *
 *  Created on February 09, 2020.
 *  Copyright © 2020 Hector Delgado. All rights reserved.
 */
class ProductDownloader {
    fun getProducts(): List<Product> {
        return listOf(
            Product(
                R.drawable.img_product_chocolates,
                "Ferrero Rocher Chocolate Collection",
                "Ferrero Rocher Chocolate Collection",
                4.0f,
                20.79),
            Product(
                R.drawable.img_product_coffee_maker,
                "Ovalware RJ3 Cold Brew Maker",
                "Ovalware RJ3 Cold Brew Maker",
                4.2f,
                21.44),
            Product(
                R.drawable.img_product_decanter,
                "Whiskey Decanter Globe Set",
                "Whiskey Decanter Globe Set",
                5.0f,
                50.78),
            Product(
                R.drawable.img_product_flashlight,
                "LED Tactical Flashlight S1000",
                "LED Tactical Flashlight S1000",
                3.8f,
                8.10),
            Product(
                R.drawable.img_product_greenies,
                "Greenies Original Dog Treats - Regular",
                "Greenies Original Dog Treats - Regular",
                4.3f,
                34.99),
            Product(
                R.drawable.img_product_kindle,
                "Kindle - Black",
                "Kindle - Black",
                4.1f,
                64.99),
            Product(
                R.drawable.img_product_movie_pets,
                "The Secret Life of Pets: 2-Movie Collection",
                "The Secret Life of Pets: 2-Movie Collection",
                5.0f,
                14.99),
            Product(
                R.drawable.img_product_scale,
                "Etekcity Digital Kitchen Scale",
                "Etekcity Digital Kitchen Scale",
                4.3f,
                9.77),
            Product(
                R.drawable.img_product_toilet_paper,
                "Scott Bulk Toilet Paper - 80 Rolls",
                "Scott Bulk Toilet Paper - 80 Rolls",
                5.0f,
                42.34)
            )
    }
}