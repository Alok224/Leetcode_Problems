Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

<!-- Approach -->

1. Sbse phle string m se extra spaces ko remove krne k liyee trim() ka use kiya.

2. Then, wordsarray name ka ek array bnaya with the help of split() method.

3. Phir, loop apply kiya and stringbuilder m string ko add krte chla gya from reverse direction.

4. And string ko retrun krva diya.

5. Time complexity :- O(n).