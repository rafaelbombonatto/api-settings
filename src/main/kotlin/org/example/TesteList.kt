package org.example

fun main() {
    val joao = Funcionario("João",1000.00)
    val pedro = Funcionario("Pedro",1300.00)
    val maria = Funcionario("Maria",1500.00)

    val funcionarios = listOf(joao, pedro, maria)

    println("--- Exibindo lista de funcionarios ---")
    funcionarios.forEach{println(it)}

    println("--- Exibindo lista de funcionarios com nome Maria ---")
    println(funcionarios.find { it.nome == "Maria" } )

}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String =
        """
            Nome: $nome
            Salário: $salario
        """.trimIndent()
}