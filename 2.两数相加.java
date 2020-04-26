/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        int up = 0;
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while(l1 != null || l2 != null) {
            if (l1 == null) {
                int _current = (l2.val + up) % 10;
                up = (l2.val + up) / 10;
                ListNode current = new ListNode(_current);
                cur.next = current;
                l2 = l2.next;
            } else if (l2 == null) {
                int _current = (l1.val + up) % 10;
                up = (l1.val + up) / 10;
                ListNode current = new ListNode(_current); 
                cur.next = current;
                l1 = l1.next; 
            } else {
                int _current = (l1.val + l2.val + up) % 10;
                up = (l1.val + l2.val + up) / 10;
                ListNode current = new ListNode(_current);
                cur.next = current;
                l1 = l1.next;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (up != 0) {
            cur.next = new ListNode(up);
        }
        return head.next;
    }
}
// @lc code=end

