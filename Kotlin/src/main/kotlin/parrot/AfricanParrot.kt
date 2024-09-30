package parrot

import kotlin.math.max

class AfricanParrot(numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) : Parrot(
    numberOfCoconuts, voltage, isNailed
) {
    override fun getSpeed(): Double {
        return max(0.0, baseSpeed - loadFactor * numberOfCoconuts)
    }

    override fun cry(): String {
        return "Sqaark!";
    }
}