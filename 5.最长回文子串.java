/*
 * @lc app=leetcode.cn id=5 lang=java
 *
 * [5] 最长回文子串
 */

// @lc code=start
class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return "";
        }
        int max = 0, left = 0, right = 0;
        for(int i = 0; i < s.length(); i++) {
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (max < len) {
                max = len;
                left = i - (len - 1) / 2; // why - 1
                right = i + len / 2 + 1; // why + 1
            }
        }
        System.out.println(max);
        System.out.println(left);
        System.out.println(right);
        return s.substring(left, right);
    }


    private int expand(String s, int left, int right) {
        while (left >=0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            } else {
                break;
            }
        }
        return right - left - 1; // why - 1
    }

}
// @lc code=end

