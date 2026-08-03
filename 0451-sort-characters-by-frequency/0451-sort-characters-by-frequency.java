class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            int key = (int)entry.getKey();
            int value = entry.getValue();
            pq.offer(new int[]{key,value});
        }

        StringBuilder sb = new StringBuilder();
        while(pq.isEmpty() == false){
            int[] array = pq.poll();
            char ch = (char)array[0]; int freq = array[1];
            while(freq != 0){
                sb.append(ch);
                freq--;
            }
        }
        return sb.toString();
    }
}