package com.charlietc.androidcharly.sintaxis

fun main() {
    result(7)
    getBimestre(2)
}

fun result(value:Any){
    when(value){
        is Int -> value + value
        is String -> println(value)
        is Boolean -> if(value) println("cute")
    }
}

fun getBimestre(month:Int) = when(month) {
    in 1..6 -> "primer bimestre"
    in 7..12 -> "segundo bimestre"
    !in 1..12 -> "bimestre no válido"
    else -> "no"
    }

fun getTrimestre(month:Int){
    when(month) {
        1, 2, 3 -> println("primer trimestre")
        4, 5, 6 -> println("segundo trimestre")
        7, 8, 9 -> println("tercer trimestre")
        10, 11, 12 -> println("cuarto trimestre")
        else -> println("trimestre no válido")
        }
}

fun getMoth(month:Int){
    when(month){
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9 -> println("Setiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("Ese mes no existe")
    }
}