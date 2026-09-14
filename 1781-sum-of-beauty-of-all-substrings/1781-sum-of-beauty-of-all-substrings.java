class Solution {
    public int beautySum(String s) {
        int i = 0;
        int n = s.length(); int count = 0;
        while(i<s.length()){
            int j = i;
            HashMap<Character, Integer> map = new HashMap<>();
            int max = 0; int min = 0;
            while(j<s.length()){
                map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0) + 1);
                max = Collections.max(map.values());
                min = Collections.min(map.values());
                if(max - min >= 1){
                    count = count + (max - min);
                }
                j++;
            }
            i++;
        }
        return count;
    }
}