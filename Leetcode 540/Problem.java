class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int low = 1; int high = nums.length - 2; int ans = 0;
        
        if(nums[low] != nums[low - 1]){
            return nums[low - 1];
        }
        if(nums[high] != nums[high + 1]){
            return nums[high + 1];
        }

        while(low <= high){
            int mid = low + ((high - low)/2);

            if(nums[mid] == nums[mid - 1]){
                if(mid % 2 == 0 && (mid - 1) % 2 != 0){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else if(nums[mid] == nums[mid + 1]){
                if(mid % 2 != 0 && (mid + 1) % 2 == 0){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                ans = nums[mid];
                break;
            }
        }
        return ans;
    }
}