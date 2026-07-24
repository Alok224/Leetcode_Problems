class Solution {
    public int majorityElement(int[] nums) {
        // by using hashing
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int k = nums.length / 2;
        // int i = 0;
        // while(i<nums.length){
        //     map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
        //     i++;
        // }
        // int key = 0;
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //     Integer value = entry.getValue();
        //     if(value > k){
        //         key = entry.getKey();
        //     }
        // }
        // return key;


        // for optimal soln

        // follow the moore's voting algorithm
        int i = 0; int count = 0; int element = 0;
        while(i<nums.length){
            if(count == 0){
                element = nums[i];
                count++;
            }
            else if(nums[i] == element){
                count++;
            }
            else{
                count--;
            }
            i++;
        }

        int n = nums.length / 2; int count2 = 0; int ans = 0;
        for(int k = 0; k<nums.length; k++){
            if(nums[k] == element){
                count2++;
            }
            if(count2 > n){
                ans = element;
            }
        }
        return ans;
    }
}