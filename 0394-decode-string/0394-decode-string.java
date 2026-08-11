class Solution {
    public String decodeString(String s) {
        // Using two stacks
        Stack<Integer> countstack = new Stack<>();
        Stack<StringBuilder> stringstack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int number = 0;

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch) == true){
                number = number * 10 + (ch - '0');
            }

            else if(ch == '['){
                countstack.push(number);
                stringstack.push(current);

                current = new StringBuilder();
                number = 0;
            }

            else if(ch == ']'){
                int count = countstack.pop();
                StringBuilder prevstr = stringstack.pop();

                for(int i = 1; i <= count; i++){
                    prevstr.append(current);
                }

                current = prevstr;
            }

            else{
                current.append(ch);
            }
        }
        return current.toString();
    }
}