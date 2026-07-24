class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        if(intervals.length == 1){
            return intervals;
        }

        for(int i = 0; i < intervals.length; i++){
            int start1 = intervals[i][0];
            int end1 = intervals[i][1];

            if(result.size() == 0){
                result.add(intervals[i]);
                continue;
            }
            int j = result.size() - 1;
            int[] arr = result.get(j);
            if(arr[1] >= start1 && arr[1] <= end1){
                arr[1] = end1;
            }
            else if(arr[1] > end1){
                continue;
            }
            else{
                result.add(new int[]{start1,end1});
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}