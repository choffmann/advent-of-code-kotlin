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

    val input = readInput("Day02").map {
        val split = it.split(" ")
        Pair<String, Int>(split[0], split[1].toInt())
    }
    println(part1(input))
    println(part2(input))
}