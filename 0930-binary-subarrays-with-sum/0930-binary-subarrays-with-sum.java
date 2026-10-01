class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int[] prefixsum = new int[n];
        map.put(0,1);
        int sum = 0; 
        for(int i = 0; i<n; i++){
            sum = sum + nums[i];
            prefixsum[i] = sum;
        }

        int i = 0; int count = 0;
        while(i<nums.length){
            if(map.containsKey(prefixsum[i] - goal) == true){
                count = count + map.get(prefixsum[i] - goal);
            }
            map.put(prefixsum[i],map.getOrDefault(prefixsum[i],0) + 1);
            i++;
        }
        return count;
    }
}