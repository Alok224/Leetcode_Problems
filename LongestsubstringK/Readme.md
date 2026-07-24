You are given a string s consisting only lowercase alphabets and an integer k. Your task is to find the length of the longest substring that contains exactly k distinct characters.

Note : If no such substring exists, return -1. 

<!-- Approach -->

1. This question follows variable sliding window pattern

2. Use the hashmap data structure.
   Why? --> Map contains unique key and I can access the count of those keys how much those are repeating.

3. when the map.size() is greater than K(Number of Unique Characters) then delete the key count from the map.
   This is the catch --> If I directly delete the key from the map then the unique character delete from map but that character can still exist in substring. So here the conflict arises.

4. Because when the key character is deleted from the map then substring have not contain that character in it.

5. when key character value is equal to 0 then remove or delete that character from the map.

6. when map.size() == k then By using the math.max() --> get the max value length of the substring.

7. when all the string is get traversed but the map.size() is not equal to k then return -1.

Time Complexity :- O(1).