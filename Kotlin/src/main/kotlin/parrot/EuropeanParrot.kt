package parrot

class EuropeanParrot : Parrot() {
    override fun getSpeed(): Double = BASE_SPEED

    override fun getCry(): String = "Sqoork!"
}
