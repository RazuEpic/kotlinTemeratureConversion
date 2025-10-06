fun main() {
    while (true) {
        println(
            """
1) Convert Celsius to Fahrenheit
2) Convert Fahrenheit to Celsius
3) Convert Celsius to Kelvin
4) Convert Fahrenheit to Kelvin
5) Convert Kelvin to Celsius
6) Convert Kelvin to Fahrenheit
7) Quit""".trimMargin()
        )
        try {
            val convertToTemp = readln().toInt()
            when (convertToTemp) {
                1 -> {
                    println("Enter Celsius to convert to Fahrenheit")
                    val c = readln().toDouble()
                    val f = (c * 9 / 5) + 32
                    println("%.2f".format(f))
                }
                2 -> {
                    println("Enter Fahrenheit to convert to Celsius")
                    val f = readln().toDouble()
                    val c = (f - 32) * 5 / 9
                    println("%.2".format(c))
                }
                3 -> {
                    println("Enter Celsius to convert to Kelvin")
                    val c = readln().toDouble()
                    val k = (c + 273.15)
                    println("%.2".format(k))
                }
                4 -> {
                    println("Enter Fahrenheit to convert to Kelvin")
                    val f = readln().toDouble()
                    val k = (f - 32) * 5 / 9 + 273.15
                    println(k)
                }
                5 -> {
                    println("Enter Kelvin to convert to Celsius")
                    val k = readln().toDouble()
                    val c = (k - 273.15)
                    println("%.2".format(c))
                }
                6 -> {
                    println("Enter Kelvin to convert to Fahrenheit")
                    val k = readln().toDouble()
                    val f = (k - 273.15) * 9 / 5 + 32
                    println(f)
                }
                7 -> {
                    println("Bye!")
                    break
                }
            }
        } catch (e: NumberFormatException) {
            println("Not a number.")
        }
    }
}
