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
    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode mergesort(ListNode temp1, ListNode temp2){
        ListNode dummynode = new ListNode(-1);
        ListNode temp3 = dummynode;
        while(temp1 != null && temp2 != null){
            if(temp1.val >= temp2.val){
                temp3.next = temp2;
                temp2 = temp2.next;
                temp3 = temp3.next;
            }
            else{
                temp3.next = temp1;
                temp1 = temp1.next;
                temp3 = temp3.next;
            }
        }
        while(temp1 != null){
            temp3.next = temp1;
            temp1 = temp1.next;
            temp3 = temp3.next;
        }
        while(temp2 != null){
            temp3.next = temp2;
            temp2 = temp2.next;
            temp3 = temp3.next;
        }
        return dummynode.next;
    }
    public ListNode sortList(ListNode head) {
        // List<Integer> list = new ArrayList<>();

        // ListNode temp = head;
        // while(temp != null){
        //     list.add(temp.val);
        //     temp = temp.next;
        // }

        // Collections.sort(list);
        // ListNode temp1 = head;
        // for(int i = 0; i<list.size(); i++){
        //     temp1.val = list.get(i);
        //     temp1 = temp1.next;
        // }
        // return head;

        if(head == null || head.next == null){
            return head;
        }

        ListNode middle = findMiddle(head);
        ListNode lefthead = head; ListNode righthead = middle.next;
        middle.next = null;
        lefthead = sortList(lefthead);
        righthead = sortList(righthead);
        return mergesort(lefthead, righthead);
    }
}