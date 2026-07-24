class Solution {
    
    public int mindiff(int arr[], int sum, int Totalsum){
        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];
        
        for(int i = 0; i <= n; i++){
            for(int j = 0; j<=sum; j++){
                if(j == 0){
                    dp[i][j] = true;
                }
            }
        }
        
        for(int i = 1; i<= n; i++){
            for(int j = 1; j<= sum; j++){
                if(arr[i-1] <= j){
                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        int s1 = 0;
        for(int j = sum; j>=0; j--){
            if(dp[n][j] == true){
                s1 = j;
                break;
            }
        }
        
        return Totalsum - 2*s1;
    }

    public int minDifference(int arr[]) {
        // Your code goes here
        int Totalsum = 0;
        for(int i = 0; i< arr.length; i++){
            Totalsum = Totalsum + arr[i];
        }
        
        return mindiff(arr,Totalsum/2,Totalsum);
    }
}
