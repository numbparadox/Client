package com.example.loginfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.loginfirebase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        populateVehicles()

        val mainActivity = this
        binding.recyclerview.apply {
            layoutManager = GridLayoutManager(applicationContext, 1)
            adapter = CardAdapter(vehicleList)
        }

    }

    private fun populateVehicles() {
        val vehicle1 = Vehicles(
            R.drawable.splendor,
            "Splendor",
            "Available 2"
        )
        vehicleList.add(vehicle1)

        val vehicle2 = Vehicles(
            R.drawable.duke,
            "Duke",
            "Available 2"
        )
        vehicleList.add(vehicle2)

        val vehicle3 = Vehicles(
            R.drawable.enfield,
            "Royal Enfield",
            "Available 2"
        )
        vehicleList.add(vehicle3)

        vehicleList.add(vehicle1)
        vehicleList.add(vehicle2)
        vehicleList.add(vehicle3)
    }
}
