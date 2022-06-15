package org.example

fun main() {
    val values = IntArray(5)

    values[0] = 8
    values[1] = 4
    values[2] = 1
    values[3] = 3
    values[4] = 9

    println("--- Exibindo Array através de um for convencional ---")
    for (valor in values){
     println("Valor: $valor")
    }

    println("--- Exibindo Array através do forEach do array, usando o it ---")
    values.forEach {
        println("Valor: $it")
    }

    println("--- Exibindo Array através do forEach do array, designando uma variável ---")
    values.forEach {valor ->
        println("Valor: $valor")
    }

    println("--- Exibindo Array através do indice  ---")
    for (index in values.indices){
        println("Valor no indice $index: ${values[index]}")
    }

    println("--- Exibindo Array, ordenando os valores  ---")
    values.sort()
    for (value in values){
        println("Valor: $value")
    }

}