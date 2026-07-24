import java.util.*;
class Problem {
    public static int[] findnsei(int[] arr){
        int n = arr.length;
        int[] nsei = new int[n]; 
        Stack<Integer> st = new Stack<>();

        int i = n - 1;
        while(i >= 0){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            nsei[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
            i--;
        }
        return nsei;
    }

    public static int[] findpseei(int[] arr){
        int n = arr.length;
        int[] pseei = new int[n]; 
        Stack<Integer> st = new Stack<>();

        int i = 0;
        while(i < n){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            pseei[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
            i++;
        }
        return pseei;
    }

    public int sumSubarrayMins(int[] arr) {
        int[] nsei = findnsei(arr);
        int[] pseei = findpseei(arr);

        int n = arr.length;
        long sum = 0;
        int mod = 1000000007;

        for(int i = 0; i < n; i++){
            long left = i - pseei[i];
            long right = nsei[i] - i;
            sum = (sum + (left * right % mod) * arr[i] % mod) % mod;
        }

        return (int)sum;
    }
}
