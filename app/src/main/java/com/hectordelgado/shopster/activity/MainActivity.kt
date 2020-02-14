package com.hectordelgado.shopster.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import com.hectordelgado.shopster.*
import com.hectordelgado.shopster.adapter.CategoryAdapter
import com.hectordelgado.shopster.service.CategoryService
import com.hectordelgado.shopster.service.ProductDownloader
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.cart -> {
                Intent(this, CartActivity::class.java).apply {
                    startActivity(this)
                }
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun setupRecyclerView() {
        val productDownloader = ProductDownloader()

        mRecyclerView.apply {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = CategoryAdapter(
                productDownloader.getAllCategories()
            ) { category, position ->
                CategoryService.setCurrentCategory(category)
                Intent(this@MainActivity, ProductListActivity::class.java).apply {
                    startActivity(this)
                }
            }
        }
    }
}
