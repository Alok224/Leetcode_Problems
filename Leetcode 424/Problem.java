class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0; int j = 0; int maxlen = 0; int maxfreq = 0;
        while(j<s.length()){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0) + 1);
            maxfreq = Math.max(maxfreq,map.get(s.charAt(j)));
            while(((j-i+1) - maxfreq) > k){
                map.put(s.charAt(i),map.get(s.charAt(i)) - 1);
                maxfreq = Collections.max(map.values());
                i++;
            }
            if(((j-i+1) - maxfreq) <= k){
                maxlen = Math.max(maxlen,j-i+1);
            }
            j++;
        }
        return maxlen;
    }
}