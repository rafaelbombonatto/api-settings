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

    println("--- Exibindo quantidade de salarios entre de 150.0 e 300.0 ---")
    println(salarios.count(){it in 150.00..300.00})

    println("--- Exibindo um salario especifico dentro do array ---")
    println(salarios.find(){it == 200.00})

    println("--- Exibindo um salario que não existe dentro do array ---")
    println(salarios.find(){it == 50.00})

    println("--- Exibindo se existe um salario de 200.00 dentro do array ---")
    println(salarios.any(){it == 200.00})


}