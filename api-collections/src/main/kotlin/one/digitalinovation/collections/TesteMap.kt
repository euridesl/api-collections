package one.digitalinovation.collections

import java.time.Year

fun main() {
    val pair:Pair<String,Double> = Pair("joao",1000.0)
    val map1= mapOf(pair)

    map1.forEach{(k,y)-> println("chave =  $k valor = $y")}
//outra forma de criar um map

    val map2 = mapOf("pedro" to 2500.0,"maria" to 3000.0)
    map2.forEach{(k,y)->println("nova chvave $k e novo valor $y")}
}