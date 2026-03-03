fun main() {

    val text = "Hello World"
    var count = 0

    val lowerText = text.lowercase()

    for (ch in lowerText) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || 
            ch == 'o' || ch == 'u') {

            count++
        }
    }

    println("Number of vowels = $count")
}