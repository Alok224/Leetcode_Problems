Given an array of strings words representing an English Dictionary, return the longest word in words that can be built one character at a time by other words in words.

If there is more than one possible answer, return the longest word with the smallest lexicographical order. If there is no answer, return the empty string.

Note that the word should be built from left to right with each additional character being added to the end of a previous word. 

<!-- Approach -->

1. Just ek normal si approach rkhi. Trie data structure ki help se phle saare wrds ko inswert kra liya.

2. Phir Longestword k liye yeh check k iya ki root ka children null toh nhi h and usk eow true h ki nhi.

3. Kyuki eow ka true iss baat ko represent krta hai ki, vha tk saare strings given list m already exist krte hai.

4. Agr esa hota hai toh answer ki length ko update kr denge.

5. Then, recursive call lga denge and agr root null hua toh retrun back kra denge.

6. Phir temp stringbuilder se last character delete krte jayenge jb bhi return back krenge.

7. Time complexity:- O(n*m)