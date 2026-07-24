// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//         List<Integer> list = new ArrayList<>();
//         Arrays.sort(nums);
//         int n = nums.length / 3;
//         if(n == 0){
//             for(int num : nums){
//                 list.add(num);
//             }
//             return list;
//         }
//         int i = 1; int count = 1;
//         while(i<nums.length){
//             if(nums[i] == nums[i-1]){
//                 count = count + 1;
//             }
//             else{ 
//                 count = 1;
//             }
//             i++;
//         }
//         return list;
//     }
// }



class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // Better soln
        
        // List<Integer> list = new ArrayList<>();
        // int n = nums.length / 3;

        // Arrays.sort(nums);

        // int count = 1;

        // for (int i = 1; i <= nums.length; i++) {
        //     if (i < nums.length && nums[i] == nums[i - 1]) {
        //         count++;
        //     } else {
        //         if (count > n) {
        //             list.add(nums[i - 1]);
        //         }
        //         count = 1;
        //     }
        // }
        // return list;

        // HashMap Soln
        // HashMap<Integer, Integer> map = new HashMap<>();
        // List<Integer> list = new ArrayList<>();
        // int n = (nums.length / 3) + 1;
        // for(int i = 0; i<nums.length; i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        //     if(map.get(nums[i]) == n){
        //         list.add(nums[i]);
        //     }
        // }
        // return list;

        // Boyer's Moore Voting Algo
        List<Integer> list = new ArrayList<>();
        int element1 = 0; int element2 = 0; int count1 = 0; int count2 = 0;
        int n = nums.length / 3;
        for(int i = 0; i<nums.length; i++){
            if(count1 == 0 && element2 != nums[i]){
                count1++;
                element1 = nums[i];
            }
            else if(count2 == 0 && element1 != nums[i]){
                count2++;
                element2 = nums[i];
            }
            else if(element1 == nums[i]){
                count1 = count1 + 1;
            }
            else if(element2 == nums[i]){
                count2 = count2 + 1;
            }
            else{
                count1 = count1 - 1;
                count2 = count2 - 1;
            }
        }

        // verify the elements
        int count3 = 0; int count4 = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == element1){
                count3 = count3 + 1;
            }
            else if(nums[i] == element2){
                count4 = count4 + 1;
            }
        }
        if(count3 > n){
            list.add(element1);
        }
        if(count4 > n){
            list.add(element2);
        }
        return list;
    }
}
