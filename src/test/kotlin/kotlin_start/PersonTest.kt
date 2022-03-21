package kotlin_start

import kotlin_start.modle.Person
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PersonTest {
  @Test
  fun shoudSayHello() {
    val person = Person()
    assertEquals(person.hello(), "Hello, kotlin")
  }
}