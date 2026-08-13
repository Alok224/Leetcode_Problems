class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];

        for(int i = 0; i<s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }

        int[] freq1 = new int[26];

        int i = 0; int j = 0;
        while(j<s2.length()){
            freq1[s2.charAt(j) - 'a']++;

            if((j-i+1) == s1.length()){
                boolean flag = true;
                for(int k = 0; k<26; k++){
                    if(freq[k] != freq1[k]){
                        flag = false;
                        freq1[s2.charAt(i) - 'a']--;
                        i++;
                        break;
                    }
                }
                if(flag == true){
                    return true;
                }
            }
            j++;
        }
        return false;
    }
}