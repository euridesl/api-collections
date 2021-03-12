package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("joao", 2000.0, "clt")
    val pedro = Funcionario("pedro", 3000.0, "PJ")
    val maria = Funcionario("maria", 1000.0, "PJ")
//atribuindo funcionario a funcionarios1 e funcionarios 2
    var funcionarios1 = setOf(joao,pedro)
    val funcionarios2 = setOf(maria)
    //juntando funcionarios1 e funcionarios2
    val funcionarios = funcionarios1.union(funcionarios2)


    funcionarios.forEach{println (it)}
println("---------subtrair funcionario - funcionario2")
//subtraindo um objeto de outro  fun subtract
    var resultado = funcionarios.subtract(
        funcionarios2 )
    resultado.forEach { println(it) }


    println("-------Intersect--------- ")
    resultado = funcionarios.intersect(funcionarios2)
    resultado.forEach{println(it)}

}