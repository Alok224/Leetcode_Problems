class Solution {
    public boolean subsetsum(int nums[],int sum){
        int n = nums.length;
        // define a dp table that store true or false
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // intialization
        for(int i = 0; i<=n;i++){
            for(int j = 0;j<=sum;j++){
                if(j == 0){
                    dp[i][j] = true;
                }
                if(i == 0 && j != 0){
                    dp[i][j] = false;
                }
            }
        }

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=sum; j++){
                if(nums[i-1] <= j){
                    dp[i][j] = dp[i-1][j - nums[i - 1]] || dp[i - 1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        // answer 
        return dp[n][sum];
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            sum = sum + nums[i];
        }

        if(sum % 2 != 0){
            return false;
        }
        
        return subsetsum(nums,sum/2);
    }
}