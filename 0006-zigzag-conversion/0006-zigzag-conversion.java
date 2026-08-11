class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }

        List<Character>[] rows = new ArrayList[numRows];

        for(int i = 0; i<numRows; i++){
            rows[i] = new ArrayList<>();
        }

        int i = 0; int direction = 1;

        for(char c : s.toCharArray()){
            rows[i].add(c);
            if(i == 0){
                direction = 1;
            }
            else if(i == numRows - 1){
                direction = -1;
            }
            i = i + direction;
        }

        StringBuilder sb = new StringBuilder();
        for(List<Character> row : rows){
            for(char c : row){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}