/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int eff = x > 0 ? 1 : -1;
        int result = 0;
        for(x = Math.abs(x); x > 0; x /= 10) {
            // result * 10 + x % 10 > Integer.MAX_VALUE
            if (result > (Integer.MAX_VALUE - x % 10) / 10) {
                return 0;
            }
            result = result * 10 + x % 10;
        }
        return eff * result;
    }

}
// @lc code=end

