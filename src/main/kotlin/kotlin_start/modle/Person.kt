package kotlin_start.modle

import org.springframework.stereotype.Component

@Component
class Person {
  private val greeting: String = "Hello, "
  private val name: String = "kotlin"
  fun hello(): String {
    return greeting + name
  }
}
