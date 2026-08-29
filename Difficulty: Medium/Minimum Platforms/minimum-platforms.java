class Solution {
    public int minPlatform(int arr[], int dept[]) {
        Arrays.sort(arr); Arrays.sort(dept);
        
        int i = 0; int j = 0; int maxcount = Integer.MIN_VALUE; int count = 0;
        while(i<arr.length && j<dept.length){
            if(arr[i] <= dept[j]){
                count = count + 1;
                i++;
            }
            else{
                count = count - 1;
                j++;
            }
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }
}
