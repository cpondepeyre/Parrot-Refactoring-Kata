package parrot

import kotlin.math.min

class NorwegianParrot(numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) : Parrot(
    numberOfCoconuts,
    voltage,
    isNailed
) {
    override fun getSpeed(): Double = if (isNailed) 0.0 else min(24.0, voltage * BASE_SPEED)

    override fun getCry(): String = if (voltage > 0) "Bzzzzzz" else "..."
}
