class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Arrays.sort(nums);
        // List<List<Integer>> List = new ArrayList<>();
        // int target = 0;
        // for(int i = 0; i<nums.length - 2; i++){
        //     if(i>0 && nums[i] == nums[i - 1]){
        //         continue;
        //     }
        //     int j = i + 1; int k = nums.length - 1;
        //     while(j<k){
        //         int sum = nums[i] + nums[j] + nums[k];
        //         if(sum == target){
        //             List.add(Arrays.asList(nums[i], nums[j], nums[k]));
        //             while(j<k && nums[j] == nums[j+1]){
        //                 j++;
        //             }
        //             while(j<k && nums[k] == nums[k-1]){
        //                 k--;
        //             }
        //             j++;
        //             k--;
        //         }
        //         else if(sum > target){
        //             k--;
        //         }
        //         else if(sum < target){
        //             j++;
        //         } 
        //     }
        // }
        // return List;

        Arrays.sort(nums); int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<n-2; i++){
            int j = i+1; int k = n - 1;
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; k--;
                    while(j<k && nums[j] == nums[j-1]){
                        j++;
                    }
                    while(j<k && nums[k] == nums[k+1]){
                        k--;
                    }
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return result;
    }
}