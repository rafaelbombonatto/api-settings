package org.example

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("--- Exibindo soma de somatoria ---")
    println(salarios.somatoria())
    println("--- Exibindo media de somatoria ---")
    println(salarios.media())
}