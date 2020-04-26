/*
 * @lc app=leetcode.cn id=66 lang=java
 *
 * [66] 加一
 */

// @lc code=start
class Solution {
    public int[] plusOne(int[] digits) {
        int up = 1;
        for(int i = digits.length - 1; i >= 0; i--) {
            int current = (digits[i] + up) % 10;
            up = (digits[i] + up) / 10;
            digits[i] = current;
        }
        if(up > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = up;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
    }
}
// @lc code=end

