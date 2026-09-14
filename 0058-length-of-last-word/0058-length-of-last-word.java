class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int n = str.length();
        int j = n-1;
        int i = j; int count = 0;
        while(i>=0){
            if(str.charAt(i) == ' '){
                break;
            }
            else{
                count = count + 1;
            }
            i--;
        }
        return count;
    }
}