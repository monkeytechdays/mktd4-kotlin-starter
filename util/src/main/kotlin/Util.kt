package  util

data class Player(val id: Int, val name: String, val score:Int? = null)

class Position(_posX: Int, _posY: Int) {

    var posX = if (_posX >= 0) _posX else -1
            set(value) = if (value >= 0) field = value else field = 0

    val posY = _posY
            get() = if (field >= 0) field else -1

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as Position

        if (posY != other.posY) return false
        if (posX != other.posX) return false

        return true
    }

}

fun Position.isValid() = posX >= 0 && posY >= 0

enum class Move(val id: String) {
    NORTH("N"),
    SOUTH("S"),
    WEST("W"),
    EAST("E"),
    NONE("O");
}