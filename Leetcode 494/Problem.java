class Solution {
    public int targetsum(int nums[], int target, int sum,int totalsum){
        int n = nums.length;
        int[][] dp = new int[n+1][sum+1];

        for(int i = 0; i<=n; i++){
            for(int j = 0; j<=sum; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = 1;
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }

        for(int i = 1; i<=n; i++){
            for(int j = 0; j<=sum; j++){
                if(nums[i-1] <= j){
                    dp[i][j] = dp[i-1][j-nums[i-1]] + dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public int findTargetSumWays(int[] nums, int target) {
        
        int totalsum = 0;
        for(int i = 0; i<nums.length; i++){
            totalsum = totalsum + nums[i];
        }
        if(Math.abs(target) > totalsum || (target + totalsum)%2 != 0){
            return 0;
        }
        return targetsum(nums,target,(totalsum + target)/2,totalsum);
    }
}