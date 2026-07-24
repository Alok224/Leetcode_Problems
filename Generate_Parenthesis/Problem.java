import java.util.*;
public class Problem{
    public static void bracket(int n, int open, int close, List<String> list, String str){
        if(str.length() == n*2){
            list.add(str);
            return;
        }
        String newstring = str;
        // call the recursive function
        if(open<n){
            bracket(n, open + 1, close, list, newstring + "(");
        }
        if(close<open){
            bracket(n, open, close+1, list, newstring + ")");
        }
    }
    public static void main(String args[]){
        // main function
        int n = 3;
        int open = 0;
        int close = 0;
        List<String> list = new ArrayList<>();
        // call the function
        bracket(n,open,close,list,"");
        System.out.print(list);
    }
}