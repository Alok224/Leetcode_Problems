Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.

<!-- Approach -->

1. In this question, we use recursion approach.

2. By using recursion move to left subtree and right subtree.

3. If any root node is null then return false because empty root means empty tree and empty tree does not contain any path.

4. If I reached leaf node, and check the root.val is equal to targetsum.

5. Always subract the root.val from target sum and save it to remainingsum variable.

6. Pass the remainingsum variable in recursion call.

7. Time complexity :- O(n).