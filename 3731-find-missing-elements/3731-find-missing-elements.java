class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int max = -1; int min = 101;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
            if(nums[i] < min){
                min = nums[i];
            }
        }
        Arrays.sort(nums);
        int k = 0;
        for(int i = min; i <= max; i++){
           if(nums[k] != i){
             list.add(i);
           }
           else{
              k++;
           }
        }
        return list;
    }
}