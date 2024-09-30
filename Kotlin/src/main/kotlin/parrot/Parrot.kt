package parrot

import kotlin.math.max
import kotlin.math.min

abstract class Parrot(
    private val type: ParrotTypeEnum,
    internal val numberOfCoconuts: Int,
    internal val voltage: Double,
    internal val isNailed: Boolean
) {

    val speed: Double
        get() = getSpeed()

    internal val loadFactor: Double
        get() = 9.0

    internal val baseSpeed: Double
        get() = 12.0

    abstract fun getSpeed(): Double

    val cry: String
        get() = when (type) {
            ParrotTypeEnum.EUROPEAN -> "Sqoork!"
            ParrotTypeEnum.AFRICAN -> "Sqaark!"
            ParrotTypeEnum.NORWEGIAN_BLUE ->
                if (voltage > 0) "Bzzzzzz"
                else "..."
        }
}
