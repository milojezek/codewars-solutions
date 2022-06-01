package catmouse

const val CAT_JUMP = 3

fun catMouse(s: String): String {
    val distance = (s.slice(1..s.length - 2)).length
    return if (CAT_JUMP < distance) "Escaped!" else "Caught!"
}
