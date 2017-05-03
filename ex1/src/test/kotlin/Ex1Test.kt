import org.junit.Assert.*
import org.junit.Test

/**
 * All of this has been inspired by Kotlin Koans
 *
 * Exercise 1 : Classes, Data Classes, Object and companions
 */
class Ex1Test {

    @Test fun testClassSouldContainsIdAndName() {
        assertEquals(Player(1,"Player1").id, 1)
        assertEquals(Player(1,"Player1").name, "Player1")
    }

    @Test fun testClassShouldContainsEquals() {
        assertEquals(Player(1,"Player1"), Player(1, "Player1"))
    }

    @Test fun testGetMoveFromLetter() {
        assertEquals(Move.from("N"), Move.NORTH)
    }

}