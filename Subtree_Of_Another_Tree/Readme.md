Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.

<!-- Approach -->

1.  if subroot is null then it is always a subtree and if root is null then main tree does not exist so return false.
2. Then check the value of root value and subroot value if it is equal then call the function that checks further nodes.
3. then call the recursion function that check the left root and right root.
4. In function we check the value of left and right node as well as subroot value of left and right node.

