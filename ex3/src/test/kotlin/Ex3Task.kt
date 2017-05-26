import util.Player

/**
 * Exercise 3 : Nullable & Safe Cast.
 *
 * Read About @see <a href="http://kotlinlang.org/docs/reference/null-safety.html">Null Safety</a>
 */

/**
 * return the player score or 0 (if no player or no score) using some if operator
 */
fun getPlayerScoreUsingIf(player: Player?): Int = TODO()


/**
 * return the player score or 0 (if no player or no score) using one line syntax and elvis operator (no if here)
 */
fun getPlayerScoreUsingElvis(player: Player?): Int = TODO()


/**
 * Maybe your convinced that the player exists, and he have a score.
 * return the player score.
 * Note: this is dangerous !
 */
fun trustMeAndReturnScore(player: Player?): Int = TODO()

/**
 * Cast the @param arg to Int and return its value or 0 if it's not an Int
 * Read about @see <a href="https://kotlinlang.org/docs/reference/typecasts.html">Type Checks and Casts</a>
 */
fun anyToInt(arg: Any?): Int = TODO()


