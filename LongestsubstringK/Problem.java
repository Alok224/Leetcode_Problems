class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int i = 0;
        int j = 0;
        int max = 0;
        // create a map
        HashMap<Character, Integer> map = new HashMap<>();
        //  while loop
        while(j<s.length()){
            // put the string characters
             map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
             
             if(map.size() < k){
                 j++;
             }
             
             if(map.size() > k){
                //  decrease the sliding by 1
                while(map.size() > k){
                    map.put(s.charAt(i),map.get(s.charAt(i)) -1);
                    
                    if(map.get(s.charAt(i)) == 0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
             }
             
             if(map.size() == k){
                 max = Math.max(max,j-i+1);
                 j++;
             }
        }
        // if I don't get the equality of uniQue characters
        if(map.size() != k){
            return -1;
        }
        return max;
    }
}