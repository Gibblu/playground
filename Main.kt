fun main() {
    println("Welcome to the Kotlin Playground!")
    val test = Test()
}

class Test(val test1: String = "t1", val test2: String = "t2") {
    init {
        println("Test class initialized with values: $test1 and $test2")
    }
}