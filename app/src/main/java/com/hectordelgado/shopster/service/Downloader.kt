package com.hectordelgado.shopster.service

import com.hectordelgado.shopster.R
import com.hectordelgado.shopster.model.Category
import com.hectordelgado.shopster.model.Product

/**
 *  Shopster
 *
 *  @author Hector Delgado
 *
 *  Created on February 12, 2020.
 *  Copyright © 2020 Hector Delgado. All rights reserved.
 */
object Downloader {
    private fun getApparelProducts(): List<Product> {
        return listOf(
            Product(
                "B07SF3Z62VGB",
                "Vans Ultrarange EXO",
                listOf(
                    R.drawable.img_product_vans_ultrarangeexo_greensulphur_01,
                    R.drawable.img_product_vans_ultrarangeexo_greensulphur_02,
                    R.drawable.img_product_vans_ultrarangeexo_greensulphur_03),
                "We believe adventure begins when things go sideways, so we " +
                        "developed a shoe that would not only stand up to the journey, but keep " +
                        "you comfortable in the most uncomfortable of situations. Armed with a " +
                        "co-molded UltraCush midsole, updated RapidWeld detailing, a lightweight, " +
                        "die-cut rubber outsole, and a breathable Old Skool-inspired upper, " +
                        "this is the UltraRange - evolved. The UltraRange EXO is made with " +
                        "sturdy textile and synthetic uppers.",
                "Vans Ultrarange EXO",
                4.5f,
                90.00
            ),
            Product(
                "F8JF83JF9AFJ",
                "Van Oldskool Pro BMX",
                listOf(
                    R.drawable.img_product_vans_oldskoolprobmx_yellow_01,
                    R.drawable.img_product_vans_oldskoolprobmx_yellow_02,
                    R.drawable.img_product_vans_oldskoolprobmx_yellow_03),
                "For BMX madman Larry Edgar, this philosophy and approach to " +
                        "living is the whole of the law. Featuring the right blend of style and " +
                        "performance that Larry demands, the Larry Edgar Old Skool Pro BMX " +
                        "includes sturdy canvas and suede uppers, brand new PopCush footbeds " +
                        "for superior cushioning and impact protection, DURACAP reinforcement " +
                        "rubber underlays in high wear areas for unrivaled durability, and the " +
                        "revolutionary Vans Wafflecup BMX construction that offers the support " +
                        "of a cupsole without sacrificing any of the grip or pedalfeel of a " +
                        "traditional vulcanized shoe. It also includes Vans original waffle " +
                        "outsoles made of a rubber that offers grip and support, and Larry’s " +
                        "own signature graphic elements, reflecting his drive to push the limits.",
                "Vans Oldskool Pro BMX",
                5.0f,
                70.00
            )
        )
    }

    private fun getElectronicProducts(): List<Product> {
        return listOf(
            Product(
                "B07X5TTTJT",
                "LED Tactical Flashlight S1000",
                listOf(R.drawable.img_product_flashlight),
                "Super lighting: S1000 High lumen flashlight LED bulb " +
                        "provides bright light, easily light up an entire room or focus in on " +
                        "objects up to 1000 feet away! Conveniently takes 3 standard AAA batteries " +
                        "or 1x18650 rechargeable button top Li-ion battery. " +
                        "(Batteries are not included.)",

                "LED Tactical Flashlight S1000",
                3.8f,
                8.10
            ),
            Product(
                "FAF958F10",
                "Kindle - Black",
                listOf(R.drawable.img_product_kindle),
                "Meet the Kindle, now with a built-in adjustable front light " +
                        "so you can read indoors and outdoors and at more times of day. " +
                        "Purpose-built for reading, Kindle features a glare-free touchscreen " +
                        "display that reads like real paper, even in direct sunlight." +
                        "\nPurpose-built for reading, with a 167 ppi glare-free display that " +
                        "reads like real paper, even in direct sunlight." +
                        "\nSelect from millions of books, newspapers, and audiobooks. Kindle " +
                        "holds thousands of titles so you can take your library with you.",
                "Kindle - Black",
                4.1f,
                64.99
            )
        )
    }

    private fun getFoodProducts(): List<Product> {
        return listOf(
            Product(
                "B07W6TR96W",
                "Ferrero Rocher Chocolate Collection",
                listOf(R.drawable.img_product_chocolates),
                "If you love Rocher, you will love Ferrero Collection. " +
                        "Experience three multilayered confections. Iconic Rocher. Lusciously" +
                        "layered Raffaello. Delicious dark chocolate Rondnoir. Perfect for " +
                        "sharing and holiday gifting, because there is something for everyone " +
                        "in this elegant assorted box. Savor the variety of unique delights with " +
                        "Ferrero Collection." +
                        "\nEnjoy three favorite confections, for an excitingly different experience." +
                        "\nWith Ferrero Collection, there is something for every taste and every " +
                        "holiday occasion.For special holiday occasions, give a generous gift " +
                        "that creates a celebratory moment and a lasting memory.",
                "Ferrero Rocher Chocolate Collection",
                4.0f,
                20.79
            )
        )
    }

    private fun getKitchenProducts(): List<Product> {
        return listOf(
            Product(
                "B01CTIYU60",
                "Ovalware RJ3 Cold Brew Maker",
                listOf(R.drawable.img_product_coffee_maker),
                "Cold brewing makes coffee less acidic and smoother in taste " +
                        "than traditional hot brewing, providing you with a purer, healthier " +
                        "coffee concentrate." +
                        "\nDesigned for the ultimate cold-brewing experience, " +
                        "our dishwasher-safe, BPA-free RJ3 Cold Brewer locks freshness and flavor " +
                        "for up to 2 weeks within durable extra-thick glass for maximum " +
                        "temperature stability. Flexible for brewing hot or cold, tea or coffee, " +
                        "within a sleek design engineered to fit perfectly in your fridge." +
                        "\nGreat for loose-leaf tea. Or tea bags. Brew it hot like a traditional " +
                        "teapot, or brew it cold in the fridge. Take your brewing & hosting " +
                        "skills to the next level.",
                "Ovalware RJ3 Cold Brew Maker",
                4.2f,
                21.44
            ),
            Product(
                "B077Y2SJML",
                "Whiskey Decanter Globe Set",
                listOf(R.drawable.img_product_decanter),
                "Meticulously hand blown, our whiskey decanter features an " +
                        "etched globe design and antique ship in the bottle that will undoubtedly " +
                        "enhance your drinking experience while making a bold impression." +
                        "\nHand Blown elegant Whiskey Decanter dispenser featuring an etched " +
                        "globe design and antique ship in the bottle will undoubtedly enhance " +
                        "your drinking experience while making a bold impression." +
                        "\nDecanter capacity 850ml - Cocktail glass capacity 300ml.",
                "Whiskey Decanter Globe Set",
                5.0f,
                50.78
            ),
            Product(
                "B0113UZJE2",
                "Etekcity Digital Kitchen Scale",
                listOf(R.drawable.img_product_scale),
                "This Etekcity digital scale has endless uses for personal " +
                        "or commercial environments - great for homes, kitchens, offices, " +
                        "and more. The scale has an easy-to-read LCD display with beautiful " +
                        "clear backlit. With a capacity of 11lb (5kg), you can weigh a variety " +
                        "of items with ease. You will be surprised at all the uses you " +
                        "will have for this product." +
                        "\nYou can easily choose among measurement in oz, lb:oz, g, ml " +
                        "(Milk & Water). This digital scale measures in precise increments of " +
                        "0.04oz (1 g) to accurately weigh your items. Power is provided by 2 AAA " +
                        "batteries (included), making the scale portable and ensuring that you " +
                        "can easily acquire replacement batteries.",
                "Etekcity Digital Kitchen Scale",
                4.3f,
                9.77
            ),
            Product(
                "B008I7TNDW",
                "Scott Bulk Toilet Paper - 80 Rolls",
                listOf(R.drawable.img_product_toilet_paper),
                "Scott\'s biodegradable toilet paper meets EPA minimum standards, " +
                        "and it’s FSC and EcoLogo certified, so that you can feel confident " +
                        "about choosing a wholesale eco friendly product at a great price." +
                        "\nMade with 100% recycled fiber, this 2-ply bulk toilet paper " +
                        "is strong and absorbent.",
                "Scott Bulk Toilet Paper - 80 Rolls",
                5.0f,
                42.34
            )
        )
    }

    private fun getPetProducts(): List<Product> {
        return listOf(
            Product(
                "B07G9RG6HY",
                "Greenies Original Dog Treats - Regular",
                listOf(R.drawable.img_product_greenies),
                "One Greenies Original Dental Treat a day is all it takes " +
                        "for clean teeth, fresh breath and a happy dog. Your dog can\'t wait " +
                        "to sink their teeth into these delicious, original-flavor dental " +
                        "dog chews because they feature a delightfully chewy texture that fights " +
                        "plaque and tartar. Irresistibly tasty and incredibly powerful, Greenies " +
                        "treats for dogs are recommended by veterinarians for at-home oral care. " +
                        "Best of all, these natural dog treats are made with highly soluble " +
                        "ingredients that are safe and easy to digest. Give your dog the " +
                        "mouth-wowing treat that helps promote their overall health " +
                        "with Greenies Dog treats.",
                "Greenies Original Dog Treats - Regular",
                4.3f,
                34.99
            )
        )
    }

    private fun getMovieProducts(): List<Product> {
        return listOf(
            Product(
                "87AT0F10JI",
                "The Secret Life of Pets: 2-Movie Collection",
                listOf(R.drawable.img_product_movie_pets),
                "Your favorite pets are back in this two-movie collection! " +
                        "Explore the deep bond between them and the families that love them, " +
                        "and answer the question that has long intrigued every pet owner: " +
                        "What are your pets really doing when you\'re not at home?" +
                        "\nExplore the emotional lives of our pets - the deep bond between them, " +
                        "the families that love them - and find out what your pets are really " +
                        "doing when you’re not at home.",
                "The Secret Life of Pets: 2-Movie Collection",
                5.0f,
                14.99
            )
        )
    }

    fun getAllProducts(): List<Product> {
        val allProducts = mutableListOf<Product>()
        allProducts.addAll(getApparelProducts())
        allProducts.addAll(getElectronicProducts())
        allProducts.addAll(getFoodProducts())
        allProducts.addAll(getKitchenProducts())
        allProducts.addAll(getMovieProducts())
        allProducts.addAll(getPetProducts())
        allProducts.shuffle()

        return allProducts
    }

    fun getAllCategories(): List<Category> {
        return listOf(
            Category(
                "Electronics",
                getProductsByCategory(Category.CATEGORY_ELECTRONICS).random().productImages.random(),
                Category.CATEGORY_ELECTRONICS
            ),
            Category(
                "Food and Grocery",
                getProductsByCategory(Category.CATEGORY_FOOD_AND_GROCERY).random().productImages.random(),
                Category.CATEGORY_FOOD_AND_GROCERY
            ),
            Category(
                "Kitchen and Dining",
                getProductsByCategory(Category.CATEGORY_KITCHEN_AND_DINING).random().productImages.random(),
                Category.CATEGORY_KITCHEN_AND_DINING
            ),
            Category(
                "Pet Supplies",
                getProductsByCategory(Category.CATEGORY_PET_SUPPLIES).random().productImages.random(),
                Category.CATEGORY_PET_SUPPLIES
            ),
            Category(
                "Movies, Music and Games",
                getProductsByCategory(Category.CATEGORY_MOVIES_MUSIC_GAMES).random().productImages.random(),
                Category.CATEGORY_MOVIES_MUSIC_GAMES
            )
        )
    }

    fun getProductsByCategory(filter: Int): List<Product> {
        return when (filter) {
            Category.CATEGORY_APPAREL ->  getApparelProducts()
            Category.CATEGORY_ELECTRONICS -> getElectronicProducts()
            Category.CATEGORY_FOOD_AND_GROCERY -> getFoodProducts()
            Category.CATEGORY_KITCHEN_AND_DINING -> getKitchenProducts()
            Category.CATEGORY_PET_SUPPLIES -> getPetProducts()
            Category.CATEGORY_MOVIES_MUSIC_GAMES -> getMovieProducts()
            else -> listOf()
        }
    }
}