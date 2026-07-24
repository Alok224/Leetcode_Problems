class Solution {
    public int function(int a, int b, int c, String s){
        if(a < b && a < c){
            return a;
        }
        else if(a > b && c > b){
            return b;
        }
        return c;
    }
    public int numberOfSubstrings(String s) {
        int n = s.length(); int count = 0;
        int a = -1; int b = -1; int c = -1;
        int i = 0;
        while(i<n){
            if(s.charAt(i) == 'a'){
                a = i;
            }
            if(s.charAt(i) == 'b'){
                b = i;
            }
            if(s.charAt(i) == 'c'){
                c = i;
            }

            if(a != -1 && b != -1 && c != -1){
                int smallest = function(a,b,c,s);
                if(smallest != 0){
                    count = count + (smallest + 1);
                }
                else{
                    count = count + 1;
                }
            }
            i++;
        }
        return count;
    }
}