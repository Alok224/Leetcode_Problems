The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.

For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.

<!-- Approach -->

1. Firstly, ek stack banaya and nums2 k element ko stack mai push kiya.

2. traverse backward kiya and nums2[i] ko check kiya ki voh stack k peek element se greater hai ki nhi agr voh greater hai toh usko nge[i] mai store kr diya.

3. Agr greater nhi hai toh stack k element ko pop kiya and again check kiya ki element greater hai ki nhi.

4. Agr stack empty hua ya greater element mila hi nhi toh nge[i] = -1 store krva denge. 

5. Then stack mai nums2[i] ko push kr diya.