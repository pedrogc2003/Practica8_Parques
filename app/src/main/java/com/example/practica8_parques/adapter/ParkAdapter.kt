package com.example.practica8_parques.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.practica8_parques.Parks
import com.example.practica8_parques.ParksProvider.Companion.PaksList
import com.example.practica8_parques.R

class ParkAdapter(paksList: List<Parks>) : RecyclerView.Adapter<ParksViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParksViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ParksViewHolder(layoutInflater.inflate(R.layout.item_parks,parent,false))
    }

    override fun onBindViewHolder(holder: ParksViewHolder, position: Int) {
        val item = PaksList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return PaksList.size
    }
}