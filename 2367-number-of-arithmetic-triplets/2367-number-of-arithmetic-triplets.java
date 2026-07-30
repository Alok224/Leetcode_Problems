class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n = nums.length; int count = 0;
        for(int i = 0; i<n; i++){
            boolean flag1 = false;
            int j = i+1; int k = n - 1;
            while(flag1 == false && j<k){
                if(nums[j] - nums[i] == diff){
                    flag1 = true;
                    break;
                }
                else if(nums[j] - nums[i] < diff){
                    j++;
                }
                else{
                    break;
                }
            }
            boolean flag2 = false;
            while(flag2 == false && j<k){
                if(nums[k] - nums[j] == diff){
                    flag2 = true;
                    break;
                }
                else if(nums[k] - nums[j] > diff){
                    k--;
                }
                else{
                    break;
                }
            }
            if(flag1 == true && flag2 == true){
                count++;
            }
        }
        return count;
    }
}