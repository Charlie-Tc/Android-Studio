package com.charlietc.androidcharly.exercises

/** por lo general, el teléfono te proporciona un resumen de los notificaciones.
 *
 * En el código inicial que se proporciona en el siguiente fragmento de código,
 * escribe un programa que imprima el mensaje de resumen según la cantidad de
 * notificaciones que recibiste. El mensaje debe incluir lo siguiente:
 *
 * la cantidad exacta de notificaciones cuando haya menos de 100
 * 99+ como cantidad de notificaciones cuando haya 100 o más
 */

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int){

    // SOLUTION 1
    if (numberOfMessages >= 100){
        println("your phone is blowing up! You have 99+ notifications.")
    }else{
        println("you have $numberOfMessages notifications.")
    }

    // SOLUTION 2
    when(numberOfMessages){
        in 1..99 -> println("you have $numberOfMessages notifications.")
        else -> println("your phone is blowing up! You have 99+ notifications.")
    }
}