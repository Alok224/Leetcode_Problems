class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();

        int[] freq = new int[26];

        for(int i = 0; i<p.length(); i++){
            freq[p.charAt(i) - 'a']++;
        }

        int[] freq1 = new int[26];
        int i = 0; int j = 0;
        while(j<s.length()){
            freq1[s.charAt(j) - 'a']++;

            if((j-i+1) == p.length()){
                boolean flag = true;
                for(int k = 0; k<26; k++){
                    if(freq[k] != freq1[k]){
                        // freq1[s.charAt(i) - 'a']--;
                        // i++;
                        flag = false;
                        break;
                    }
                }
                if(flag == true){
                    list.add(i);
                    
                }
                freq1[s.charAt(i) - 'a']--;
                i++;
            }
            j++;
        }
        return list;
    }
}