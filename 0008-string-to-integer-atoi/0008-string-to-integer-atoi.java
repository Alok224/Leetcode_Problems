class Solution {
    public int myAtoi(String s) {
        int n = s.length();
        if(s.length() == 0){
            return 0;
        }
        int i = 0; 
        while(i<n && s.charAt(i) == ' '){
            i++;
        }
        if(i == n){
            return 0;
        }
        int sign = 1;
        if(s.charAt(i) == '-'){
            sign = -1;
            i++;
        }
        else if(s.charAt(i) == '+'){
            sign = 1;
            i++;
        }
        
        long value = 0; int max = Integer.MAX_VALUE; int min = Integer.MIN_VALUE;
        while(i<n && Character.isDigit(s.charAt(i)) == true){
            int digit = s.charAt(i) - 48;
            value = value * 10 + digit;
            if(value * sign <= min){
                return min;
            }
            if(value * sign >= max){
                return max;
            }
            i++;
        }
        return sign * (int)value;
    }
}