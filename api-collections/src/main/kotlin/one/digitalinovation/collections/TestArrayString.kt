package one.digitalinovation.collections

fun main(){
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Zaza"
    nomes[2] = "José"

    //iterando
nomes.sort()
    nomes.forEach {
        print("$it ")
    }
//podemos declarar tambem por ArrayOf

    val nome2 = arrayOf(
        "Maria",
        "Zaza",
        "José"
    )
    nome2.sort()
    println("arrayOf")
    nome2.forEach {
        print(" $it ")
    }

}