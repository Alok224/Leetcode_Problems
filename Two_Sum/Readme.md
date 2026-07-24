Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

<!-- Approach -->

1. Don't use recursion because you need to convert the arraylist into array and add the indexes in that.

2. just apply simple loops and check the sum both of the array

3. create the empty arraylist because if the sum of two element in the nums array is not equal to array then return the empty array
   So, I can return the arraylist.

Time complexity:-  O(n^2);