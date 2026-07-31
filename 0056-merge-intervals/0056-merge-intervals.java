class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list  = new ArrayList<>(); int n = intervals.length;
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        int[] newinterval = new int[2];
        newinterval = intervals[0];
        for(int i = 1; i<n; i++){
            if(newinterval[0] <= intervals[i][1] && newinterval[1] >= intervals[i][0]){
                newinterval[0] = Math.min(newinterval[0], intervals[i][0]);
                newinterval[1] = Math.max(newinterval[1], intervals[i][1]);
            }
            else{
                list.add(newinterval);
                newinterval = intervals[i];
            }
        }
        list.add(newinterval);
        return list.toArray(new int[list.size()][]);
    }
}