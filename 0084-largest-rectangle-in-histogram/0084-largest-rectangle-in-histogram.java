class Solution {
    public static int[] findnsei(int[] heights){
        int[] nsei = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        for(int i = n - 1; i>=0; i--){
            while(st.isEmpty() == false && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty() == true){
                nsei[i] = n;
            }
            else{
                nsei[i] = st.peek();
            }
            st.push(i);
        }
        return nsei;
    }
    public static int[] findpsei(int[] heights){
        int[] psei = new int[heights.length];
        Stack<Integer> st = new Stack<>();
        int n = heights.length;
        for(int i = 0; i<n; i++){
            while(st.isEmpty() == false && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if(st.isEmpty() == true){
                psei[i] = -1;
            }
            else{
                psei[i] = st.peek();
            }
            st.push(i);
        }
        return psei;
    }
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nsei = findnsei(heights);
        int[] psei = findpsei(heights);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            int area = (nsei[i] - psei[i] - 1) * heights[i];
            max = Math.max(max,area);
        }
        return max;
    }
}