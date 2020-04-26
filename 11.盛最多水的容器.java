/*
 * @lc app=leetcode.cn id=11 lang=java
 *
 * [11] 盛最多水的容器
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for(int i = 0, j = height.length - 1; i <= j;) {
            int len = Math.min(height[i], height[j]);
            int area = (j - i) * len;
            if(area > maxArea) {
                maxArea = area;
            }
            if(height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return maxArea;
    }
}
// @lc code=end

