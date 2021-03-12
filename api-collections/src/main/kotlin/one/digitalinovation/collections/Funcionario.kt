package one.digitalinovation.collections

class Funcionario (
        val nome : String,
        val salario : Double,
        val TipoContratacao :String)
{

        //subscrever o toString
        override fun toString(): String ="""
        nome    : $nome    Salario : $salario 
    """.trimIndent()


}