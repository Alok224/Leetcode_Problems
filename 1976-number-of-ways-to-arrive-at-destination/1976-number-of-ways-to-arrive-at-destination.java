class Solution {
    public int countPaths(int m, int[][] roads) {
        List<List<long[]>> adjlist = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            adjlist.add(new ArrayList<>());
        }

        int n = roads.length;
        for(int i = 0; i < n; i++) {
            int u = roads[i][0];
            int v = roads[i][1];
            int weight = roads[i][2];
            adjlist.get(u).add(new long[] {v, weight});
            adjlist.get(v).add(new long[] {u, weight});
        }

        int[] ways = new int[m];
        ways[0] = 1;
        long[] distarray = new long[m];
        Arrays.fill(distarray, Long.MAX_VALUE);
        distarray[0] = 0;
        PriorityQueue<long[]> pq = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
        int mod = (int) (1e9 + 7);

        pq.offer(new long[] { distarray[0], 0 });
        while (pq.isEmpty() == false) {
            long[] array = pq.poll();
            long dist = array[0];
            int node = (int) array[1];
            for (long[] neighbour : adjlist.get(node)) {
                int neighnode = (int) neighbour[0];
                long costdist = neighbour[1];
                if (dist + costdist < distarray[neighnode]) {
                    distarray[neighnode] = dist + costdist;
                    ways[neighnode] = ways[node];
                    pq.offer(new long[] { distarray[neighnode], neighnode });
                } else if (dist + costdist == distarray[neighnode]) {
                    ways[neighnode] = (ways[neighnode] + ways[node]) % mod;
                }
            }
        }
        return ways[m - 1] % mod;
    }
}