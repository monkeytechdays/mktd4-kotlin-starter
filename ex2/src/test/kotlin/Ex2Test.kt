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

    @Test fun testShouldAddCustomSetter() {
        val position = Position(1, 2)
        position.posX = 3
        Assert.assertEquals(position.posX, 3)
    }

    @Test fun testShouldAddCustomSetterNegative() {
        val position = Position(1, 2)
        position.posX = -2
        Assert.assertEquals(position.posX, 0)
    }

    @Test fun testShouldAddCustomGetter() {
        val position = Position(1, 2)
        Assert.assertEquals(position.posY, 2)
    }

    @Test fun testShouldAddCustomGetterNegative() {
        val position = Position(1, -2)
        Assert.assertEquals(position.posY, 0)
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