Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

<!-- Approach -->

1. In this question, we created a map and put the element of it is not exist in map already but with its index not the frequency.

2. When The element j is already stored in map then check the difference the index of cuurrent element and index of last current element.

3. If the difference is smaller or equal to k then return true.

4. Otherwise store the j element in map with its current index and move the j ahead.

Time Complexity :- O(n).