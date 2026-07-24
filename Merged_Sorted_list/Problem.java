import java.util.*;
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        LinkedList<Integer> List3 = new LinkedList<Integer>();
        ListNode newnode = new ListNode(0);
        ListNode head = newnode;
        List<Integer> array = new ArrayList<>();

        while(list1 != null || list2 != null){
            
            if(list1 != null){
                array.add(list1.val);
                list1 = list1.next;
            }
            if(list2 != null){
                array.add(list2.val);
                list2 = list2.next;
            }

        }
            
        
            Collections.sort(array);
        
            for (int element : array) {
                head.next = new ListNode(element);
                head = head.next;
            }

            return newnode.next;
        
    

    }
}