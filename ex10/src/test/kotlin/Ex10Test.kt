import org.junit.Assert
import org.junit.Test
import util.Position

class Ex10Test {

    @Test
    fun testPositionIsValid() {
        Assert.assertTrue(Position(0, 0).isValid())
        Assert.assertFalse(Position(-1, 0).isValid())
        Assert.assertFalse(Position(0, -1).isValid())
    }

}

