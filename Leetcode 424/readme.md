You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operation

<!-- Approach -->

1. Intially map create kiya and saare character ko ek ek krke traverse krte gaye and map m insert krte gaye.

2. map mai se maxm frequency ko nikala and length mai se subract kiya joh yeh ensure krta hai ki itne numbers ko need hai replacement krne ki.

3. Agr voh numbers k se jayada hue toh window shrink hogi and again maxfreq nikalenge.

4. And again check krenge ki abhi bhi k se jayda hai ki nhi..

5. Agr k se jayada nhi hui hai toh maxlen nikalenge.

6. Lastly return maxlen.

7. Time complexity:- O(2n)
Space complexity :- O(n)