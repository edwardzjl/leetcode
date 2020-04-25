import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=6 lang=java
 *
 * [6] Z 字形变换
 */

// @lc code=start
class Solution {
    public String convert(String s, int numRows) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (numRows < 1) {
            return "";
        }
        if (numRows == 1) {
            return s;
        }
        List<StringBuilder> sbs = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
            sbs.add(new StringBuilder());
        }

        for (int i = 0; i < s.length(); i++) {
            int ans = i / (numRows - 1);
            int cur = i % (numRows - 1);
            if (ans % 2 == 0) { // 结果为偶数或0
                sbs.get(cur).append(s.charAt(i)); // 按余数正序保存
            }
            if (ans % 2 != 0) { // 结果为奇数
                sbs.get(numRows - cur - 1).append(s.charAt(i)); // 按余数倒序保存
            }
        }
        StringBuilder rsb = sbs.get(0);
        for (int i = 1; i < numRows; i++) {
            rsb.append(sbs.get(i));
        }
        return rsb.toString();
    }
}
// @lc code=end
