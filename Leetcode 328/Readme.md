Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

<!-- Appraoch -->

1. Ek normal arrpoac rkhi.

2. head ko odd node assume kiya and head k next ko even node assume kiya.

3. dono ko traverse krke ek dusre se connect kiya.

4. lastly, pura traverse krne k baad last odd k node ko even node se connect krdiya.

5. Then, return head.