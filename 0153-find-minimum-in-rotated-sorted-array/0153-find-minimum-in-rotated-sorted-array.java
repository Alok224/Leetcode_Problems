class Solution {
    public int findMin(int[] nums) {
        // int low = 0; int high = nums.length - 1;
        // int min = Integer.MAX_VALUE;
        // while(low<=high){
        //     int mid = low + ((high - low)/2);
        //     if(low == high){
        //         if(nums[low] < min){
        //             min = nums[low];
        //         }
        //         break;
        //     }
        //     // left part
        //     if(nums[mid] >= nums[low]){
        //         min = Math.min(min,nums[low]);
        //         low = mid + 1;
        //     }
        //     // right part
        //     else{
        //         min = Math.min(min,nums[mid]);
        //         high = mid - 1;
        //     }
        // }
        // return min;
        Arrays.sort(nums);
        return nums[0];
    }
}