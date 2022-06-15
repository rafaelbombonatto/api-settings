package org.example

fun main() {
    val joao = Funcionario("João",1800.00, "CLT")
    val pedro = Funcionario("Pedro",2300.00, "CLT")
    val maria = Funcionario("Maria",1500.00, "PJ")

    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    val resultUnion = funcionarios1.union(funcionarios2)
    println("--- Exibindo o resultado de união de listas ---")
    resultUnion.forEach{ println(it)}

    val funcionarios3 = setOf(joao, maria, pedro)
    val resultSubtract = funcionarios3.subtract(funcionarios2)
    println("--- Exibindo o resultado de subtração de um valor de listas ---")
    resultSubtract.forEach{ println(it)}

    val resultIntersect = funcionarios3.intersect(funcionarios2)
    println("--- Exibindo o resultado de interseção entre listas ---")
    resultIntersect.forEach{ println(it)}
}