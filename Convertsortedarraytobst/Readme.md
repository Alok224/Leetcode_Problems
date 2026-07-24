Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

<!-- Approach -->

1. Use recursive function for create tree.

2. firstly find the mid element to get the root node.

3. Call the recursive function to get the left subtree and right subtree.

4. for left subtree -> start point is 0 but end point is midindex -1.

5. for right subtree -> start point is midindex + 1 and end point is array.length -1.

6. Base case is when start is greater than end then return null.

6. Time complexity :- O(n).
   Space Complexity :- O(logn) {Because of using recursion}