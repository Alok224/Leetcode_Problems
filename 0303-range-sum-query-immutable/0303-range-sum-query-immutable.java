class NumArray {

    public int[] prefixsum;

    public NumArray(int[] nums) {
        // prefixsum = new int[nums.length + 1];
        // int sum = 0;
        
        // prefixsum[0] = 0;
        // for(int i = 0; i<nums.length; i++){
        //     sum = sum + nums[i];
        //     prefixsum[i+1] = sum;
        // }
        prefixsum = new int[nums.length];
        int sum = 0; int n = nums.length;
        for(int i = 0; i<n; i++){
            sum = sum + nums[i];
            prefixsum[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        // int answer;
        // answer = prefixsum[right + 1] - prefixsum[left];
        // return answer;
        int sum = 0;
        if(left == 0){
            sum = prefixsum[right] - 0;
            return sum;
        }
        sum = prefixsum[right] - prefixsum[left - 1];
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */