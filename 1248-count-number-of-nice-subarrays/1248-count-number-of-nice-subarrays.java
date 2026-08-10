class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // Same as leetcode 930 question
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] prefixsum = new int[nums.length];
        // even = 1, odd = 0
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] % 2 != 0){
                nums[i] = 1;
            }
            else{
                nums[i] = 0;
            }
            sum = sum + nums[i];
            prefixsum[i] = sum;
        }

        map.put(0,1);
        int j = 0;
        int count = 0;
        while(j<nums.length){
            if(map.containsKey(prefixsum[j] - k) == true){
                count = count + map.get(prefixsum[j] - k);
            }
            map.put(prefixsum[j],map.getOrDefault(prefixsum[j],0) + 1);
            j++;
        }
        return count;
    }
}