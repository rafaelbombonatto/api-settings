package org.example

fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.00
    salarios[1] = 250.90
    salarios[2] = 399.99
    println("--- Exibindo nomes do array através de um forEach ---")
    salarios.forEach { println("Salario: $it") }

    salarios.forEachIndexed() {
        index, salario ->
        salarios[index] = salario * 1.1    }

    println("--- Exibindo nomes do array através de um forEach, após aumento de 10% ---")
    salarios.forEach { println("Salario: $it") }

    println("--- Exibindo nomes do array através de um forEach ---")
    val salarios2 = doubleArrayOf(1500.0, 254.98, 13.99)
    salarios2.sort()
    salarios2.forEach { println("Salario2: $it") }
}