import util.Position
import util.isValid

/**
 * Exercise 13: Inline and reified
 *
 * Read about <a href="https://kotlinlang.org/docs/reference/inline-functions.html">Inline function and Reified Type</a>
 *
 */

/**
  * Remember the latest task for Ex8.
 *  Write an inline function "then" and use it to complete the function isThereMoreValidThanInvalid using a single Line
 *
 */
 
 // inline fun ... then(...) = ...
fun isThereMoreValidThanInvalid(vararg positions: Position) = 
  positions.partition { it.isValid() }.then { TODO() }


/**
 * BTW, "then" function is already there in kotlin, his name is let
 *
 * You know that in Java it is not easy to get the generic parameter type of a class.
 * In Kotlin the keyword reified do it for you
 * Write a function "isDataType" that return true if the calling type is a data type
 * @see <a ref="http://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/is-data.html">isData</a>
 */







