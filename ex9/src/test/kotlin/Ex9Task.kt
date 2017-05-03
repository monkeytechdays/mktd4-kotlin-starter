import util.Move

/**
 * Exercise 9: Pattern matching & Smart Cast
 *
 * Read about <a href="https://kotlinlang.org/docs/reference/control-flow.html#when-expression">Control flow</a>
 */


/**
 * Using when expression return,
 * 0->NORTH,
 * 1-2->SOUTH,
 * 3->WEST,
 * 4->EAST,
 * 5-6 ->NONE;
 * other -> null
 */
fun findMoveUsingInt(value:Int): Move? =TODO()

/**
 * Using When expression return the relevant Integer
 */

fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> TODO()
            is Sum -> TODO()
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
