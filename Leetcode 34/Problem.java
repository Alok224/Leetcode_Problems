class Solution {
    public int firstpos(int[] nums, int target){
        int low = 0; int high = nums.length - 1;
        int ans1 = -1;
        while(low<=high){
            int mid  = low + ((high - low)/2);
            if(nums[mid] == target){
                ans1 = mid;
                high = mid - 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans1;
    }

    public int lastpos(int[] nums, int target){
        int low = 0; int high = nums.length - 1;
        int ans2 = -1;
        while(low<=high){
            int mid = low + ((high - low)/2);
            if(nums[mid] == target){
                ans2 = mid;
                low = mid + 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans2;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = firstpos(nums,target);
        result[1] = lastpos(nums,target);
        return result;
    }
}