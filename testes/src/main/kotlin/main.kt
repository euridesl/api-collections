fun main(args: Array<String>) {
    //insira as varies corretamente
    var r = 0
    for (i in 1..readLine()!!.toInt()) {

        println("i ${ i * i  } ${ i * i *i}")

        r += 1
    }
}