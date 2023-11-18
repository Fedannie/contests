package leetcode.frequency_of_the_most_frequent_element

import kotlin.math.max

/**
 * Solution to Leetcode 1838:  Frequency of the Most Frequent Element (Medium)
 * https://leetcode.com/problems/frequency-of-the-most-frequent-element/?envType=daily-question&envId=2023-11-18
 */
class Solution {
    fun maxFrequency(nums: IntArray, k: Int): Int {
        val sorted = nums.sorted()
        var left = 0
        var right = 1
        var result = 1
        var partialDeltaSum = 0

        while (right <= nums.size) {
            if (partialDeltaSum <= k) {
                result = max(result, right - left)
                right++
                if (right <= nums.size) {
                    partialDeltaSum += (sorted[right - 1] - sorted[right - 2]) * (right - left - 1)
                }
            } else {
                left++
                partialDeltaSum -= (sorted[right - 1] - sorted[left - 1])
            }
        }
        return result
    }
}
