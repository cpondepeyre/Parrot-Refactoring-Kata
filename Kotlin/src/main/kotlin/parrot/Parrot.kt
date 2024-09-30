package parrot

abstract class Parrot(
    internal val numberOfCoconuts: Int,
    internal val voltage: Double,
    internal val isNailed: Boolean
) {

    val speed: Double
        get() = getParrotSpeed()

    internal val loadFactor: Double
        get() = 9.0

    internal val baseSpeed: Double
        get() = 12.0

    abstract fun getParrotSpeed(): Double

    abstract fun cry(): String

    val cry: String
        get() = cry()
}
