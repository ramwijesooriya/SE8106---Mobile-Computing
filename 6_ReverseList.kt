fun main() {

    val fruits = listOf("Apple", "Banana", "Mango", "Orange")

    val reversedList = mutableListOf<String>()

    for (i in fruits.size - 1 downTo 0) {
        reversedList.add(fruits[i])
    }

    println("Original list: $fruits")
    println("Reversed list: $reversedList")
}