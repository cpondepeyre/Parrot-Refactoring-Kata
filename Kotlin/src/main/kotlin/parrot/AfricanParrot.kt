package parrot

import kotlin.math.max

class AfricanParrot(numberOfCoconuts: Int) : Parrot(numberOfCoconuts) {
    override fun getSpeed(): Double = max(0.0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts)

    override fun getCry(): String = "Sqaark!"
}
