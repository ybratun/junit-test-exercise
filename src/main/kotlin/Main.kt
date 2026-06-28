import kotlin.random.Random

fun getRandom(max: Int): Int {
    if (max < 0) throw IllegalArgumentException("Value should be non-negative")
    return Random.nextInt(max)
}

fun main() {

}