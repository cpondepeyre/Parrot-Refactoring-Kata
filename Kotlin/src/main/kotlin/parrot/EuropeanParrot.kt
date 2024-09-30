package parrot

class EuropeanParrot(numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) : Parrot(
    numberOfCoconuts,
    voltage,
    isNailed
) {
    override fun getSpeed(): Double {
        return BASE_SPEED;
    }

    override fun getCry(): String {
        return "Sqoork!";
    }
}