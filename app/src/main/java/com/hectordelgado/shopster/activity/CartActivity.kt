package com.hectordelgado.shopster.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.hectordelgado.shopster.R
import com.hectordelgado.shopster.adapter.CartAdapter
import com.hectordelgado.shopster.service.CartService
import kotlinx.android.synthetic.main.activity_cart.*

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        setupRecyclerView()

        val subtotal = CartService.calculateSubTotal()
        subtotalText.text = String.format("Subtotal: $%.2f", subtotal)
    }

    private fun setupRecyclerView() {

        mRecyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@CartActivity)
            adapter = CartAdapter(CartService.getListOfProducts(), CartService.getListOfQuantities())
        }
    }
}
