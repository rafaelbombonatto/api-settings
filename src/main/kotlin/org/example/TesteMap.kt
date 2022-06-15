package org.example

fun main() {
    val pair: Pair<String, Double> = Pair("joão", 1000.0)
    val map1 = mapOf(pair)

    println("--- Exibindo Chaves e valores de um mapa iniciado ---")
    map1.forEach{ (k,v) -> println("chave: $k - valor $v")}

    val map2 = mapOf(
        "Pedro" to 150.0,
        "Maria" to 1300.0
    )
    println("--- Exibindo Chaves e valores de um mapa com multiplos itens ---")
    map2.forEach{ (k,v) -> println("chave: $k - valor $v")}
}