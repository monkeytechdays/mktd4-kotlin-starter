import org.junit.Assert
import org.junit.Test
import util.Position

class Ex13Test {

    @Test fun testIsThereMoreValidThanInvalid() {
        Assert.assertTrue(isThereMoreValidThanInvalid(Position(1, 2), Position(0, 0), Position(-1, 2)))
        Assert.assertFalse(isThereMoreValidThanInvalid(Position(1, 2), Position(0, -1), Position(-1, 2)))
    }

    data class TEST13(val a: Int)
    class Test131

    @Test fun testCompanion() {
        Assert.assertFalse(Test131().isDataType())
        Assert.assertTrue(Ex13Test.TEST13(1).isDataType())
    }
}
