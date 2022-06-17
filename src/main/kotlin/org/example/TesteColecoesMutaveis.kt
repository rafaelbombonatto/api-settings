package org.example

fun main() {
    val joao = Funcionario("João",1800.00, "CLT")
    val pedro = Funcionario("Pedro",2300.00, "CLT")
    val maria = Funcionario("Maria",1500.00, "PJ")

    val funcionarios = mutableListOf(joao, maria)
    println("--- Exibindo lista mutavel com joao e maria ---")
    funcionarios.forEach{println(it)}

    funcionarios.add(pedro)
    println("--- Exibindo lista mutavel com pedro adicionado ---")
    funcionarios.forEach{println(it)}

    funcionarios.remove(joao)
    println("--- Exibindo lista mutavel com joao retirado ---")
    funcionarios.forEach{println(it)}

    println("--- Exibindo lista mutavel com joao, via SET ---")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach{println(it)}

    println("--- Exibindo lista mutavel com pedro e maria adicionados ---")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach{println(it)}


    funcionarioSet.remove(maria)
    println("--- Exibindo lista mutavel com maria retirada ---")
    funcionarioSet.forEach{println(it)}
    }