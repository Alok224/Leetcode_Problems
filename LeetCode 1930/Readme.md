Given a string s, return the number of unique palindromes of length three that are a subsequence of s.

Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.

A palindrome is a string that reads the same forwards and backwards.

A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.

For example, "ace" is a subsequence of "abcde".

<!-- Approach -->

1. Sbse phle mane ek hashset banaya jisme saare unique elements store kiye.

2. Then, Ek ek krke character ko liya set m se and array ko traverse krte gya and palindorme check krte chla gya.

3. And, possible subsequences ko result m add krte chla gya.

4. then return result