class Solution {
    public int function(int[][] mat, int mid, int n, int m){
        int index = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(max < mat[i][mid]){
                max = mat[i][mid];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        int n = mat.length; int m = mat[0].length;
        int low = 0; int high = m - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int maxrowvalueindex = function(mat,mid,n,m);
            int left = (mid - 1) >= 0 ? mat[maxrowvalueindex][mid - 1] : -1;
            int right = (mid + 1) < m ? mat[maxrowvalueindex][mid + 1] : -1;

            if(mat[maxrowvalueindex][mid] > left && mat[maxrowvalueindex][mid] > right){
                result[0] = maxrowvalueindex;
                result[1] = mid;
                return result;
            }
            else if(mat[maxrowvalueindex][mid] < left){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return result;
    }
}