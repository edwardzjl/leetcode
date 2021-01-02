#
# @lc app=leetcode.cn id=13 lang=python3
#
# [13] 罗马数字转整数
#

# @lc code=start
from typing import Dict


class Solution:

    romanDict: Dict[str, int] = {
        'I':1,
        'V':5,
        'X':10, 
        'L':50, 
        'C':100,
        'D':500, 
        'M':1000,
    }

    def romanToInt(self, s: str) -> int:
        result: int = 0
        for i in range(len(s)):
            current = s[i]
            result += self.romanDict.get(current)
            if i < 1:
                continue
            if (current == 'V' or current == 'X') and s[i - 1] == 'I':
                result -= 2
            if (current == 'L' or current == 'C') and s[i - 1] == 'X':
                result -= 20
            if (current == 'D' or current == 'M') and s[i - 1] == 'C':
                result -= 200
        return result

# @lc code=end

