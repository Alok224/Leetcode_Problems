Given a string s, find the length of the longest substring without duplicate characters.

<!-- Approach -->

1. Solve this question using Hashmap

2. create a map and put the string char in map.

3. traverse the map by for loop and check for any key value is greater than 1.

4. If any value is greater than 1 then remove the count of i when the count == 0 then remove that key from the map.

5. Then find the max length of substring by Math.max().

6. Time complexity:- O(n).
