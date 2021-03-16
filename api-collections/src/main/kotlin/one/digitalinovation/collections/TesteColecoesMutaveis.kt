package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("joao", 2000.0, "CLT")
    val pedro = Funcionario("pedro", 1500.0, "PJ")
    val maria = Funcionario("maria", 4000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach { println(it) }

    println("------------------------------")

    funcionarios.add(pedro)
    funcionarios.forEach { println(it) }

    println("------------------------------")
    funcionarios.remove(joao)
    funcionarios.forEach { println(it) }
    funcionarios.add (maria)

    println("----------Set--------------------")
    val funcionariosSet = mutableSetOf(joao)
    funcionariosSet.forEach { println(it) }

    println("----------Set- add-------------------")

    funcionariosSet.add (maria)
    funcionariosSet.forEach { println(it) }

}