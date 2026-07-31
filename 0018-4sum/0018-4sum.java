class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // Arrays.sort(nums);
        // List<List<Integer>> List = new ArrayList<>();
        // for(int i = 0; i<nums.length - 3; i++){
        //     if(i>0 && nums[i] == nums[i-1]){
        //         continue;
        //     }
        //     for(int j = i + 1; j<nums.length - 2; j++){
        //         int k = j + 1; int l = nums.length - 1;
        //         if(j > i + 1 && nums[j] == nums[j-1]){
        //             continue;
        //         }
        //         while(k < l){
        //             long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
        //             if(sum == target){
        //                 List.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

        //                 while(k<l && nums[k] == nums[k+1]){
        //                     k++;
        //                 }
        //                 while(k<l && nums[l] == nums[l-1]){
        //                     l--;
        //                 }
        //                 k++;
        //                 l--;
        //             }
        //             else if(sum > target){
        //                 l--;
        //             }
        //             else{
        //                 k++;
        //             }
        //         }
        //     }
        // }
        // return List;



        Arrays.sort(nums); int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<n-3; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i+1; j<n-2; j++){
                if(j> i + 1 && nums[j] == nums[j-1]){
                    continue;
                }
                int k = j+1; int l = n-1;
                while(k<l){
                    long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target){
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        while(k<l && nums[k] == nums[k+1]){
                            k++;
                        }
                        while(k<l && nums[l] == nums[l-1]){
                            l--;
                        }
                        k++; l--;
                    }
                    else if(sum < target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return result;
    }
}