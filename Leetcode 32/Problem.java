class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();

        // 1d array
        int[] dp = new int[n];
        int maxlen = 0;

        for(int i = 1; i<n; i++){
            if(s.charAt(i) == ')'){
                if(s.charAt(i-1) == '('){
                    dp[i] = (i>=2? dp[i-2] : 0) + 2;
                }
                else if(i- dp[i-1] -1 >=0 && s.charAt(i-dp[i-1] -1) == '('){
                    dp[i] = dp[i-1] + 2;
                    if(i-dp[i-1] -2 >=0){
                        dp[i] += dp[i-dp[i-1]-2];
                }
            }
            maxlen = Math.max(maxlen,dp[i]);
        }
    }
        return maxlen;
    }
}