You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

1. First, create the random node that contain 0 and give a pointer head to track this node.
2. Traverse the list1 and list2 until both are not null.
3. create the sum variable to store the sum of the node values.
4. Traverse the list1 and take the value and add that value in sum same with list2.
5. we create the carry variable and use divide operator and divide the sum by 10.
5. we create the sum variable and use modulo operator and modulo the sum by 10 which store the remainder.
6. After get the value of sum create the new node and store that next to head pointer.
7. return the newnode.next.
[why head.next should not be?  Because head.next means here the last node(If head.next is null then we get the empty list)].
8. the carry should be add the next node so add the carry in sum.

Time complexity :- O(n + m).