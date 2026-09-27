class Solution {
    public int maxProduct(int[] nums) {
        int leftprod = 1; int rightprod = 1;
        int i = 0; int j = nums.length - 1;
        int max = Integer.MIN_VALUE;
        while(i<nums.length && j >= 0){
            leftprod = leftprod * nums[i];
            rightprod = rightprod * nums[j];
            max = Math.max(max,Math.max(leftprod,rightprod));
            if(leftprod == 0){
                leftprod = 1;
            }
            if(rightprod == 0){
                rightprod = 1;
            }
            i++; j--;
        }
        return max;
    }
}