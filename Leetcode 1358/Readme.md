Given a string s consisting only of characters a, b and c.

Return the number of substrings containing at least one occurrence of all these characters a, b and c.


<!-- Approach -->

1. Ek normal si approach rkho.

2. intially, a = -1, b = -1 and c = -1 assume krke chlo.

3. Then, loop laga ke i ko increament krte jao tb tk a, b , c ko value non negative na ho jaye.

4. jb a,b,c ki value non negative ho jati hai toh smallest value ko nikalo and uske baad ki substring ko count m bhi add krdo..count = count + (smallest + 1).

5. agr smallest hi zero hai toh count ko sirf 1 se increament kro.

6. return count;

7. Time complexity :- O(n)
8. Space Complexity :- O(1)