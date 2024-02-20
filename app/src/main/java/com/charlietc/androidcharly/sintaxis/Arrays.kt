package com.charlietc.androidcharly.sintaxis

fun maing(){
    // Indice 0-6
    // Tamaño 7

    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

   // println(weekDays[4])
   // println(weekDays.get(6))

    for (i in weekDays){
        //println(i)
    }

    for ((position, value) in weekDays.withIndex()){
        println("la posición de $value es $position")
    }
}


fun main(){
    var total = 0
    var num = ""
    var num2 = ""
    while (true) {
        val userInput = readln()
        if (userInput == "x") break
        num += userInput.toString()

    }
    println(num)
}

