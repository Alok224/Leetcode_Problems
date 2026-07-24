import java.util.*;
class Problem {
    public static void BinaryCall(int n, String str, List<String> list){
        if(str.length() == n){
            list.add(str);
            return;
        }
        // for zero, with conditions
        if(str.isEmpty()){
            BinaryCall(n, str + "0",list);
        }
        if(str.length() > 0){
            if(str.charAt(str.length() - 1) != '0'){
            BinaryCall(n, str + "0", list);
        }
        }
        // for one
        BinaryCall(n, str + "1", list);
    }
    // public List<String> validStrings(int n) {
    //     List<String> list = new ArrayList<>();
    //     // call the function
    //     BinaryCall(n,"",list);
    //     return list;
    // }

    public static void main(String[] args) {
        int n = 3; // Example input
        List<String> list = new ArrayList<>();
        BinaryCall(n, "", list);
        System.out.println(list); // Output the generated binary strings
    }
}