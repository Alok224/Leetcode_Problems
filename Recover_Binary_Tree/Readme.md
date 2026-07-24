<!-- Approach -->

1. Declare the head pointer, first node, middle node and last node equals to null.

2. call the inorder function.

3. if the head is equal to null then make it equal to root.

4. Other wise compare the root value with head value.
   [If my first node is equal to null then it is first violation, Then first = head and middle = root.]
   [If my first node is not equal to null then is ts second violation, then last = root.]

   [From this, I got the value of first, middle and last node]

5. Now swap.

6. If I got the value of first, middle and last node then swap only the first with last.(Not the middle){Because of non-adjacent}

7. If I got the value of first , middle not the last node then swap only the first node with middle node {Because of adjacent}.

8. Time complexity :- O(N).