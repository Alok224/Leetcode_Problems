class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0; int max = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push('(');
                count++;
            }
            else if(s.charAt(i) == ')'){
                stack.pop();
                count--;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}