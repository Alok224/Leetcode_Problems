class Solution {
    // better soln(But gives tle)
    // public boolean linearsearch(int[] nums,int element){
    //     for(int i = 0; i<nums.length; i++){
    //         if(element == nums[i]){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public int longestConsecutive(int[] nums) {
    //     Arrays.sort(nums);
    //     int max = 0;
    //     for(int i = 0; i<nums.length; i++){
    //         int count = 1; int element = nums[i];
    //         while(linearsearch(nums,element + 1) == true){
    //             element = element + 1;
    //             count++;
    //         }
    //         max = Math.max(max,count);
    //     }
    //     return max;



            // optimal soln
            HashSet<Integer> set = new HashSet<>();
            for(int num : nums){
                set.add(num);
            }

            int max = 0;
            for(int num : set){
                if(!set.contains(num-1)){
                    int length = 1;
                    int i = num;
                    while(set.contains(i+1)){
                        length = length + 1;
                        i = i + 1;
                    }
                    max = Math.max(max,length);
                }
            }
            return max;
    }
}