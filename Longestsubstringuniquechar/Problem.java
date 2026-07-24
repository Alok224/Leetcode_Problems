class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int max = 0;

        // traverse entire substring
        while(j<s.length()){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);

            // Then, check the entire map that contain the key have value more than 1
            
            for(char key: map.keySet()){
                // remove the i
                if(map.get(key) > 1){
                    map.put(s.charAt(i),map.get(s.charAt(i)) -1);
                    if(map.get(key) == 0){
                        map.remove(key);
                    }
                    i++;
                }
            }

            max = Math.max(max, j-i+1);
            j++;
        }
        return max;
    }
}