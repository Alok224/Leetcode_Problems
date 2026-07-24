Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

<!-- Approach -->

1. Ek hashset banaya uske andar saare elements add kr diye.

2. After that, set ko traverse kiya and yeh check kiya ki set k element ka element - 1 set m exist krta hai ki nhi..Age voh exist nhi krta hai toh voh Ist element hoga and uske baad set m uss element ka element + 1 check krte jayenge and length ko 1 se increae krte jayenge.

3. And ek baar trvaerse ho jaye then, max and length ko compare krke max element nikal lenge.

4. And After, return max.

5. Time complexity:- O(n)
Space Complexity:- O(n)