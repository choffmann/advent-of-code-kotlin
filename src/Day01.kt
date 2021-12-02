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

    val input = readInput("Day01").map { it.toInt() }
    println(part1(input))
    println(part2(input))
}
