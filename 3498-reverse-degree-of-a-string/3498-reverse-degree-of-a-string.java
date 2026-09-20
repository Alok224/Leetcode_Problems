class Solution {
    public int reverseDegree(String s) {
        int[] nums = new int[26];
        int k = 26;
        for(int i = 0; i<26; i++){
            nums[i] = k;
            k--;
        }

        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            sum = sum + nums[(int)(s.charAt(i)) - 'a'] * (i+1);
        }
        return sum;
    }
}