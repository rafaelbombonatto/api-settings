package org.example

fun main() {
    val values = intArrayOf(1,7,8,2,78,12,15)

    println("--- Exibindo Array através do forEach do array, usando o it ---")
    values.forEach {
        println("Valor: $it")
    }

    println("--- Exibindo Array através do forEach do array, ordenando os valores  ---")
    values.sort()
    values.forEach {
        println("Valor: $it")
    }
}