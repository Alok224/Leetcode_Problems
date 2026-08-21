class Solution {
    public String removeKdigits(String num, int k) {
        // int n = num.length();
        // String result = "";
        // List<Character> list = new ArrayList<>();
        // int i = 0;
        // while(i<n){
        //     while(list.isEmpty() == false && k>0 && list.get(list.size() - 1) - '0' > num.charAt(i) - '0'){
        //         list.remove(list.size() - 1);
        //         k = k - 1;
        //     }
        //     list.add(num.charAt(i));
        //     i++;
        // }
        // while(k>0){
        //     list.remove(list.size() - 1);
        //     k--;
        // }
        // if(list.size() == 0){
        //     return "0";
        // }

        // while(list.isEmpty() == false && list.size() > 1 && list.get(0) == '0'){
        //     list.remove(list.get(0));
        // }

        // StringBuilder sb = new StringBuilder();
        // for(int j = 0; j<list.size(); j++){
        //     sb.append(list.get(j));
        // }
        // return sb.toString();

        Stack<Character> st = new Stack<>();
        int n = num.length();
        int i = 0;
        while(i<n){
            while(st.isEmpty() == false && k>0 && st.peek() - '0' > num.charAt(i) - '0'){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
            i++;
        }

        while(k>0 && st.isEmpty() == false){
            st.pop();
            k--;
        }

        StringBuilder string = new StringBuilder();

        if(st.isEmpty() == true){
            st.push('0');
        }

        while(st.isEmpty() == false){
            string.append(st.peek());
            st.pop();
        }
        
        String result = string.reverse().toString();
        int j = 0;
        while(j<result.length() - 1 && result.charAt(j) == '0'){
            j++;
        }
        return result.substring(j);
    }
}