class Solution {
    public int[] dailyTemperatures(int[] temp) {

        // this will give TLE
        // List<Integer> list = new ArrayList<>();

        // int i = 0; int n = temp.length;
        // while(i<n-1){
        //     int j = i+1;
        //     boolean flag = true;
        //     while(j<n){
        //         if(temp[i] < temp[j]){
        //             list.add(j - i);
        //             flag = false;
        //             break;
        //         }
        //         j++;
        //     }
        //     if(flag == true){
        //         list.add(0);
        //     }
        //     i++;
        // }

        // list.add(0);

        // int[] array = new int[n];
        // for(int k = 0; k<n; k++){
        //     array[k] = list.get(k);
        // }
        // return array;



        Stack<Integer> st = new Stack<>();
        int[] nge = new int[temp.length];
        
        int i = temp.length -1;
        while(i>=0){
            while(st.isEmpty() == false){
                int index = st.peek();
                if(temp[i] >= temp[index]){
                    st.pop();
                }
                else{
                    break;
                }
            }
            if(st.isEmpty() == false){
                int newindex = st.peek();
                nge[i] = newindex - i;
            }
            else{
                nge[i] = 0;
            }
            st.push(i);
            i--;
        }
        return nge;
    }
}