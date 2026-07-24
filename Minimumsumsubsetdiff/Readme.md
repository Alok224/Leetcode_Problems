Given an array arr[]  containing non-negative integers, the task is to divide it into two sets set1 and set2 such that the absolute difference between their sums is minimum and find the minimum difference.


<!-- Approach -->

1. Phle mane total sum nikal liya phir mane uska jitna partiton sets ka diya hua h usko divide kr diya in totla sum.

2. Phir mane ek function ko call lagaya then usme sum\k(partiton ko pass krdiya).

3. Phir usi sum se dp banate h boolean datatype ki.

4. phir return krdete h Totalsum - 2*s1 joh ki hume minimum answer deta h.
