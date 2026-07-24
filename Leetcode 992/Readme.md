Given an integer array nums and an integer k, return the number of good subarrays of nums.

A good array is an array where the number of different integers in that array is exactly k.

For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
A subarray is a contiguous part of an array.



<!-- Approach -->

1. Isme sliding window ko apply krne se bhut saare subarray miss ho jaa rhe hai.

2. Then jb bhi esa ho toh atmost(k) - atmost(k-1) vale pattern ko follow kro.

3. jb new element window m add hota hai toh bhut saare subarray bhi bn jate hai.

4. toh count = count + (j - i + 1) hoga.

5. return count.