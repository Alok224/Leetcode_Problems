class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] leftarray = new int[nums.length];
        int[] rightarray = new int[nums.length];

        leftarray[0] = 1;
        for(int l = 1; l<nums.length; l++){
            leftarray[l] = nums[l-1] * leftarray[l-1];
        }
        
        rightarray[nums.length - 1] = 1;
        for(int r = nums.length - 2; r>=0; r--){
            rightarray[r] = nums[r+1] * rightarray[r+1];
        }

        for(int i = 0; i<nums.length; i++){
            nums[i] = leftarray[i] * rightarray[i];
        }

        return nums;
    }
}