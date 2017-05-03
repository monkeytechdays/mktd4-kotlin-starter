import org.junit.Assert
import org.junit.Test
import util.Player

class Exo4Test {

    @Test
    fun shouldReturnLorem(){
        Assert.assertEquals("Not a valid text", getLoremIpsum().trimMargin(), "Lorem ipsum dolor sit amet, consectetur adipiscing elit.\n" +
                "Sed non risus.\n" +
                "Suspendisse lectus tortor, dignissim sit amet, adipiscing nec, ultricies sed, dolor.")
    }

    @Test
    fun shouldReturnPlayerScore(){
        Assert.assertEquals("Not the same text", getPlayerScoreAsString(Player(1, "John", 10)), "The score for John is 10")
    }
}