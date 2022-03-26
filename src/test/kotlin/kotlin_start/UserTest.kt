package kotlin_start

import kotlin_start.modle.User
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UserTest {
  @Test
  fun shouldSayHello() {
    val person = User()
    assertEquals(person.hello(), "Hello, kotlin")
  }
}
