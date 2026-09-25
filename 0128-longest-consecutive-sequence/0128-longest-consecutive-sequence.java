class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }

        int max = 0;
        for(int num : set){
            if(set.contains(num - 1) == false){
                int length = 1;
                int i = num;
                while(set.contains(i+1) == true){
                    length = length + 1;
                    i = i+1;
                }
                max = Math.max(max,length);
            }
        }
        return max;
    }
}