package com.example.myapplication

class Vehiculo( val traccion: String, val motor: String, val tipo: String, val capacidad: Int) {

    fun propiedades() {
        println("Propiedades del vehículo\nTracción: $traccion\nMotor: $motor\nTipo de vehículo: $tipo\nCapacidad: $capacidad")
    }

}