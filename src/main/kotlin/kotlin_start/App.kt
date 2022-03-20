package kotlin_start

class App {
    private val greeting: String = "Hello, "
    private val name: String = "kotlin"
    fun hello(): String {
        return greeting + name
    }
}

fun main() {
    val app = App()
    println(app.hello())
}
