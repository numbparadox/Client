package com.example.loginfirebase

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.loginfirebase.databinding.CardcellBinding

class CardAdapter(private val vehicle: List<Vehicles>,
                  private val clickListener: vehicleclicklistener)
    :RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardcellBinding.inflate(from, parent, false)
        return CardViewHolder(binding , clickListener)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindvehicle(vehicle[position])
    }

    override fun getItemCount(): Int = vehicle.size
}