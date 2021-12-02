fun main() {
    fun part1(input: List<Int>): Int {
        var count = 0
        input.forEachIndexed { index, element ->
            if (index > 0 && element > input[index - 1]) {
                count++
            }
        }
        return count
    }

    fun part2(input: List<Int>): Int {
        val sum = arrayListOf<Int>()
        var count = 0

        input.forEachIndexed { index, _ ->
            if (input.size >= index + 3) {
                sum.add(input[index] + input[index + 1] + input[index + 2])
            }
        }

        sum.forEachIndexed { index, element ->
            if (index > 0 && element > sum[index - 1]) {
                count++
            }
        }
        return count
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test").map { it.toInt() }
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInput("Day01").map { it.toInt() }
    println(part1(input))
    println(part2(input))
}
