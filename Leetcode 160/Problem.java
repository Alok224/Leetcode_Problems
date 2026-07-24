public class Problem {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public int findlength(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count = count + 1;
            temp = temp.next;
        }
        return count;
    }
    public Node getIntersectionNode(Node headA, Node headB) {
        int n1 = findlength(headA);
        int n2 = findlength(headB);
        Node tempA = headA; Node tempB = headB;
        int d = Math.abs(n1 - n2);
        if(n2 > n1){
            while(d != 0){
                d = d - 1;
                tempB = tempB.next;
            }
        }
        else if(n1 > n2){
            while(d != 0){
                d = d - 1;
                tempA = tempA.next;
            }
        }
        while(tempA != null){
            if(tempA == tempB){
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
}