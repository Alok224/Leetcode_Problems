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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        ListNode temp = head;
        int length = 0;
        while(temp != null){
            length = length + 1;
            temp = temp.next;
        }

        int k = length / 2 + 1;
        ListNode temp1 = head; int count = 1; ListNode prev = temp1;
        while(temp1 != null){
            if(count == k){
                prev.next = temp1.next;
            }
            prev = temp1;
            temp1 = temp1.next;
            count++;
        }
        return head;
    }
}