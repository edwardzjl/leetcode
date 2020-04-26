/*
 * @lc app=leetcode.cn id=9 lang=java
 *
 * [9] 回文数
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int y = reverse(x);
        return x == y;
    }


    private int reverse(int x) {
        int eff = x > 0 ? 1 : -1;
        int result = 0;
        for(x = Math.abs(x); x > 0; x /= 10) {
            if (result > (Integer.MAX_VALUE - x % 10) / 10) {
                return 0;
            }
            result = result * 10 + x % 10;
        }
        return eff * result;
    }
}
// @lc code=end

