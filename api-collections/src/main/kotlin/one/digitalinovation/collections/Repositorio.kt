package one.digitalinovation.collections

class Repositorio <T>{
    private val map = mutableMapOf<String, T>()

    fun create(id:String ,value:T){
        map[id]=value

    }

     fun findByID(id:String )= map[id]
}