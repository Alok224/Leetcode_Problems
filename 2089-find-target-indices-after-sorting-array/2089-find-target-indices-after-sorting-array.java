class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int i = 0; int n = nums.length;
        while(i<n){
            if(nums[i] == target){
                list.add(i);
            }
            i++;
        }
        return list;
    }
}