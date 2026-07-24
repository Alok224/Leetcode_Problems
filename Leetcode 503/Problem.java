class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int[] result = new int[n];
        int i = 2 * n - 1;
        while(i>=0){
            int a = i % n;
            while(st.isEmpty() == false && st.peek() <= nums[a]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty() == false){
                    result[i] = st.peek();
                }
                else{
                    result[i] = -1;
                }
            }
            st.push(nums[a]);
            i--;
        }
        return result;
    }
}