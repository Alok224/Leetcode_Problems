class Solution {
    public boolean checkDivisibility(int n) {
        int m = n; int p = n; int mul = 1;
        while(m!=0){
            int digit = m % 10;
            mul = mul * digit;
            m = m/10;
        }

        int sum = 0;
        while(p!=0){
            int digit = p % 10;
            sum = sum + digit;
            p = p/10;
        }
        int value = sum + mul;
        if(n % value == 0){
            return true;
        }
        return false;
    }
}