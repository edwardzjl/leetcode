#
# @lc app=leetcode.cn id=28 lang=python3
#
# [28] 实现 strStr()
#

# @lc code=start
class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if needle == None or needle == '':
            return 0
        haystack_len: int = len(haystack)
        needle_len: int = len(needle)
        if needle_len > haystack_len:
            return -1
        for i in range(haystack_len):
            if haystack_len - i < needle_len:
                return -1
            for j in range(needle_len):
                if haystack[i + j] != needle[j]:
                    i += 1
                    break
                if j == needle_len - 1:
                    return i
        return -1

# @lc code=end
