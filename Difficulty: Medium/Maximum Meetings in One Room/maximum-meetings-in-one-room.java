class Solution {
    public ArrayList<Integer> maxMeetings(int[] s, int[] f) {
        int n = s.length;
        ArrayList<Integer> list = new ArrayList<>();
        int[][] meeting = new int[n][3];
        
        for(int i = 0; i<n; i++){
            meeting[i][0] = i+1;
            meeting[i][1] = s[i];
            meeting[i][2] = f[i];
        }
        
        Arrays.sort(meeting,(a,b) -> a[2] - b[2]);
        
        int lastmeeting = -1;
        for(int i = 0; i<n; i++){
            if(meeting[i][1] > lastmeeting){
                lastmeeting = meeting[i][2];
                list.add(meeting[i][0]);
            }
        }
        Collections.sort(list);
        return list;
    }
}