class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length; int m = matrix[0].length;
        // int[][] ans = new int[n][m];
        // for(int i = 0; i<n; i++){
        //     int col = m - i - 1;
        //     for(int j = 0; j<m; j++){
        //         ans[j][col] = matrix[i][j];
        //     }
        // }

        // for(int i = 0; i<n; i++){
        //     for(int j = 0; j<n; j++){
        //         matrix[i][j] = ans[i][j];
        //     }
        // }

        // inplace
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<m; j++){
                // transpose
                int temp;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // revrerse
        for(int i = 0; i<n; i++){
            int left = 0; int right = m - 1;
            while(left<right){
                int temp;
                temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++; right--;
            }
        }
    }
}