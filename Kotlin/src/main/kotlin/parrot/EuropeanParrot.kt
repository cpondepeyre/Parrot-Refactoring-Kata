package parrot

class EuropeanParrot(numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) : Parrot(
    ParrotTypeEnum.EUROPEAN, numberOfCoconuts,
    voltage,
    isNailed
) {
}