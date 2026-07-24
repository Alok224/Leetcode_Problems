Given a string s. In one step you can insert any character at any index of the string.

Return the minimum number of steps to make s palindrome.

A Palindrome String is one that reads the same backward as well as forward.

<!-- Approach -->

1. Ek simple si approach sochi. Joh string given hai usko reverse kiya and usme se lcs nikal li.

2. Itna mai janta hu ki voh lcs hi longest palindromic subsequence hogi.

3. uss lps ko agr mai actual string m se subract krdu toh remaining string voh string hogi jisko add krne p actual string palindrome bn jayegi.