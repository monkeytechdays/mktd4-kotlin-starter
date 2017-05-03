import org.junit.Assert
import org.junit.Test
import util.Player

/**
 * Exercise 2 : Fields, Properties, Lazy, Delegate
 */

class Ex2Test {

    @Test fun testShouldInitializeMutableProperty() {
        Assert.assertEquals(3, shouldInitializeMutableProperty())
    }

    @Test fun testShouldInitializeImmutableProperty() {
        Assert.assertEquals(2, shouldInitializeImmutableProperty())
    }

    @Test fun testShouldAddCustomGetterAndSetters() {
        val position = Position(1, 2)
        position.posX = 3
        // position.posY = 3 won't compile
        Assert.assertEquals(position.posX, 3)

        position.posX = -1
        Assert.assertEquals(position.posX, 0)

        Assert.assertEquals(Position(0, -1).posY, -1)
    }

    @Test fun testShouldCustomEquals() {
        val position = Position(1, 2)
        position.posX = 3
        Assert.assertEquals("Position are not equals", position, Position(3, 2))
    }

    @Test fun testShouldReturnPairOfIdAndName(){
        Assert.assertEquals(Pair(1, "Player 1"), shouldReturnPairOfIdAndName(Player(1, "Player 1")))
    }
}