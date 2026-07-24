Given a string s consisting only of characters 'a', 'b', and 'c'. You are asked to apply the following algorithm on the string any number of times:

Pick a non-empty prefix from the string s where all the characters in the prefix are equal.
Pick a non-empty suffix from the string s where all the characters in this suffix are equal.
The prefix and the suffix should not intersect at any index.
The characters from the prefix and suffix must be the same.
Delete both the prefix and the suffix.
Return the minimum length of s after performing the above operation any number of times (possibly zero times).


<!-- Approach -->

1. Ek normal sa pattern follow kiya joh two pointer ka hai.

2. dono both end se pointer lagaya left and right.

3. ek character ko define kiya and while loop lga k left vale pointer ko tb tk move krte gya jb tk character, left vale pointer se same h.

4. same with right pointer

5. Lastly, r-l+1 krke length ko return krva diya.