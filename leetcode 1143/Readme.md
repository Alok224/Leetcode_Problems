Given two strings text1 and text2, return the length of their longest common subsequence. If there is no common subsequence, return 0.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".
A common subsequence of two strings is a subsequence that is common to both strings.

<!-- Approach -->

1. Hume itna toh pta h ki agr dono string m se kisi ki bhi length 0 hoti h toh kuch common nhi aane vala. Toh dp[i][j] in table form m intialization 0 se hoga.

2. Agr dono string ko compare kiya jaye toh dono k string equal aaye toh return 1 + dp[i-1][j-1] hona h.

3. Agr na aaye toh 2 posiblities hai. pehli toh yeh ek string m se ek element ko na leke dusre string se element ko leke compare krna and vice versa and dono ka maximum nikal lena.

4. Last m return dp[m][n]