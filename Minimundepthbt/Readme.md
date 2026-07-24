Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.

<!-- Approach -->

1. Use the data structure queue to add the nodes.

2. And remove the element from the queue and check that currentnode is null or not.

3. If the currentnode is not nul then check that its left node and right node is null?
   If it is null then return height.

4. Otherwise, Move to left part and right part and add in the queue.

5. These upper steps run in a loop because we want to access the node at same level.

6. Time complexity :- O(n).