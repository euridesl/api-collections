package one.digitalinovation.collections

fun main(){
    //inicializa um array ja com os valores
   val values = intArrayOf(2,3,4,1,10,12)

    //formas de interar e a mesma de um array
    values.sort()
    values.forEach {
        print("$it ")
    }


}