fun main() {
    val intArray = intArrayOf(1, 3, 5, 7)
    val intArray1 = Array(4, { i -> i * i }) //[0, 1, 4 ,9]

    intArray[2] = 11
    println(intArray[2])
    println(intArray1[3])
}