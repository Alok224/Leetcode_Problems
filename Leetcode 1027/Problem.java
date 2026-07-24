class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        // 2d dp
        int[][] dp = new int[n+1][1001];
        int max = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                int diff = nums[i] - nums[j] + 500;

                if(dp[j][diff] == 0){
                    dp[i][diff] = 2;
                }
                else{
                    dp[i][diff] = dp[j][diff] + 1;
                }
                max = Math.max(max,dp[i][diff]);
            }
        }
        return max;
    }
}