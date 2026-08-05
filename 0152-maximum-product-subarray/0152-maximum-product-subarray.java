class Solution {
    public int maxProduct(int[] nums) {
        // int left = 0; int right = nums.length - 1; int mulleft = 1; int mulright = 1; int max = nums[left];
        // while(left<nums.length && right>=0){
        //     mulleft = mulleft * nums[left];
        //     mulright = mulright * nums[right];
        //     max = Math.max(max,Math.max(mulleft,mulright));
        //     if(nums[left] == 0){
        //         mulleft = 1;
        //         max = Math.max(max,0);
        //     }
        //     if(nums[right] == 0){
        //         mulright = 1;
        //         max = Math.max(max,0);
        //     }
        //     left++;
        //     right--;
        // }
        // return max;

        // kadane Algo
        // int max = nums[0];
        // int mul = 1;
        // int i = 0;
        // while(i<nums.length){
        //     mul = mul * nums[i];
        //     max = Math.max(max,mul);
        //     if(mul<=0){    
        //         mul = 1;
        //     }
        //     i++;
        // }
        // return max;

        int prodleft = 1; int prodright = 1; int i = 0; int j = nums.length - 1;
        int max = Integer.MIN_VALUE;

        while(i<nums.length && j>=0){
            prodleft = prodleft * nums[i];
            prodright = prodright * nums[j];
            max = Math.max(max,Math.max(prodleft,prodright));
            if(nums[i] == 0){
                prodleft = 1;
            }
            if(nums[j] == 0){
                prodright = 1;
            }
            i++;j--;
        }


    return max;
           
    }
}
