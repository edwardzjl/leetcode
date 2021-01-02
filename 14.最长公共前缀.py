#
# @lc app=leetcode.cn id=14 lang=python3
#
# [14] 最长公共前缀
#

# @lc code=start
from typing import List


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if strs == None or len(strs) == 0:
            return ''
        master: str = strs[0]
        remaining: List[str] = strs[1:]
        for i in range(len(master)):
            for one in remaining:
                if i == len(one) or one[i] != master[i]:
                    return master[:i]
        return master
        
# @lc code=end

