package parrot

import kotlin.math.max

class AfricanParrot(numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) : Parrot(
    numberOfCoconuts, voltage, isNailed
) {
    override fun getSpeed(): Double {
        return max(0.0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts)
    }

    override fun getCry(): String {
        return "Sqaark!";
    }
}