package one.digitalinovation.collections
fun main ()
{
    val salarios = DoubleArray(3)

    salarios[0] = 1000.0
    salarios[1] = 1020.0
    salarios[2] = 1200.0
    //imprimi valor salario
    salarios.forEach { print("$it ") }
    //acrescenta 10%
    salarios.forEachIndexed { index, d ->  salarios[index]=d*1.1 }
    //imprimi valor salario
    salarios.forEach { print("$it ") }
    println("---------------------------------")
    //outra forma de se popular um array
    val salario2 = doubleArrayOf(900.0,456.0,45633.9)
    salario2.forEach { println("$it ") }
    salario2.forEachIndexed { index, d ->  salario2[index]=d*1.1 }
    //imprimi valor salario

    salario2.sort()
    salario2.forEach{println("$it ")}
}