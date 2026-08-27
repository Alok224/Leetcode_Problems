class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int j = nums.length - 1;
        int ans = 0;
        while(j>=0 && k != 0){
            k--;
            if(k == 0){
                ans = nums[j];
            }
            j--;
        }
        return ans;
    }
}