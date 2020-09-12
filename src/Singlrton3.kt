

class lol{

    companion object SingletonA{
        init {
            println("SingletonA class invoked")
        }
        var name="Kotlin Objects A"


        fun printName(){
            println(name)
        }
    }
    init {
        println("class init method")
    }
    object SingletonB {

        init{
            println("SingletonB class invoked")
        }

        var name="Kotlin Objects B"


        fun printName(){
            println(name)
        }


    }
}


fun main(args: Array<String>) {
    var a=lol()

    lol.name="kotlin tutorials "

    lol.printName()

}