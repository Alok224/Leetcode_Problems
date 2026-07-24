Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

 <!-- Approach -->

 1. Use the approach sliding window

 2. just add the nums[j] in sum and move to next element.

 3. check if the sum is greater then target value then find the minimum length of the window and save it to min variable.

 4. Then, move the i to next element and subract the value of ith element from the sum.

 5. then return the min length

 6. But what is sum is not equal to target and we traversed the entire array?
    so for this, return the min like this :-
return min == Integer.MAX_VALUE ? 0 : min;

7. Time complexity :- O(N).
Space Complexity :- O(1).