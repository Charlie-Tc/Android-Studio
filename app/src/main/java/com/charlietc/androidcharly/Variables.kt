package com.charlietc.androidcharly



fun main() {
    variablesNumericas()
    variablesAlfaNumericas()
    strings()
    variablesBooleanas()
    showNameAndAge("Charlie", 24)
    add(24, 12)
    val mysubtract:Int = subtract(2024, 1988)
    println(mysubtract)
}

fun showNameAndAge(currentName:String="Charly", currentAge:Int=23) {
    println("Hola me llamo es $currentName y tengo $currentAge años.")
}

fun add(firstNumber:Int, secondNumber:Int) {
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber


fun variablesNumericas() {
    /**
     * Variables Numéricas
     */

    // Int = valores enteros de  -2,147,483,647 a 2,147,483,647.
    val age: Int = 24

    // Long = valores grandes de -9,223,836,854,775,887 a -9,223,836,854,775,887.
    val example: Long = 32

    // Float = valores flotantes
    val floatExample: Float = 23.2f

    // Double = valores dobles.
    val doubleExample: Double = 349043.348
}

fun variablesAlfaNumericas() {
    /**
     * Variables Alfanuméricas
     */

    // Char
    val charExample1:Char = 'e'
    val charExample2:Char = '4'
    val charExample3:Char = '@'
}

fun strings() {
    // String
    val stringExample:String = "Charlie Tc Lol"
    val stringExample2:String = "Charlie"
    val stringExample3:String = "Tc"
    val stringExample4:String = "Lol"
}

fun variablesBooleanas(){
    /**
     * Variables Booleanas
     */

    // Boolean
    val booleanExample:Boolean = false
    val booleanExample2:Boolean = true
}
