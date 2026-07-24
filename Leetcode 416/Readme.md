Given an integer array nums, return true if you can partition the array into two subsets such that the sum of the elements in both subsets is equal or false otherwise.

<!-- Approach -->

1. Itna toh mujhe pta h agr array ka sum even hai toh array ka partition krke joh sum aayega voh dusre partion ka bhi same hi hoga.

2. Agr array ka sum odd hoga toh array ka partition uske dusre subset k sum k equal nhi aayega.

3. So, check first that the sum of array is even or odd?

4. If the sum of array is odd then return false.

5. If sum of array is even then call the function subsetsum(arr,sum/2).

6. Now, follow the pattern of dynamic approach.