fun main() {
    val numbers = listOf(2, -5, 7, -1, 4) 
    var sum = 0

    for (num in numbers) {
        if (num > 0) {
            sum += num
        }
    }

    println("Sum of positive numbers: $sum")
}