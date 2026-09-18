/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public int function(Node slow, Node fast){
        int count = 1;
        slow = slow.next;
        while(fast != slow){
            slow = slow.next;
            count++;
        }
        return count;
    }
    public int lengthOfLoop(Node head) {
        // code here
        Node fast = head; Node slow = head; int length = 0;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                length = function(slow,fast);
                return length;
            } 
        }
        return length;
    }
}