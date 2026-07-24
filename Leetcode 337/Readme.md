The thief has found himself a new place for his thievery again. There is only one entrance to this area, called root.

Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that all houses in this place form a binary tree. It will automatically contact the police if two directly-linked houses were broken into on the same night.

Given the root of the binary tree, return the maximum amount of money the thief can rob without alerting the police.

<!-- Approach -->

1. create an options array to store the choices of looted value and not looted value.

2. Just follow the traversal and reach to the leaf node of tree.

3. When we reached to leaf node then, fill the options array to looted value and non-looted value 

4. If I loot the node then options[0] = root.val + left_choice_array[1] + right_node_choice[1];

5. If I not looted the node then options[1] = Math.max(left_node_choice[0],left_node_choice[1]) + Math.max(right_node_choice[0],right_node_choice[1]);

6. Base case should be :- if(root == null) return new int[2];  {An empty array [0,0]}.

7. Time complexity :- O(N).