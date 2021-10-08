fun main() {
    var vocal = 'A'
    val text  = "Kotlin"
    val firstChar = text[0]
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)

    println("First character of $text is $firstChar")

    for (char in text){
        print("$char ")
    }

    println("\n$text is \"Awesome!\"")

    println(line)

    val name = "Kotlin"
    val old = 3
    val hour = 7
    println("My name is " + name)
    println("My name is $name")
    println("My name is $name, im $old years old")
    println("Office ${if (hour > 7) "already close" else "is open"}")
}