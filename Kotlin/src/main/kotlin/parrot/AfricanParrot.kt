package parrot

import kotlin.math.max

class AfricanParrot(numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) : Parrot(
    ParrotTypeEnum.AFRICAN, numberOfCoconuts, voltage, isNailed
) {
    override fun getSpeed(): Double {
        return max(0.0, baseSpeed - loadFactor * numberOfCoconuts)
    }
}