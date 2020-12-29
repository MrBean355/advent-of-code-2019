package com.github.mrbean355.aoc.day2

import com.github.mrbean355.aoc.Puzzle

class ProgramAlarm(input: List<String>) : Puzzle {

    private val opcodes = input.single().split(',').map(String::toInt)

    override fun part1(): Long {
        val opcodes = opcodes.toMutableList()
        if (opcodes.size > 12) {
            opcodes[1] = 12
            opcodes[2] = 2
        }
        var ptr = 0

        while (true) {
            when (val op = opcodes[ptr]) {
                1 -> {
                    val lhs = opcodes[opcodes[ptr + 1]]
                    val rhs = opcodes[opcodes[ptr + 2]]
                    opcodes[opcodes[ptr + 3]] = lhs + rhs
                }
                2 -> {
                    val lhs = opcodes[opcodes[ptr + 1]]
                    val rhs = opcodes[opcodes[ptr + 2]]
                    opcodes[opcodes[ptr + 3]] = lhs * rhs
                }
                99 -> break
                else -> error("Unexpected opcode: $op")
            }
            ptr += 4
        }

        return opcodes[0].toLong()
    }

    override fun part2(): Long {
        TODO("Not yet implemented")
    }
}