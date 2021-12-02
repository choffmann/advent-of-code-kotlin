fun main() {
    fun part1(input: List<String>): Int {
        var count = 0
        input.forEachIndexed { index, element ->
             if (index > 0 && element.toInt() > input[index - 1].toInt()) {
                count++
             }
        }
        return count
    }

    fun part2(input: List<String>): Int {
        val sum = arrayListOf<Int>()
        var count = 0

        input.forEachIndexed { index, _ ->
            if(input.size >= index + 3) {
                sum.add(input[index].toInt() + input[index + 1].toInt() + input[index + 2].toInt())
            }
        }

        sum.forEachIndexed { index, element ->
            if (index > 0 && element > sum[index - 1]) {
                count++
            }
        }
        return count
    }

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
