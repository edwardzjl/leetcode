/*
 * @lc app=leetcode.cn id=8 lang=java
 *
 * [8] 字符串转换整数 (atoi)
 */

// @lc code=start
class Solution {
    
    public int myAtoi(String str) {
        if(str == null || str.length() == 0) {
            return 0;
        }
        int idx = startIndex(str);
        if(idx >= str.length()) {
            return 0;
        }
        boolean negative = false;
        if(isSign(str.charAt(idx))) {
            negative = isNegative(str.charAt(idx++));
        }
        StringBuilder sb = new StringBuilder();
        for(; idx < str.length(); idx++) {
            char current = str.charAt(idx);
            if(!isValidNumber(current)) {
                break;
            }
            sb.append(current);
        }
        String strResult = sb.toString();
        if(strResult.length() == 0) {
            return 0;
        }
        if(negative) {
            strResult = '-' + strResult;
        }
        try {
            return Integer.parseInt(strResult);
        } catch(NumberFormatException e) {
            if(negative) {
                return Integer.MIN_VALUE;
            }
            return Integer.MAX_VALUE;
        }
    }

    private int startIndex(String strX) {
        int i = 0;
        for(; i < strX.length(); i++) {
            char current = strX.charAt(i);
            if(isValidStartChar(current)) {
                break;
            }
        }
        return i;
    }

    private boolean isValidStartChar(char c) {
        return c != ' ';
    }

    private boolean isValidNumber(char c) {
        return 48 <= c && c <= 57;
    }

    private boolean isSign(char c) {
        return c == 43 || c == 45;
    }

    private boolean isNegative(char c) {
        return c == 45;
    }

}
// @lc code=end

