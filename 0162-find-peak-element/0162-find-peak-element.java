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




        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[mid + 1]) {
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }
}
