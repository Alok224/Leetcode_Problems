class Solution {
    public static boolean helper(String s){
        // create a stack data structure
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(')');
            }
            else if(s.charAt(i) == '{'){
                stack.push('}');
            }
            else if(s.charAt(i) == '['){
                stack.push(']');
            }

            else if(stack.isEmpty() || stack.pop() != s.charAt(i)){
                return false;
            }
            
        }
        return stack.isEmpty();
    }
    public boolean isValid(String s) {
        return helper(s);
    }
}