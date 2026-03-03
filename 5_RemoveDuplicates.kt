fun main() {

    val numbers = listOf(1, 2, 3, 2, 4, 1, 5, 3)

    val newList = mutableListOf<Int>()

    for (num in numbers) {

        if (!newList.contains(num)) {
            newList.add(num)
        }
    }

    println("List without duplicates: $newList")
}