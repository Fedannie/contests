package leetcode.reduction_operation_to_make_array_elements_equal

/**
 * Solution to the leetcode 1887: Reduction Operations to Make the Array Elements Equal
 * https://leetcode.com/problems/reduction-operations-to-make-the-array-elements-equal/description/
 */
class Solution {
    fun reductionOperations(nums: IntArray): Int {
        val sorted = nums.sorted()
        var result = 0
        var current = 0
        for ((index, element) in sorted.withIndex()) {
            if (index > 0 && element != sorted[index - 1]) {
                current++
            }
            result += current
        }

        return result
    }
}