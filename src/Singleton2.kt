
class lo{
    init {
        println("hi ")
    }
    object Singleton {

        init{
            println("lool-aladimi")
        }

        var name="Kotlin Objects"


        fun printName(){
            println(name)
        }
    }
}

fun main(args: Array<String>) {
    var a=lo()

}