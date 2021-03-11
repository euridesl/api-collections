package one.digitalinovation.collections

fun main(){

    val salarios = doubleArrayOf(100.00,2250.0,4000.0)

    for(salario in salarios){

        println(salario)
    }

    println("----------------------------------")


    println("Maior salario : " + salarios.maxOrNull ())
    println("Menor salario "+ salarios.minOrNull())
    println("Media salario :"+salarios.average())

    val salariosMaiorQue2500 = salarios.filter{ it > 2500.0 }
    println("----------------------------------")
    salariosMaiorQue2500.forEach{ println(it) }
    println("----------------------------------")
    //contar os elementos dentro de um ranger

    println(salarios.count{it in 2000.0..5000.0})

    //procurar  elementos dentro de um ranger
    // temos de tratar o null

    println(salarios.find{it == 100.0})
    //procurar qualquer elementos nao Array

    println(salarios.any{it == 100.0})


}