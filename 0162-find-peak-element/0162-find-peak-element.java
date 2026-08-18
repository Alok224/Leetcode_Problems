class Solution {
    public int findPeakElement(int[] nums) {
        // int n = nums.length;
        // int low = 0;
        // int max = 0; int index = 0;
        // while(low <= n - 1){
        //     if((low == 0 || nums[low] > nums[low - 1]) && (low == n - 1 || nums[low] > nums[low + 1])){
        //         index = low;
        //     }
        //     low++;
        // }
        // return index;

        // int n = nums.length; int index = 0;
        // for(int i = 0; i<n; i++){
        //     if(i == 0 || nums[i-1] < nums[i]){
        //         index = i;
        //     }
        // }
        // return index;

        int n = nums.length;
        for(int i = 0; i<n; i++){
            if((i == 0 || nums[i] > nums[i-1]) && (i == n - 1 || nums[i] > nums[i+1])){
                return i;
            }
        }
        return -1;
    }
}
