class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i = 0;
        int j = 0;
        // create a map
        HashMap<Integer, Integer> map = new HashMap<>();
         while (j < nums.length) {
            if (map.containsKey(nums[j]) == true){
                // check distance
                if (j - map.get(nums[j]) <= k) {
                    return true;
                }
            }
           
                // update last index
                map.put(nums[j], j);
                j++;
           
        }
        
        return false;
    }
}