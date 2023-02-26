package com.example.loginfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.loginfirebase.databinding.ActivityDetailactivityBinding

class Detailactivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val vehicleID = intent.getIntExtra(vehicle_extra,-1)
        val vehicle = vehicleFromId(vehicleID)
        if (vehicle != null)
        {
            binding.cover.setImageResource(vehicle.cover)
            binding.titleplaceholder.text = vehicle.titlename
            binding.availablevendor.text = vehicle.vendors
        }
    }

    private fun vehicleFromId(vehicleID:Int): Vehicles?
    {
        for (vehicle in vehicleList) {
            if (vehicle.id == vehicleID)
                return vehicle
        }
        return null
    }
}