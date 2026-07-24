class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        List<int[]> result = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            for(int j = i + 1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    // add i, j in the empty array
                    return new int[] { i, j };
                }
            }
        }
    return result.get(0);
}
}
