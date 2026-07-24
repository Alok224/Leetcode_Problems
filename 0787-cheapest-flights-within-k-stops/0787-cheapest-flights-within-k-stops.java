class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int row = flights.length; int col = flights[0].length;
        List<List<int[]>> adjlist = new ArrayList<>();

        for(int i = 0; i<n; i++){
            adjlist.add(new ArrayList<>());
        }
        
        for(int i = 0; i<row; i++){
            
            int u = flights[i][0]; int v = flights[i][1]; int cost = flights[i][2];
            adjlist.get(u).add(new int[]{v,cost});
            
        }

        int[] costarray = new int[n];
        Arrays.fill(costarray,(int)(1e9));

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        costarray[src] = 0;
        int result = -1;
        pq.offer(new int[]{0,src,costarray[src]});
        while(pq.isEmpty() == false){
            int[] array = pq.poll();
            int stop = array[0]; int node = array[1]; int cost = array[2];
            if(stop > k) {
                continue;
            }
            for(int[] neighbour : adjlist.get(node)){
                int neighnode = neighbour[0]; int neighcost = neighbour[1];
                if(neighcost + cost < costarray[neighnode]){
                    costarray[neighnode] = neighcost + cost;
                    pq.offer(new int[]{stop+1,neighnode,costarray[neighnode]});
                }
                
            }
        }
        return costarray[dst] != (int)(1e9) ? costarray[dst] : -1;
    }
}