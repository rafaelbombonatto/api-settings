package org.example

fun main() {
    val salarios = doubleArrayOf(100.00, 200.0, 300.0)

    println("--- Exibindo salarios do array através de um for convencional ---")
    for (salario in salarios)
    {
        println("Salario: $salario")
    }

    println("--- Exibindo maior salario ---")
    println("Maior Salario: ${salarios.max()}")

    println("--- Exibindo menor salario ---")
    println("Menor Salario: ${salarios.min()}")

    println("--- Exibindo media de salario ---")
    println("Média Salario: ${salarios.average()}")

    val salariosAcima150 = salarios.filter {
        it > 150.0
    }

    println("--- Exibindo salarios acima de 150.0 ---")
    for (salario in salariosAcima150)
    {
        println("Salario: $salario")
    }

}