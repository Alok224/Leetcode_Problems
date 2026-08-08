class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length(); int m = needle.length();
        if(m>n){
            return -1;
        }
        for(int i = 0; i<=n-m; i++){
            int j = 0; boolean flag = true;
            while(j<m){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    flag = false;
                    break;
                }
                j++;
            }
            if(flag == true){
                return i;
            }
        }
        return -1;

        
    }
}