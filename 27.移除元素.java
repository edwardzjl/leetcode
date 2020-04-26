/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int currentIdx = 0;
        for(int scanIdx = 0; scanIdx < nums.length; scanIdx++) {
            if(nums[scanIdx] != val) {
                nums[currentIdx++] = nums[scanIdx];
            }
        }
        return currentIdx;
    }
}
// @lc code=end

