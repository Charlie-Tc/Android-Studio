package com.charlietc.androidcharly.sintaxis

fun main() {
    getMeses(12)
}

fun getMeses(month:Int){
    if (month == 1){
        println("Enero")
    }else if (month == 2){
        println("Febrero")
    }else if (month == 3){
        println("Marzo")
    }else if (month == 4){
        println("Abril")
    }else if (month == 5){
        println("Mayo")
    }else if (month == 6){
        println("Junio")
    }else if (month == 7){
        println("Julio")
    }else if (month == 8){
        println("Agosto")
    }else if (month == 9){
        println("Setiembre")
    }else if (month == 10){
        println("Octubre")
    }else if (month == 11){
        println("Noviembre")
    }else if (month == 12){
        println("Diciembre")
    }else{
        println("El mes no existe.")
    }
}

fun ifAnidado(){
    val animal = "bird"

    if (animal == "dog") {
        println("Es un perrito🐶")
    }else if (animal == "cat") {
        println("Es un gatito😺")
    }else if (animal == "bird") {
        println("Es un pajarito🐦")
    }else {
        println("No es un animal esperado🥺")
    }
}

fun ifBasico() {
    val name = "charlie"
    if(name == "pepe"){
        println("Oye, la variable name es Charlie")
    }else {
        println("Este no es Charlie")
    }
}