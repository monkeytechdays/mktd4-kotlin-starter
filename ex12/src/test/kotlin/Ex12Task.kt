/**
 * Exercise 12: Exceptions and type Alias
 *
 * Read about <a href="https://kotlinlang.org/docs/reference/exceptions.html">Exceptions</a>
 *
 */

/**
 * Consider this Exception and that TypeAlias
 */
class FormatException(message: String) : Exception(message)
typealias NANException = FormatException

/**
 * If toInt() fail should throw a FormatException (or a NANException)
 */
fun parseInt(value: String): Int =
        try { 
                value.toInt() 
        } catch (e: /*TODO*/) { 
                /*TODO*/ 
        }


/**
 * Create the expected exception
 * function divide should compile
 */
fun divide(a:Int, b: Int):Int = if (b == 0) notANumber() else a/b
fun notANumber() : /*TODO*/ = throw /**/("Not a number")



