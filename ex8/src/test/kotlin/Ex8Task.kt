import util.Player
import util.Position
import util.isValid

/**
 * Exercise 8: Collections
 *
 * Read about <a href="http://kotlinlang.org/docs/reference/collections.html"></a>
 */

fun getEmptySetOfPlayers(): Set<Player> = TODO()

fun getEmptyListOfPlayers(): List<Player> = TODO()

/**
 * Filter players with score 0.
 */
fun getPlayersWithScore0(players: List<Player>): List<Player> = TODO()

/**
 * Return true if all players have a score not null
 */
fun checkAllPlayersHaveAScore(players: List<Player>): Boolean = TODO()

/**
 * Return true if there is at least one player with the score 10
 */
fun checkContainsPlayerWithScore10(players: List<Player>): Boolean = TODO()

/**
 * Return the number of players with the score 20
 */
fun countPlayersWithScore20(players: List<Player>): Int = TODO()

/**
 * Return the first player with the score @param score, or null if there is none
 */
fun findAnyPlayerWithScore(players: List<Player>, score: Int): Player? = TODO()

/**
 * Return the players names without using for or while
 */
fun getPlayersNames(players: List<Player>): Array<String> = TODO()



fun getAllPlayers(games: List<Game>): List<Player> = TODO()

/**
 * Return true if there is more valid position than invalid, false otherwise
 * using a maximum two lines line expression.
 *
 * Read about @see <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/partition.html"></a>
 */
fun isThereMoreValidThanInvalid(vararg positions: Position): Boolean = TODO()





