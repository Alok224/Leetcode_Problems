Given a binary tree

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.



<!-- Approach -->

1. Create a queue and add the node in it.

2. Try loop for maintain the same level.

3. Access the currentnode and remove it.

4. Check the currentnode.left and right is null or not and add the currentnode left and the right in queue.

5. check the another condition if i < size - 1 then currentnode.next = queue.peek() else currentnode.next = null.

5. return root.

6. Time complexity :- O(N).