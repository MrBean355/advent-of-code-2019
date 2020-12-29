package com.github.mrbean355.aoc.day1

import com.github.mrbean355.aoc.Puzzle

class RocketEquation(input: List<String>) : Puzzle {

    private val masses = input.map(String::toLong)

    override fun part1(): Long {
        return masses.sumOf {
            it / 3 - 2
        }
    }

    override fun part2(): Long {
        TODO("Not yet implemented")
    }
}