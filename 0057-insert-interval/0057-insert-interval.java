class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        // int i = 0; int n = intervals.length;
        // List<int[]> list = new ArrayList<>();

        // // append non overlapping intervals in the list
        // while(i<n && newInterval[0] > intervals[i][1]){
        //     list.add(intervals[i]);
        //     i++;
        // }
        // // merge overlapping intervals
        // while(i<n && newInterval[0] <= intervals[i][1] && newInterval[1]   >= intervals[i][0]){
        //     newInterval[0] = Math.min(intervals[i][0],newInterval[0]);
        //     newInterval[1] = Math.max(intervals[i][1],newInterval[1]);
        //     i++;
        // }

        // list.add(newInterval);

        // // add remaining intervals
        // while(i<n){
        //     list.add(intervals[i]);
        //     i++;
        // }

        // return list.toArray(new int[list.size()][]);

        int n = intervals.length;
        List<int[]> list = new ArrayList<>();
        // firstly, Merge Non overlapping interval
        int i = 0;
        while(i<n && newInterval[0] > intervals[i][1]){
            list.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0] <= newInterval[1] && intervals[i][1] >= newInterval[0]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }

        list.add(newInterval);
        

        while(i<n){
            list.add(intervals[i]);
            i++;
        }
        return list.toArray(new int[list.size()][]);
    }
}