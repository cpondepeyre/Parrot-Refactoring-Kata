package parrot

class EuropeanParrot(numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) : Parrot(
    numberOfCoconuts,
    voltage,
    isNailed
) {
    override fun getSpeed(): Double {
        return baseSpeed;
    }

    override fun cry(): String {
        return "Sqoork!";
    }
}