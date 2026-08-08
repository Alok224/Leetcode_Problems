class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       int i = 0; int j = 0; int n = s.length(); int maxlen = Integer.MIN_VALUE;
       while(j<n){
        if(map.containsKey(s.charAt(j)) == false){
            map.put(s.charAt(j),j);
        }
        else{
            int prevind = map.get(s.charAt(j));
            if(prevind >= i){
                map.put(s.charAt(j),j);
                i = prevind + 1;
            }
            else{
                map.put(s.charAt(j),j);
            }
        }
        maxlen = Math.max(maxlen,j-i+1);
        j++;
       }
    return maxlen == Integer.MIN_VALUE? 0 : maxlen;
    }
}