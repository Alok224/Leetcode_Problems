class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] prefixsum = new int[nums.length];
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum = sum + nums[i];
            prefixsum[i] = sum;
        }
        int count = 0;
        map.put(0,1); int j = 0;
        while(j<prefixsum.length){
            if(map.containsKey(prefixsum[j] - goal) == true){
                count = count + map.get(prefixsum[j] - goal);
            }
            map.put(prefixsum[j],map.getOrDefault(prefixsum[j],0) + 1);
            j++;
        }
        return count;
    }
}