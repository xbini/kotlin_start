package kotlin_start

import kotlin_start.modle.User
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class App(private val person: User) : CommandLineRunner {
  override fun run(vararg args: String?) {
    println(this.person.hello())
  }
}
