Given an array nums of integers, return the length of the longest arithmetic subsequence in nums.

Note that:

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.
A sequence seq is arithmetic if seq[i + 1] - seq[i] are all the same value (for 0 <= i < seq.length - 1).


<!-- Approach -->

1. Isme approach bilkul LIS ki tarah same hi rhega but isme 2d Dp ka use krenge Kyuki length k saath saath difference bhi change ho rha hai.

2. dp[i][diff] ka mtlb hai ki end i index p ho rha hai and joh diff h vha tk length kya h?

3. if dp[j][diff] is equal to 0 matlb koi aithmetic sequence nhi bn rhi h toh minimun aithmetic sequence ki length 2 ho skti h toh dp[i][diff] = 2 hoga.

3. if dp[j][diff] is equal to 0 nhi hua toh dp[i][diff] = dp[j][diff] + 1.

4. Then max len nikal lenge and usko return kra denge.