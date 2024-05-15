package com.example.uts1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class home : AppCompatActivity() {

    private lateinit var dashboardListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        dashboardListView = findViewById(R.id.dashboardListView)


        val dashboardItems = listOf("Sport", "Food", "Tech", "Fashion", "Travel")

        val adapter = ArrayAdapter(this, R.layout.item_dashboard, R.id.itemTextView, dashboardItems)
        dashboardListView.adapter = adapter

        dashboardListView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            Toast.makeText(this, "You clicked on: $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}
