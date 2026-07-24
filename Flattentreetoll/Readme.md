Given the root of a binary tree, flatten the tree into a "linked list":

The "linked list" should use the same TreeNode class where the right child pointer points to the next node in the list and the left child pointer is always null.
The "linked list" should be in the same order as a pre-order traversal of the binary tree.

<!-- Approach -->

1. In this problem, Traverse the binary tree in reverse preorder traversal manner.

2. Move to right subtree and then move to left subtree.

3. when we reach to root then make root.left = null and root.right = nextright.(Here, nextright is a pointer)

4. And then, nextright = root.

5. Base case is if(root == null) then return.

Time complexity:- O(n).
Space complexity :- O(1).