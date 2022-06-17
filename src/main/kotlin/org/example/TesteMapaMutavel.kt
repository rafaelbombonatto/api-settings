package org.example

fun main() {
    val joao = Funcionario("João",1800.00, "CLT")
    val pedro = Funcionario("Pedro",2300.00, "CLT")
    val maria = Funcionario("Maria",1500.00, "PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println("--- Exidindo o repositorio cujo id seja joao.nome")
    println(repositorio.findById(joao.nome))

    println("--- Exidindo o repositorio completo")
    repositorio.findAll().forEach{println(it)}

    println("--- Exidindo o repositorio excluindo maria")
    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{println(it)}
}