You are given two strings s1 and s2. Your task is to find the length of the longest common substring among the given strings.

<!-- Approach -->

1. Ek normal si approach rkhni hai. Jb string character match ho jaye toh count 1 karna hai and aage bdhna hai.

2. But agr na ho toh? Kyuki hume pta hai ki substring continuous hoti hai toh na hone p substring break ho jayegi.

3. dp[i][j] = 0;

4. Phle max mai lenght ko store kr lenge.

5. Lastly, return max;