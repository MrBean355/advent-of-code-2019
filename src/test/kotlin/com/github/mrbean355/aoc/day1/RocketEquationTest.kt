package com.github.mrbean355.aoc.day1

import com.github.mrbean355.aoc.PuzzleTest

class RocketEquationTest : PuzzleTest(RocketEquation::class) {

    override val part1TestCases = mapOf(
        "day1/part1_example1.txt" to 2L,
        "day1/part1_example2.txt" to 2L,
        "day1/part1_example3.txt" to 654L,
        "day1/part1_example4.txt" to 33583L,
        "day1/puzzle.txt" to 3271994L,
    )

    override val part2TestCases = mapOf(
        "day1/part2_example1.txt" to 2L,
        "day1/part2_example2.txt" to 966L,
        "day1/part2_example3.txt" to 50346L,
        "day1/puzzle.txt" to 4905116L,
    )

}