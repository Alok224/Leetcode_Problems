class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        if(n == 1){
            return true;
        }
        while(n != 1){
            int sumsquare = 0;
            while(n != 0){
                int digit = n % 10;
                sumsquare = sumsquare + (digit * digit);
                n = n/10;
            }
            
            if(set.contains(sumsquare)){
                return false;
            }
            else if(set.contains(sumsquare) == false){
                if(sumsquare == 1){
                    return true;
                }
                set.add(sumsquare);
            }
            
            n = sumsquare;
        }
        return false;
    }
}