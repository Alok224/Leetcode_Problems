class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int i = 0;
        int j = 0;
        int sum = 0;
        int max = 0;
        
        while(j < arr.length){
            sum = sum + arr[j];
            if(j-i+1 < k){
                j++;
            }
            
            else if(j-i+1 == k){
                max = Math.max(max,sum);
                sum = sum - arr[i];
                j++;
                i++;
            }
        }
        return max;
    }
}