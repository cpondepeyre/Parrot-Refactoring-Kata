package parrot

import kotlin.math.min

class NorwegianParrot(numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) : Parrot(
    numberOfCoconuts,
    voltage,
    isNailed
) {
    override fun getParrotSpeed(): Double {
        return if (isNailed) 0.0 else min(24.0, voltage * baseSpeed)
    }

    override fun cry(): String {
        return if (voltage > 0) "Bzzzzzz"
        else "...";
    }
}