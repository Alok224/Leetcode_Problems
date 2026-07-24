class Solution {
    public int function(int[] nums, int target, int low, int high){
        if(high < low){
            return -1;
        }
        int mid = (low + high) / 2;
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] > target){
            return function(nums,target,low,mid - 1);
        }
        else{
            return function(nums,target,mid + 1,high);
        }
    }
    public int search(int[] nums, int target) {
        // int low = 0; int high = nums.length - 1;
        // while(low<=high){
        //     int mid = (low + high)/2;
        //     if(nums[mid] == target){
        //         return mid;
        //     }
        //     else if(nums[mid] > target){
        //         high = mid - 1;
        //     }
        //     else{
        //         low = mid + 1;
        //     }
        // }
        // return -1;

        int low = 0; int high = nums.length - 1;
        int ans = function(nums,target,low,high);
        return ans;
    }
}