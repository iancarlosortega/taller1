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

        //Algoritmo de ordenamiento
        metodoBurbuja()

        //Validador de cedula
        validarCedula()

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

        //Ordenar lista
        listadoEstudiantes = listadoEstudiantes.sorted()

        println("Listado completo de estudiantes:  $listadoEstudiantes")
        println("Grupo 1: $grupo1")
        println("Grupo 2: $grupo2")
        println("Grupo 3: $grupo3")

    }

    private fun presentarVehiculo() {

        var vehiculoEjemplo = Vehiculo( traccion = "4x4", motor = "Motor diesel", tipo = "carro", capacidad = 5  )
        vehiculoEjemplo.propiedades()

    }

    private fun metodoBurbuja() {

        var listaNumeros = arrayListOf<Int>(6,2,76,4,1,8,24,90,3)

        //Mostrar lista original
        println("Lista original: $listaNumeros")

        //Ordenamiento por metodo burbuja

        for ( i in (0 until listaNumeros.size - 1) ) {

            for ( j in (0 until listaNumeros.size - 1) ) {

                if ( listaNumeros[j+1] < listaNumeros[j] ){

                    var aux = listaNumeros[j+1]
                    listaNumeros[j+1] = listaNumeros[j]
                    listaNumeros[j] = aux

                }

            }

        }

        //Mostrar resultado
        println("Lista ordenada: $listaNumeros")

    }

    private fun validarCedula() {

        var cedula = "1104076797"
        //var cedula = "1150237046"
        //var cedula = "1104648496"
        //var cedula = "1150728036"
        //var cedula = "1104576797"
        var resultados = arrayListOf<Int>()
        var total = 0

        for( i in cedula.indices ){

            var resultado = 0

            if ( (i % 2) == 0 ){
                resultado = cedula[i].toString().toInt() * 2
            } else {
                resultado = cedula[i].toString().toInt() * 1
            }

            if ( resultado > 9 ) {
                resultado = numerosMayores(resultado)
            }

            resultados.add(resultado)

        }

        for ( i in (0 until resultados.size - 1) ) {
            total += resultados[i]
        }

        //Validar ultimo numero de cedula
        var ultimoNumero = resultados[resultados.lastIndex]
        var inmediatoSuperior = (Math.ceil(total/10.0) * 10).toInt()

        var resultadoComparar = inmediatoSuperior - total

        if( ultimoNumero == resultadoComparar ){
            println("El número de cédula $cedula es válido")
        } else {
            println("El número de cédula $cedula no es válido")
        }

    }

    private fun numerosMayores( numero: Int ): Int {

        var resultado = 0

        var numeroSeparado = numero.toString().split("") as ArrayList<String>
        numeroSeparado.removeFirst()
        numeroSeparado.removeLast()

        for ( numero in numeroSeparado ) {

            resultado += numero.toInt()

        }

        return resultado
    }
}