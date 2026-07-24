class Solution {
    public boolean function(int[] matrix, int target){
        int low = 0; int high = matrix.length - 1;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(matrix[mid] == target){
                return true;
            }
            else if(matrix[mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        for(int i = 0; i<n; i++){
            boolean trueorfalse = function(matrix[i],target);
            if(trueorfalse == true){
                return true;n
            }
        }
        return false;
    }
}