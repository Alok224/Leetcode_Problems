Given the head of a singly linked list where elements are sorted in ascending order, convert it to a height-balanced binary search tree.

<!-- Approach -->

1. traverse the linked list and add the nodes values in arraylist.

2. Now, define the start and end.

3. call the recursive function and pass the start and end.

4. Now find the mid element and call the recursive function for left subtree and right subtree.

5. Time Complexity :- O(n)
   Space Complexity :- O(n)