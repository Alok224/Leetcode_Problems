class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); int n = nums.length; int closestsum = Integer.MAX_VALUE; int prevdiff = Integer.MAX_VALUE;
        
        for(int i = 0; i<n-2; i++){
            int j = i+1; int k = n - 1;
            
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return sum;
                }
                int difference = Math.abs(target - sum);
                if(difference < prevdiff){
                    prevdiff = difference;
                    closestsum = sum;
                }
                if(sum < target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return closestsum;
    }
}