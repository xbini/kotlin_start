package kotlin_start

import org.junit.jupiter.api.Assertions.assertEquals

import org.junit.jupiter.api.Test

class AppTest {
    @Test
    fun appHasAGreeting() {
        val classUnderTest = App()
        assertEquals(classUnderTest.hello(), "Hello, kotlin")
    }
}
