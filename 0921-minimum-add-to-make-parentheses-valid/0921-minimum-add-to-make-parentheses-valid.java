class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0; int need = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                count++;
            }
            else if(s.charAt(i) == ')' && count != 0){
                count--;
            }
            else if(s.charAt(i) == ')' && count == 0){
                need++;
            }
        }
        return need + count;
    }
}