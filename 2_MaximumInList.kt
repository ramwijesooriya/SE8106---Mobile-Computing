fun main() {

    val numbers = listOf(10, 45, 3, 99, 23, 67)

    var largest = numbers[0]

    for (num in numbers) {

        if (num > largest) {
            largest = num
        }
    }

    println("Largest number = $largest")
}