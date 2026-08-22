class Solution {
    public static int[] findnsei(int[] arr){
        int[] nsei = new int[arr.length];
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = n - 1; i>=0; i--){
            while(st.isEmpty() == false && arr[st.peek()] >= arr[i]){
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
    public static int[] findpsei(int[] arr){
        int[] psei = new int[arr.length];
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<n; i++){
            while(st.isEmpty() == false && arr[st.peek()] >= arr[i]){
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
    public static int largesthistogram(int[] arr){
        int[] nsei = findnsei(arr);
        int[] psei = findpsei(arr);
        int max = 0;
        for(int i = 0; i<arr.length; i++){
            int area = (nsei[i] - psei[i] - 1) * arr[i];
            max = Math.max(max,area);
        }
        return max;
    }
    public int maximalRectangle(char[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[] height = new int[m];
        int maxarea = 0;

        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(matrix[row][col] == '1')
                    height[col]++;
                else
                    height[col] = 0;
            }

            maxarea = Math.max(maxarea, largesthistogram(height));
        }

        return maxarea;
    }
}