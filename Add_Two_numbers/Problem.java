class Problem{
    Node head;
    static class Node{
        int data;
        Node next;
        // constructor call
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public  void addLast(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }

        Node currentnode = head;
        while(currentnode.next != null){
            currentnode = currentnode.next;
        }
        currentnode.next = newnode;

    }

    public void addlist(){
        
    }

    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currentnode = head;
        while(currentnode != null){
            System.out.print(currentnode.data + "->");
            currentnode = currentnode.next;
        }
        System.out.print("NULL");
        System.out.println();
    }


    public static void main(String args[]){
        // main function
        Problem list1 = new Problem();
        Problem list2 = new Problem();
        Problem list3 = new Problem();

        list1.addLast(1);
        list1.addLast(2);

        list2.addLast(2);
        list2.addLast(3);

        list1.printlist();
        list2.printlist();
        
    }
}

// Leetcode Solution
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newnode = new ListNode(0);
        ListNode head = newnode;
        
        int carry = 0;
        int sum;
        // Traverse
        while(l1 != null || l2 != null){
            sum = 0 + carry;
            if(l1 != null){
                sum = sum + l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum = sum + l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            sum = sum % 10;
            // Now create the node for sum
            head.next = new ListNode(sum);
            head = head.next;
        }
        if(carry == 1){
            head.next = new ListNode(1);
            // return head.next;
        }
    return newnode.next;
}

}