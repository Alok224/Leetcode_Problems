class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int count = 0; int n = grid.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<grid[i].length; j++){
                map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int size = map.size();
        
        int[] nums = new int[size+2];
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                nums[entry.getKey()] = 1;
            }
            else if(entry.getValue() == 2){
                nums[entry.getKey()] = 2;
            }
        }
        int missing = -1; int repeating = -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                missing = i;
            }
            if(nums[i] == 2){
                repeating = i;
            }
        }
        if(missing == -1){
            missing = nums.length;
        }
        int[] ans = new int[2];
        ans[0] = repeating; ans[1] = missing;
        return ans;
    }
}