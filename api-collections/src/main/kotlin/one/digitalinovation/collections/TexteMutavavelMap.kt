package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("joao", 2000.0, "CLT")
    val pedro = Funcionario("pedro", 1500.0, "PJ")
    val maria = Funcionario("maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome,joao)
    repositorio.create(pedro.nome,pedro)
    repositorio.create(maria.nome,maria)

    println(repositorio.findByID(joao.nome))

    //imprimir todos

    println (repositorio.findAll())

    repositorio.findAll().forEach { println(it) }

    // removendo um funcionario

    repositorio.remove(maria.nome)
    repositorio.findAll().forEach { println(it) }

}