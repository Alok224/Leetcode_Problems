Given the root of a binary tree, return the bottom-up level order traversal of its nodes' values. (i.e., from left to right, level by level from leaf to root).

 <!-- Approach -->

1. Use the stack and queue data structures.

2. add the node in the queue and remove, add the node.value in the list.

3. move to left and right of the binary tree and add the node in the queue when node.left and node.right != null.

4. when node.value == null then push the copy of the list in the stack.

5. After that, clear the list.

6. when queue got empty, then traverse the stack until it's not empty and get the top list from the stack.

7. runtime :- 1ms