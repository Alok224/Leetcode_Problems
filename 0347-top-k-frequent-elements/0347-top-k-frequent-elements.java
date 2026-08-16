class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1] - a[1]);

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.offer(new int[]{entry.getKey(),entry.getValue()});
        }

        int[] result = new int[k];
        int i = 0;
        while(k!=0){
            int[] array = pq.poll();
            result[i] = array[0];
            i++;
            k--;
        }
        return result;
    }
}