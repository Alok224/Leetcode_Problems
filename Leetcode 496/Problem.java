import java.util.Stack;
public class Problem {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nge = new int[nums2.length];
        Stack<Integer> st = new Stack<>();
        int i = nums2.length - 1;
        while(i>=0){
            while(st.isEmpty() == false && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.isEmpty() == true){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }
            st.push(nums2[i]);
            i--;
        }

        int j = 0;
        while(j<nums1.length){
            int k = 0;
            while(k<nums2.length){
                if(nums1[j] == nums2[k]){
                    nums1[j] = nge[k];
                    break;
                }
                k++;
            }
            j++;
        }
        return nums1;
    }
} 
