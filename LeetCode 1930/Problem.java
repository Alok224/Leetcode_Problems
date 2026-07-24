class Solution {
    public int countPalindromicSubsequence(String s) {
        // Create a Hashset
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        // [a,b,c]
        
        int result = 0;

        for(char ch:set){
            int left_index = -1;
            int right_index = -1;

            for(int l = 0; l<s.length(); l++){
                if(s.charAt(l) == ch){
                    if(left_index == -1){
                        left_index = l;
                    }a        
                    right_index = l;
                }
            }
            // Another set
            HashSet<Character> st = new HashSet<>();
            for(int middle = left_index + 1; middle<=right_index -1; middle++){
                st.add(s.charAt(middle));
            }
            result = result + st.size();
        }
    
    return result;
    }
}