class Solution {
    public boolean canJump(int[] nums) {
        int maxposition = 0;
        for(int i = 0; i<nums.length; i++){
            if(maxposition < i){
                return false;
            }
            maxposition = Math.max(maxposition,i + nums[i]);
        }
        return true;
    }
}