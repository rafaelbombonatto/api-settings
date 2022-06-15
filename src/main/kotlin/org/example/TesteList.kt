package org.example

fun main() {
    val joao = Funcionario("João",1800.00, "CLT")
    val pedro = Funcionario("Pedro",2300.00, "CLT")
    val maria = Funcionario("Maria",1500.00, "PJ")

    val funcionarios = listOf(joao, pedro, maria)

    println("--- Exibindo lista de funcionarios ---")
    funcionarios.forEach{println(it)}

    println("--- Exibindo lista de funcionarios com nome Maria ---")
    println(funcionarios.find { it.nome == "Maria" } )

    println("--- Exibindo lista de funcionarios reordenando por salario ---")
   funcionarios.sortedBy { it.salario }.forEach{println(it)}

    println("--- Exibindo lista de funcionarios agrupando por tipoContrato---")
    funcionarios.groupBy { it.tipoContrato }.forEach{println(it)}


}


