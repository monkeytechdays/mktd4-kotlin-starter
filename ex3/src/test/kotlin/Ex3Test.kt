import org.junit.Assert
import org.junit.Test
import util.Player


/**
 * Exercise 3 : Nullable & Safe Cast
 */
class Ex3Test {

    @Test fun scoreShouldBe0ForNullPlayer() {
        Assert.assertEquals("Score is not equal to 0", 0, getPlayerScoreUsingIf(null))
        Assert.assertEquals("Score is not equal to 0", 0, getPlayerScoreUsingElvis(null))
    }

    @Test fun scoreShouldBe0ForNullScore() {
        Assert.assertEquals("Score is not equal to 0", 0, getPlayerScoreUsingIf(Player(1, "Player 1", null)))
        Assert.assertEquals("Score is not equal to 0", 0, getPlayerScoreUsingElvis(Player(1, "Player 1", null)))
    }

    @Test fun scoreShouldBe1For() {
        Assert.assertEquals("Score is not equal to 1", 1, getPlayerScoreUsingIf(Player(1, "Player 1", 1)))
        Assert.assertEquals("Score is not equal to 1", 1, getPlayerScoreUsingElvis(Player(1, "Player 1", 1)))
        Assert.assertEquals("Score is not equal to 1", 1, trustMeAndReturnScore(Player(1, "Player 1", 1)))
    }

    @Test(expected =NullPointerException::class)
    fun shouldEndWithNPE(){
        trustMeAndReturnScore(null)
    }

    @Test
    fun shouldCastAnyValueAsInt(){
        Assert.assertEquals("The result is not an Int", 0, anyToInt("Text"))
        Assert.assertEquals("The result is not an Int", 0, anyToInt(null))
        Assert.assertEquals("The result is not an Int", 10, anyToInt(10))
    }
}


