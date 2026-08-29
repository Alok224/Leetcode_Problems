class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length; int m = wt.length;
        int[][] items = new int[n][2];
        
        for(int i = 0; i<n; i++){
            items[i] = new int[]{val[i],wt[i]};
        }
        // sort by value/weight ratio
        Arrays.sort(items,(a,b)->Double.compare(((double)b[0]/b[1]),((double)a[0]/a[1])));
        
        double value = 0.0;
        for(int i = 0; i<n; i++){
            if(items[i][1] <= capacity){
                value = value + items[i][0];
                capacity = capacity - items[i][1];
            }
            else{
                value = value + ((capacity / (double)items[i][1]) * items[i][0]);
                break;
            }
        }
        return value;
    }
}