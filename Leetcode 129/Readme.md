You are given the root of a binary tree containing digits from 0 to 9 only.

Each root-to-leaf path in the tree represents a number.

For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.

A leaf node is a node with no children.


<!-- Approach -->

1. Use backtracking approach

2. pass the value variable in function and multiply the value by 10 and add root.val.

3. move to left and right subtree

4. return sum

5. Time complexity :- O(n).