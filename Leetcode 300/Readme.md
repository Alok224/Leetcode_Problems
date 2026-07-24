Given an integer array nums, return the length of the longest strictly increasing subsequence.

<!-- Approach -->

1. Yeh problem single dp se easily solve ho rhi hai.

2. loop start kiya i = 0 se and n tk. n = nums.length;

3. phir dp[i] ko simple 1 se store kra diya kyuki jb bhi kisi element se loop start hota toh length 1 apne aap hoti.

4. then, dusra loop suru kiya j = 0 se j < i tk. agr i bda hua j se toh dp mai length ko 1 se increase kr denge.

5. Iska mtlb hai ki i se phle vale element agr i se lesser value rkhte hai toh unko add kiya jayega.

6. return max