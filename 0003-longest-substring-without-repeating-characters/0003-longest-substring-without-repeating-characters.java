class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0; int j = 0; int n = s.length(); int maxlen = 0;
        while(j<n){
            if(map.containsKey(s.charAt(j)) == false){
                map.put(s.charAt(j),j);
            }
            else{
                int previndex = map.get(s.charAt(j));
                map.put(s.charAt(j),j);
                if(previndex >= i){
                    i = previndex + 1;
                }
            }
            maxlen = Math.max(maxlen,j - i + 1);
            j++;
        }
        return maxlen;
    }
}