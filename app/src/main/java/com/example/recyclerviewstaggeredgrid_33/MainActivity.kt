package com.example.recyclerviewstaggeredgrid_33

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var itemAdapter: ItemAdapter
    private lateinit var itemList: ArrayList<Int>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        itemList = ArrayList()
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        addDataToList()

        itemAdapter = ItemAdapter(itemList)
        recyclerView.adapter = itemAdapter



    }

    private fun addDataToList(){
        itemList.add(R.drawable.picture_1)
        itemList.add(R.drawable.picture_2)
        itemList.add(R.drawable.picture_3)
        itemList.add(R.drawable.picture_4)
        itemList.add(R.drawable.picture_5)
        itemList.add(R.drawable.picture_6)
        itemList.add(R.drawable.picture_7)
        itemList.add(R.drawable.picture_8)
    }
}