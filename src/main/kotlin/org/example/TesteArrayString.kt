package org.exa

fun main() {
    val nomes = Array(3){""}

    nomes[0] = "Joao"
    nomes[1] = "Maria"
    nomes[2] = "Alberto"

    println("--- Exibindo nomes do array através de um for convencional ---")
    for (nome in nomes){
        println("Nome: $nome")
    }
    println("--- Exibindo nomes do array através de um forEach, usando o it ---")
    nomes.forEach {
        println("Nome: $it")
    }

    println("--- Exibindo nomes do array através de um forEach, designando a variavel nome ---")
    nomes.forEach {nome ->
        println("Nome: $nome")
    }

    println("--- Exibindo nomes do array através de um forEach, ordenando os nomes ---")
    nomes.sort()
    nomes.forEach {
        println("Nome: $it")
    }


    val nomes2 = arrayOf("José","Ricardo","Zuleide")
    println("--- Exibindo nomes do array através de um forEach, ordenando os nomes ---")
    nomes2.sort()
    nomes2.forEach { println("Valor: $it") }

}