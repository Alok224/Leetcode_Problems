/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head; ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode temp = slow.next;
        ListNode prev = null; ListNode front = temp;
        while(temp != null){
            front = front.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }

        ListNode start2 = prev; ListNode start1 = head;
        while(start2 != null){
            if(start1.val != start2.val){
                return false;
            }
            start1 = start1.next;
            start2 = start2.next;
        }
        return true;
    }
}