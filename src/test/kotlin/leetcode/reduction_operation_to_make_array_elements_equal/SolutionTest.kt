package leetcode.reduction_operation_to_make_array_elements_equal

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SolutionTest {
    private val solution = Solution()

    @Test
    fun testReductionOperations0() {
        val nums: IntArray = intArrayOf(5, 1, 3)
        val result = 3
        assertEquals(result, solution.reductionOperations(nums))
    }

    @Test
    fun testReductionOperations1() {
        val nums: IntArray = intArrayOf(2, 2, 2)
        val result = 0
        assertEquals(result, solution.reductionOperations(nums))
    }

    @Test
    fun testReductionOperations2() {
        val nums: IntArray = intArrayOf(1, 1, 2, 2, 3)
        val result = 4
        assertEquals(result, solution.reductionOperations(nums))
    }
}