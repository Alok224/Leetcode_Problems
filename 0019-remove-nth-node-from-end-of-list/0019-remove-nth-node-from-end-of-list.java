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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head == null || head.next == null){
            return null;
       }

       int length = 0;
       ListNode temp = head;
       while(temp != null){
            length = length + 1;
            temp = temp.next;
       }
       int k = length - n + 1;
       ListNode temp1 = head;
       ListNode prev = temp1; int count = 0;
       while(temp1 != null){
            if(count == k-1){
                prev.next = temp1.next;
                break;
            }
            count++;
            prev = temp1;
            temp1 = temp1.next;        
       }
       return head;
    }
}