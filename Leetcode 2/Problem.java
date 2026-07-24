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
    class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public Node addTwoNumbers(Node l1, Node l2) {
        Node dummynode = new Node(-1);
        Node currentnode = dummynode;
        Node temp1 = l1; Node temp2 = l2; int carry = 0;
        while(temp1 != null || temp2 != null){
            int sum = carry;
            if(temp1 != null){
                sum = sum + temp1.val;
            }
            if(temp2 != null){
                sum = sum + temp2.val;
            }
            carry = sum / 10;
            int rem = sum % 10;
            Node newnode = new Node(rem);
            currentnode.next = newnode;
            currentnode = newnode;
            if(temp1 != null){
                temp1 = temp1.next;
            }
            if(temp2 != null){
                temp2 = temp2.next;
            }
        }
        if(carry != 0){
            Node newnode = new Node(carry);
            currentnode.next = newnode;
            currentnode = newnode;
        }
        dummynode = dummynode.next;
        return dummynode;
    }
}