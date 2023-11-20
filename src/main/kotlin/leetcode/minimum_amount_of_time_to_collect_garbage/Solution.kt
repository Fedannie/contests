package leetcode.minimum_amount_of_time_to_collect_garbage

/**
 * Solution to leetcode 2391: Minimum Amount of Time to Collect Garbage (Medium)
 * https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/description
 */
class Solution {
    enum class GarbageType { M, P, G }

    private fun countGarbage(garbage: Array<String>, garbageType: GarbageType): Int {
        return garbage.sumOf { it.count { it == garbageType.toString()[0] } }
    }

    private fun countTravelTime(travel: IntArray, lastHouse: Int, garbageType: GarbageType): Int {
        return travel.mapIndexed { index, time -> if (index < lastHouse) time else 0 }.sum()
    }

    fun garbageCollection(garbage: Array<String>, travel: IntArray): Int {
        return GarbageType.entries.stream().mapToInt {
            countGarbage(garbage, it) +
            countTravelTime(travel, garbage.lastIndexOf(garbage.findLast { house -> house.contains(it.toString()) }), it)
        }.sum()
    }
}

