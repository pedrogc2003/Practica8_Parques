package com.example.practica8_parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practica8_parques.adapter.ParkAdapter
import com.example.practica8_parques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val manager = LinearLayoutManager(this)
        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter = ParkAdapter(ParksProvider.PaksList)

    }
}