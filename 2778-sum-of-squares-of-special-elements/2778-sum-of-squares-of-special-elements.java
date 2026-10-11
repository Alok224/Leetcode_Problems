class Solution {
    public int sumOfSquares(int[] nums) {
        int i = 0; int n = nums.length; int sum = 0;
        while(i<nums.length){
            if(n % (i+1) == 0){
                sum = sum + (nums[i] * nums[i]);
            }
            i++;
        }
        return sum;
    }
}