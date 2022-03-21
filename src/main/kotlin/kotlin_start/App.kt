package kotlin_start

import kotlin_start.modle.Person
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class App(private val person: Person) : CommandLineRunner {
  override fun run(vararg args: String?) {
    println(this.person.hello())
  }
}
