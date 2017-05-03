import org.junit.Assert
import org.junit.Test
import util.Move

class Ex9Test {

    @Test fun testFindMove() {
         Assert.assertEquals(Move.NORTH, findMoveUsingInt(0))
         Assert.assertEquals(Move.SOUTH, findMoveUsingInt(1))
         Assert.assertEquals(Move.SOUTH, findMoveUsingInt(2))
         Assert.assertEquals(Move.WEST, findMoveUsingInt(3))
         Assert.assertEquals(Move.EAST, findMoveUsingInt(4))
         Assert.assertEquals(Move.NONE, findMoveUsingInt(5))
         Assert.assertEquals(Move.NONE, findMoveUsingInt(6))
         Assert.assertNull(findMoveUsingInt(7))
     }

    @Test fun testNum() {
        Assert.assertEquals("'eval' on Num should work:", 2, eval(Num(2)))
    }

    @Test fun testSum() {
        Assert.assertEquals("'eval' on Sum should work:", 3, eval(Sum(Num(2), Num(1))))
    }

    @Test fun testRecursion() {
        Assert.assertEquals("'eval' should work:", 6, eval(Sum(Sum(Num(1), Num(2)), Num(3))))
    }
}