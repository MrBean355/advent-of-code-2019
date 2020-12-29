package com.github.mrbean355.aoc.day2

import com.github.mrbean355.aoc.PuzzleTest

class ProgramAlarmTest : PuzzleTest(ProgramAlarm::class) {

    override val part1TestCases = mapOf(
        "day2/example.txt" to 3500L,
        "day2/puzzle.txt" to 2842648L,
    )

    override val part2TestCases = mapOf<String, Long>(
    )

}