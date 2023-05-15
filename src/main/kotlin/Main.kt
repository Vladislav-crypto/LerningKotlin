//fun main(args: Array<String>) {
//    println("Hello World!")
//
//    // Try adding program arguments via Run/Debug configuration.
//    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
//
//    ("Hello").also {
//        println(it)
//    }
//}
fun main() {
   val birthDateGenerator = BirthDateGenerator()

    println(birthDateGenerator.generateDate())
}

class BirthDateGenerator {

    fun generateDate(): String {
        var date = ""

        repeat(10) {
            when (it) {
                0 -> {
                    for (i in 0..3) {
                        if (i == 1) {
                            date += i
                        }
                    }
                }
                1 -> {
                    for (i in 0..9) {
                        if (i == 0) {
                            date += i
                        }
                    }
                }
                2 -> date += "."
                3 -> {
                    for (i in 0..1) {
                        if (i == 0) {
                            date += i
                        }
                    }
                }
                4 -> {
                    for (i in 0..9) {
                        if (i == 3) {
                            date += i
                        }
                    }
                }
                5 -> date += "."
                6 -> {
                    for (i in 0..9) {
                        if (i == 1) {
                            date += i
                        }
                    }
                }
                7 -> {
                    for (i in 0..9) {
                        if (i == 9) {
                            date += i
                        }
                    }
                }
                8 -> {
                    for (i in 0..9) {
                        if (i == 6) {
                            date += i
                        }
                    }
                }
                9 -> {
                    for (i in 0..9) {
                        if (i == 7) {
                            date += i
                        }
                    }
                }
            }
        }

        return date
    }
}





