package one.digitalinovation.collections


    fun main(){
        val values = IntArray(5)
        values [0] = 1
        values [1] = 7
        values [2] = 6
        values [3] = 3
        values [4] = 2

    for(valor in values) {
        print("$valor ")
    }
//com recursos de lambda
        values.forEach {
            println(it)
        }
        //outra forma de iterar
        values.forEach {  valor  ->
            println(valor)}


        //iterar pelo indice ordenado
values.sort()
        for ( indi in values.indices) {
            println( values[indi])
        }
    }
