package com.charlietc.androidcharly.sintaxis

fun main(){
    mutableList()
}

fun mutableList(){
    val weekdays:MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    weekdays.add(1, "Liz❤️")
    println(weekdays)

    if(weekdays.isEmpty()){
        // no se
    }else{
        weekdays.forEach{ println(it) }
    }

    if (weekdays.isNotEmpty()){
        println("No esta vacia mira: $weekdays")
    }
}

fun inmutableList(){
    val weekdays:List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
    println(weekdays.size)
    println(weekdays)
    println(weekdays[5])
    println(weekdays.last())
    println(weekdays.first())

    // Filtrar

    val example = weekdays.filter {it.contains("u") }
    println(example)

    // Iterar
    weekdays.forEach{day -> println(day) }
}