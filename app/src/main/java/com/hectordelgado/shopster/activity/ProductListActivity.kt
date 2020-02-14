package com.hectordelgado.shopster.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.hectordelgado.shopster.adapter.ProductAdapter
import com.hectordelgado.shopster.R
import com.hectordelgado.shopster.service.CategoryService
import com.hectordelgado.shopster.service.ProductDownloader
import com.hectordelgado.shopster.service.ProductService
import kotlinx.android.synthetic.main.activity_product_list.*

class ProductListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val productDownloader = ProductDownloader()

        CategoryService.getCurrentCategory()?.let { currentCategory ->
            productsRecyclerView.apply {
                setHasFixedSize(true)
                addItemDecoration(DividerItemDecoration(this@ProductListActivity, DividerItemDecoration.VERTICAL))
                layoutManager = LinearLayoutManager(this@ProductListActivity)
                adapter = ProductAdapter(productDownloader.getProductsByCategory(currentCategory.categoryIdentifier)) { product, position ->
                    ProductService.setCurrentProduct(product)
                    Intent(this@ProductListActivity, ProductDetailActivity::class.java).apply {
                        startActivity(this)
                    }
                }
            }
        }
    }
}
