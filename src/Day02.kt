fun main() {
    fun part1(input: List<Pair<String, Int>>): Int {
        var horizontal = 0
        var depth = 0
        input.forEach {
            when (it.first) {
                "forward" -> horizontal += it.second
                "down" -> depth += it.second
                "up" -> depth -= it.second
            }
        }
        return horizontal * depth
    }

    fun part2(input: List<Pair<String, Int>>): Int {
        var horizontal = 0
        var depth = 0
        var aim = 0
        input.forEach {
            when (it.first) {
                "down" -> aim += it.second
                "up" -> aim -= it.second
                "forward" -> {
                    horizontal += it.second
                    depth += aim * it.second
                }
            }
        }
        return horizontal * depth
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test").map {
        val split = it.split(" ")
        Pair<String, Int>(split[0], split[1].toInt())
    }
    check(part1(testInput) == 150)
    check(part2(testInput) == 900)

    val input = readInput("Day02").map {
        val split = it.split(" ")
        Pair<String, Int>(split[0], split[1].toInt())
    }
    println(part1(input))
    println(part2(input))
}