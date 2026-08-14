class Solution {
    public void swap(int i, int j, int[] nums){
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
    //     int count1 = 0; int count2 = 0; int count3 = 0;
    //    for(int i = 0; i<nums.length; i++){
    //         if(nums[i] == 0){
    //             count1 = count1 + 1;
    //         }
    //         else if(nums[i] == 1){
    //             count2 = count2 + 1;
    //         }
    //         else{
    //             count3 = count3 + 1;
    //         }
    //    }

    //    int k = 0;
    //    while(count1 > 0){
    //     nums[k] = 0;
    //     k++;
    //     count1 = count1 - 1;
    //    }
    //    while(count2 > 0){
    //     nums[k] = 1;
    //     k++;
    //     count2 = count2 - 1;
    //    }
    //    while(count3 > 0){
    //     nums[k] = 2;
    //     k++;
    //     count3 = count3 - 1;
    //    }
    int zero = 0; int one = 0; int two = nums.length - 1;
    while(one<=two){
        if(nums[one] == 2){
            swap(one,two,nums);
            two--;
        }
        else if(nums[one] == 0){
            swap(zero,one,nums);
            zero++;
            one++;
        }
        else{
            one++;
        }
    }
    }
}