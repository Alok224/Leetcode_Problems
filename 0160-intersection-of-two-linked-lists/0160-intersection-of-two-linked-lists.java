/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length1 = 0; int length2 = 0;
        ListNode temp1 = headA; ListNode temp2 = headB; 
        while(temp1 != null){
            length1 = length1 + 1;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            length2 = length2 + 1;
            temp2 = temp2.next;
        }

        int distance = Math.abs(length1 - length2);
        temp1 = headA; temp2 = headB;
        if(length1 > length2){
            while(distance != 0){
                temp1 = temp1.next;
                distance--;
            }
        }
        if(length1 < length2){
            while(distance != 0){
                temp2 = temp2.next;
                distance--;
            }
        }
        while(temp1 != null && temp2 != null){
            if(temp1 == temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}