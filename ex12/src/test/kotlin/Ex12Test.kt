import org.junit.Assert
import org.junit.Test

class Ex12Test {

    @Test
    fun testIntParsing(){
        Assert.assertEquals(1, parseInt("1"))
    }

    @Test(expected = NANException::class)
    fun testIntParsingShouldFailWithLetter(){
        Assert.assertEquals(-1, parseInt("e"))
    }
  }