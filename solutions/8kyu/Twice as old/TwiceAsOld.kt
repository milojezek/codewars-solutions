import kotlin.math.abs

fun twiceAsOld(dadYearsOld: Int, sonYearsOld: Int): Int {
    var dad = dadYearsOld - sonYearsOld
    var son = 0
    while (true) {
        if (dad == (son * 2)) {
            return abs(dadYearsOld - dad)
        } else {
            dad++
            son++
        }
    }
}
