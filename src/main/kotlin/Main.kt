package ru.netology

fun main() {

    calculateСommission("MasterCard", 40_000)
    calculateСommission("MasterCard", 700_000)
    calculateСommission("Maestro", 3_000)
    calculateСommission("Maestro", 900_000)
    calculateСommission(amount = 1_000_000)

}

fun calculateСommission(
    cardType: String = "VK Pay",
    amount: Int,
    limitAtOneTime: Int = 150_000,
    oldTransfers: Int = 0,
    summaryLimit: Int = 600_000
) {

    var commission: Int

    if (cardType == "VK Pay") {
        println("Комиссия для $cardType не взимается")
    } else {
        if (amount > limitAtOneTime || amount + oldTransfers > summaryLimit) {
            commission = (amount * 0.0006).toInt() + 20
            println("Лимит превышен. Комиссия за перевод для $cardType составляет $commission")
        } else {
            println("Комиссия не взимается")
        }
    }
}

