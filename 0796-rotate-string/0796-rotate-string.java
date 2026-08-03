class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        String string = s + s;
        for(int i = 0; i<=string.length() - goal.length(); i++){
            int j = 0; boolean flag = true;
            while(j<goal.length()){
                if(goal.charAt(j) != string.charAt(i+j)){
                    flag = false;
                    break;
                }
                j++;
            }
            if(flag == true){
                return true;
            }
        }
        
        return false;
    }
}