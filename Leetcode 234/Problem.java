
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
            }
        }

    public static Node reverse(Node head){
        Node prev = null; Node temp = head; Node front = temp;
        while(temp != null){
            front = front.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public boolean isPalindrome(Node head) {
        if(head == null || head.next == null){
            return true;
        }
        // hare and tortoise algo
        Node slow = head; Node fast = head;
        while(fast.next != null){
            if(fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            else{
                break;
            }
            
        }
        Node newhead = reverse(slow.next);
        Node first = head; Node second = newhead;
        while(second != null){
            if(first.val == second.val){
                first = first.next;
                second = second.next;
            }
            else{
                return false;
            }
        }
        return true;
    }
}