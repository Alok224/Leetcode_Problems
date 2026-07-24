import java.util.*;
class Problem{
    public static void Binarycall(int n, String str,List<String> list){
        // base case
        if(str.length() == n){
            list.add(str);
            return;
        }

        
        Binarycall(n,str + "0",list);

        if(str.isEmpty()){
            Binarycall(n, str + "1",list);
        }

        if(str.length() > 0){
            if(str.charAt(str.length() - 1) != '1'){
            Binarycall(n,str + "1",list);
            }
        }
    }
        
    // public List<String> generateBinaryStrings(int n) {
    //     List<String> list = new ArrayList<>();
    //     // Your code goes here
    //     
    //     // call the function
    //     Binarycall(n,"",List);
    //     return list;
    // }

    public static void main(String[] args) {
        int n = 2; // Example input
        List<String> list = new ArrayList<>();
        Binarycall(n, "", list);
        System.out.println(list); // Output the generated binary strings
    }
}