import org.junit.Assert
import org.junit.Test
import util.Move
import util.Position

class Ex11Test {

    @Test
    fun testAddMoveToPosition(){
        Assert.assertEquals(Position(0,1), Position(0,0) + Move.SOUTH)
    }
}

