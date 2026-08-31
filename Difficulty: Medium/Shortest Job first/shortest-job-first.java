class Solution {
    static int solve(int bt[]) {
       int n = bt.length;
       int[] ct = new int[n];
       int[] wt = new int[n];
       
       Arrays.sort(bt);
       ct[0] = bt[0];
       for(int i = 1; i<n; i++){
           ct[i] = bt[i] + ct[i-1];
       }
      
       for(int i = 0;i<n; i++){
           wt[i] = ct[i] - bt[i];
       }
       int totaltime = 0;
       for(int i = 0; i<n; i++){
           totaltime = totaltime + wt[i];
       }
       
       double result = Math.floor(totaltime/n);
       return (int) result;
    }
}
