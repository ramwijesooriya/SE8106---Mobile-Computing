fun main() {
    val correctNumber = 7
    var guess = 0

    while (guess != correctNumber) {
        println("Guess a number between 1 and 10:")
        guess = readLine()!!.toInt() 
        if (guess == correctNumber) {
            println("Congratulations! You guessed it right.")
        } else {
            println("Try again!")
        }
    }
}