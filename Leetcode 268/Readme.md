Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

#### Approach

1. Phle Ist n natural numbers ka sum nikal lo. (n*(n+1) / 2).  n = nums.length
2. nums ka total sum nikal lo.
3. sum m se totalsum ko subract krdo and return the value.
4. Time complexity:- O(n).