/*
 * @lc app=leetcode.cn id=10 lang=java
 *
 * [10] 正则表达式匹配
 */

// @lc code=start
class Solution {
    public boolean isMatch(String s, String p) {
        if (p == null || p.length() == 0) {
            return (s == null || s.length() == 0);
        }
        if (p.length() >= 2 && p.charAt(1) == '*') {
            if (s == null || s.length() == 0) {
                // p 有 * 且 s 已空, 看 p 的 * 后还有什么
                return isMatch(s, p.substring(2));
            } else {
                boolean match = (s.charAt(0) == p.charAt(0)) || (p.charAt(0) == '.');
                // 匹配 0 次, 查看 s 当前位和 p 的 2 位之后
                // 匹配 1 次以上, 查看 s 下 1 位和 p 的当前位
                return isMatch(s, p.substring(2)) || (match && isMatch(s.substring(1), p));
            }
        } else { // 下下个不是 *, 正常匹配
            if (s == null || s.length() == 0) {
                return false;
            } else {
                boolean match = (s.charAt(0) == p.charAt(0)) || (p.charAt(0) == '.');
                return match && isMatch(s.substring(1), p.substring(1));
            }
        }
    }
}
// @lc code=end

