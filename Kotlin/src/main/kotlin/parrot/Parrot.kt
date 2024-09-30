package parrot

abstract class Parrot(
    internal val numberOfCoconuts: Int = 0,
    internal val voltage: Double = 0.0,
    internal val isNailed: Boolean = false
) {
    companion object {
        const val LOAD_FACTOR: Double = 9.0
        const val BASE_SPEED: Double = 12.0
    }

    abstract fun getSpeed(): Double

    abstract fun getCry(): String
}
