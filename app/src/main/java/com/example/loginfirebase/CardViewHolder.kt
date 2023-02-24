package com.example.loginfirebase

import androidx.recyclerview.widget.RecyclerView
import com.example.loginfirebase.databinding.CardcellBinding

class CardViewHolder(
    private val cardcellBinding: CardcellBinding,
    private val clickListener: vehicleclicklistener
    ) :RecyclerView.ViewHolder(cardcellBinding.root) {
    fun bindvehicle(vehicles: Vehicles)
    {
        cardcellBinding.cover.setImageResource(vehicles.cover)
        cardcellBinding.availablevendor.text = vehicles.vendors
        cardcellBinding.title.text = vehicles.titlename

        cardcellBinding.cardView.setOnClickListener {
            clickListener.onClick(vehicles)
        }
    }
}