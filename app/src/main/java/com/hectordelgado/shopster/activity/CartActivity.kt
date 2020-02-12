package com.hectordelgado.shopster.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hectordelgado.shopster.R
import com.hectordelgado.shopster.service.CartService
import kotlinx.android.synthetic.main.activity_cart.*

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        inventoryTextview.text = CartService.printInventory()


    }


}
