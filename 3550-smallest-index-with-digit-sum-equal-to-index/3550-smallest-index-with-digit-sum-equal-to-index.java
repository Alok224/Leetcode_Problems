class Solution {
    public int smallestIndex(int[] nums) {
        int n = nums.length; int min = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            int sum = 0; int value = nums[i];
            while(value != 0){
                sum = sum + value % 10;
                value = value / 10;
            }
            if(sum == i){
                min = Math.min(min,i);
            }
        }
        return min == Integer.MAX_VALUE? -1 : min;
    }
}