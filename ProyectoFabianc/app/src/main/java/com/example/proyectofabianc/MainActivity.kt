package com.example.proyectofabianc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    companion object{
        const val moneda = "EURO"
    }
    var saldo : Float = 500.65f
    var sueldo: Float = 5362f
    var entero: Int = 55


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fecha = "07/01/1994"
        var nombre: String = "fabian"
        var vip: Boolean = false

        var saludo = "Hola " + nombre

        println(saludo)

        var a:Int = 5 + 5 // 10
        val b:Int = 10 - 2 // 8
        val c:Int = 3 * 4 // 12
        val d:Int = 10 / 5 // 2
        val e:Int = 10 % 3 // 1, no se puede dividir, se queda con el resto
        val f:Int = 10 / 6 // 1, division infinita, solo se mantiene la parte entera

        var aPreIncremento: Int = 5
        var bPreDecremento: Int = 5
        var cPostIncremento: Int = 5
        var dPostDecremento: Int = 5

        println(aPreIncremento)
        println(++aPreIncremento) // incrementa primero, luego regresa. salida: 6
        println(aPreIncremento)












    }


}