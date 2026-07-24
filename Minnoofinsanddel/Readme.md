Given two strings s1 and s2. The task is to remove or insert the minimum number of characters from/in s1 to transform it into s2. It could be possible that the same character needs to be removed from one point of s1 and inserted into another point.

<!-- Approach -->

1. Ek simple si soch rkhi. Ek string ko dusre string mai convert krne k liye kitne no. of insertion and deletion honge uske liye phle LCS nikala.

2. LCS isilye voh dono string mai common hoga. Phir s1 string ki length m se lcs ki length ko subract krdiya jisse number of insertion aa gye.

3. Phir s2 string ki length m se lcs ki length ko subract kr diya jisse number of deletion aa gye.

4. Then, dono ko add krdiya.