package com.hectordelgado.shopster.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.TransitionManager
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.hectordelgado.shopster.service.ProductService
import com.hectordelgado.shopster.R
import com.hectordelgado.shopster.model.Product
import com.hectordelgado.shopster.service.CartService
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    private lateinit var currentProduct: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        initializeProduct()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.cart -> {
                val intent = Intent(this, CartActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun initializeProduct() {
        ProductService.getCurrentProduct()
            ?.let { currentProduct ->
            this.currentProduct = currentProduct

            productImage.setImageResource(currentProduct.productImage)
            productName.text = currentProduct.productName
            val price = "$${currentProduct.productPrice}"
            productPrice.text = price
            descriptionTextView.text = currentProduct.productFullDescription
        }
    }

    fun descriptionClicked(view: View) {
        TransitionManager.beginDelayedTransition(findViewById(R.id.parentLayout))
        if (descriptionTextView.visibility == View.VISIBLE) {
            descriptionTextView.visibility = View.GONE
            descriptionArrow.rotation = 0f
        } else {
            descriptionTextView.visibility = View.VISIBLE
            descriptionArrow.rotation = 180f
        }
    }

    fun addToCart(view: View) {
        CartService.addToCart(currentProduct) { isSuccess, message ->
            if (isSuccess) {
                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            }
        }
    }
}
