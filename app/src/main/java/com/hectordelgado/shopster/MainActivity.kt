package com.hectordelgado.shopster

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val productDownloader = ProductDownloader()

        mRecyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ProductRecyclerViewAdapter(productDownloader.getProducts()) { product, position ->
                Toast.makeText(this@MainActivity, "Clicked on ${product.productName} Pos $position", Toast.LENGTH_LONG).show()
            }
        }
    }
}
