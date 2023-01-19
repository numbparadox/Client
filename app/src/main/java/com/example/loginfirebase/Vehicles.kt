package com.example.loginfirebase

var vehicleList = mutableListOf<Vehicles>()

class Vehicles(
    var cover: Int,
    var titlename: String,
    var vendors: String,
    var id: Int? = vehicleList.size
)