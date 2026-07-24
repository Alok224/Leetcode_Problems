<!-- Approach -->

Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.

Note: A subarray is a contiguous part of any given array.

1. declare the integer i and j = 0.

2. Start the while loop until j is less than array.length.

3. if my j-i + 1 is less than k --> j++

4. if j - i + 1 is equal to k --> calculate the max sum.

5. Slide the window to next.

6. return max.

Time complexity:- O(n).