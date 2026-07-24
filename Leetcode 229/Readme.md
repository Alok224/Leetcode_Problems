Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

#### Approach

1. Brute force se ho jaa rha but not a better solution

2. HashMap ka use kiya and O(nlogn) m ho jaa rha but Not a optimal solution

3. So, Apply the Boyer's Moore Voting Algo.

4. n/3 case mai atmost 2 element n/3 se greater hote hai.

5. So, 2 element ko assume krna pdega and Algo ko apply krna pdega.

6. And verify it, That the element is greater than n/3 or not.

7. It yes, then add to list otherwise no.

8. Time complexity :- O(n).