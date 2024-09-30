package parrot

abstract class Parrot(
    internal val numberOfCoconuts: Int,
    internal val voltage: Double,
    internal val isNailed: Boolean
) {
    companion object {
        const val LOAD_FACTOR: Double = 9.0
        const val BASE_SPEED: Double = 12.0
    }

    abstract fun getSpeed(): Double

    abstract fun getCry(): String
}
