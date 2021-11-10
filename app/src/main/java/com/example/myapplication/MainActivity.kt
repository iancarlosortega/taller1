package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Pregunta 1
        validarEdad()

        //Pregunta 2
        tablaMultiplicar()

        //Pregunta 3
        listadoParalelo()

        //Pregunta 4
        presentarVehiculo()

    }

    private fun validarEdad(){

        var edad = 19

        if ( edad >= 18 ){
            println("La persona es mayor de edad.")
        } else {
            println("La persona es menor de edad")
        }

    }

    private fun tablaMultiplicar(){

        var numero = 2
        var limite = 10
        var resultados = arrayListOf<Int>()

        for ( i in 0..limite ) {
            var resultado = numero * i
            resultados.add(resultado)
        }

        println("Resultados ascendentes: " + resultados)

        //Ordenar de manera descendente
        resultados.sortDescending()

        println("Resultados descendentes: " + resultados)
    }

    private fun listadoParalelo() {

        var grupo1 = arrayListOf<String>("Ian Carlos Ortega","Israel Tapia", "Joan Brinceño")
        var grupo2 = arrayListOf<String>("Luis Quishpe","David Pilco","Brandon Vega")
        var grupo3 = arrayListOf<String>("Santiago Garcia", "Jeferson Cueva","Frank Saca")

        //Juntar todos los grupos
        var listadoEstudiantes = grupo1 + grupo2 + grupo3

        println("Listado completo de estudiantes:  $listadoEstudiantes")
        println("Grupo 1: $grupo1")
        println("Grupo 2: $grupo2")
        println("Grupo 3: $grupo3")

    }

    private fun presentarVehiculo() {

        var vehiculoEjemplo = Vehiculo( traccion = "4x4", motor = "Motor diesel", tipo = "carro", capacidad = 5  )
        vehiculoEjemplo.propiedades()

    }
}