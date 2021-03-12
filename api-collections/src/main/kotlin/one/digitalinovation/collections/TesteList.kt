package one.digitalinovation.collections

fun main() {
    val joao = Funcionario("joao", 2000.0 ,"clt")
    val pedro = Funcionario("pedro", 3000.0,"PJ")
    val maria = Funcionario("maria", 1000.0,"PJ")

 val funcionarios = listOf(joao,pedro,maria)

    funcionarios.forEach{ println(it)}
    // buscando somente maria
println("---------------------------------------------")
    println(funcionarios.find {it.nome == "maria"})
println("------------------------------------")
    //ordenando com sortby e terminando comforech para impressao

    funcionarios

        .groupBy { it.TipoContratacao }
        .forEach { println(it) }


    }


