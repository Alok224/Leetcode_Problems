class Solution {
    public int findTheCity(int n, int[][] edges, int Thres) {
        // By using floyd's warshall algo
        int[][] distance = new int[n][n];
        for(int i = 0; i<n; i++){
            Arrays.fill(distance[i], (int)(1e9));
        }

        for(int[] edge : edges){
            distance[edge[0]][edge[1]] = edge[2];
            distance[edge[1]][edge[0]] = edge[2];
        }

        for(int i = 0; i<n; i++){
            distance[i][i] = 0;
        }

        for(int via = 0; via<n; via++){
            for(int i = 0; i<n; i++){
                for(int j = 0; j<n; j++){
                    distance[i][j] = Math.min(distance[i][j], distance[i][via] + distance[via][j]);
                }
            }
        }

        int maxcount = Integer.MAX_VALUE; int city = -1;
        for(int i = 0; i<n; i++){
            int count = 0;
            for(int j = 0; j<n; j++){
                if(distance[i][j] <= Thres){
                    count++;
                } 
            }
            if(maxcount > count){
                maxcount = count;
                city = i;
            }
            else if(maxcount == count){
                if(city < i){
                    city = i;
                }
            }
        }
        return city;
    }
}