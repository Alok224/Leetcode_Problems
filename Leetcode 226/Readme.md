Given the root of a binary tree, invert the tree, and return its root.


<!-- Approach -->

1. traverse the tree to left and right

2. when we get reached to null node then return it.

3. After that, root.left = right and root.right = left.

4. Then return root.

5. Time complexity = O(n).