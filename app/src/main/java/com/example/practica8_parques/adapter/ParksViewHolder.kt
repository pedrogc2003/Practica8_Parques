package com.example.practica8_parques.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.practica8_parques.Parks
import com.example.practica8_parques.databinding.ItemParksBinding

class ParksViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemParksBinding.bind(view)
    fun render(ParkModel: Parks){
        binding.Nombre.text = ParkModel.nombre
        binding.Descripcion.text = ParkModel.descripcion
        Glide.with(binding.ImagePark.context).load(ParkModel.foto).into(binding.ImagePark)
        binding.ImagePark.setOnClickListener{Toast.makeText(binding.ImagePark.context,ParkModel.nombre,Toast.LENGTH_LONG).show()}
        itemView.setOnClickListener{Toast.makeText(binding.ImagePark.context,ParkModel.nombre,Toast.LENGTH_LONG).show()}
    }
}