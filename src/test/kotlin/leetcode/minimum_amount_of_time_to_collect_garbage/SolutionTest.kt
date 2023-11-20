package leetcode.minimum_amount_of_time_to_collect_garbage

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    val solution = Solution()

    @Test
    fun testGarbageCollection0() {
        val garbage: Array<String> = arrayOf("G","P","GP","GG")
        val travel: IntArray = intArrayOf(2, 4, 3)
        val result = 21
        assertEquals(result, solution.garbageCollection(garbage, travel))
    }

    @Test
    fun testGarbageCollection1() {
        val garbage: Array<String> = arrayOf("MMM","PGM","GP")
        val travel: IntArray = intArrayOf(3, 10)
        val result = 37
        assertEquals(result, solution.garbageCollection(garbage, travel))
    }
}