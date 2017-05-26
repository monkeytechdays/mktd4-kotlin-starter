import util.Player

/**
 * Exercise 2 : Fields, Properties, Declaration, Destructuring declaration
 *
 * Read about properties @see <a href="https://kotlinlang.org/docs/reference/properties.html">Properties</a>
 */

/**
 * Initialize the mutable property with.
 */
fun shouldInitializeMutableProperty(): Int {
    /*TODO*/ a = 2
    a = 3
    return a
}

/**
 * Initialize the immutable property a.
 */
fun shouldInitializeImmutableProperty(): Int {
    /*TODO*/ a = 2
    // a = 3 won't compile
    return a
}

/**
 * Read about Getters and Setters @see <a href="https://kotlinlang.org/docs/reference/properties.html#getters-and-setters">Getters and Setters</a>
 *
 * Add a custom setter for posX to update _posX as an Integer >=0 (use 0 is setter value < 0)
 * Add a custom getter for posY to expose posY as an Integer >=0 (use 0 is _poxY < 0)
 * Add a custom equals function. Two Positions are equals if (posY == other.posY) && (posX == other.posX)
 * Note: you can also add a custom hashcode method using Java Objects.hash(...)
 */
class Position(_posX: Int, _posY: Int) {

    var posX = if (_posX >= 0) _posX else -1
            set(/*TODO*/) =/*TODO*/


    val posY = _posY
            get() = /*TODO*/

}

/**
 * Read about @see <a href="http://kotlinlang.org/docs/reference/multi-declarations.html">Destructuring declaration</a> and make the following code compile by adding two things.
 */
fun shouldReturnPairOfIdAndName(player: Player): Pair<Int, String> {
    val (id,name) = /* TODO */
    return Pair(id, name)
}


