import org.junit.Assert
import org.junit.Test

/**
 * All of this has been inspired by Kotlin Koans
 *
 * Exercise 1 : Types, Declaration, Destructuring Declaration
 */
class Ex0Test {

    @Test fun testShouldReturn0Int() {
        Assert.assertEquals(shouldReturn0Int(), 0)
    }

    @Test fun testShouldReturn0OrNull() {
        Assert.assertEquals(shouldReturn0OrNull(false), 0)
        Assert.assertNull(shouldReturn0OrNull(true))
    }

    @Test fun testShouldReturnOK() {
        Assert.assertEquals("OK", shouldReturnOK())
    }

}
