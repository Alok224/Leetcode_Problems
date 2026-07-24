class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] Helperarr = new int[nums.length];
        int pos = 0; int neg = 1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                Helperarr[pos] = nums[i];
                pos = pos + 2;
            }
            else{
                Helperarr[neg] = nums[i];
                neg = neg + 2;
            }
        }
        for(int i = 0; i<nums.length; i++){
            nums[i] = Helperarr[i];
        }
        return nums;
    }
}