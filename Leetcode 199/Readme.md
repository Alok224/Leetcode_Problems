Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

<!-- Approach -->

1. Just follow the approach of level order traversal

2. Use the stack and queue.

3. I use the stack to add the node values and pop the top elememt.

4. After that, save that to a value variable and add to the list.

5. After all queue gets empty, return the list.

6. Time complexity :- O(n).