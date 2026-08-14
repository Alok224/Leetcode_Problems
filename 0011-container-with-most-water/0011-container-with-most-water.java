class Solution {
    public int maxArea(int[] height) {
        int max = 0; int n = height.length;
        int i = 0; int j = n - 1; int area = 0;
        while(i<j){
           area = Math.max(area,Math.min(height[i],height[j]) * (j - i));
           if(height[i] <= height[j]){
                i++;
           }
           else{
            j--;
           }
        }
        return area;
    }
}