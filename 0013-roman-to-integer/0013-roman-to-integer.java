class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = Map.of(
            'I',1,'V',5,'X',10,'L',50,'C',100,'D',500,'M',1000
        );

        int sum = 0;
        for(int i = s.length() - 1; i>=0; i--){
            int value = map.get(s.charAt(i));
            if(i != s.length() - 1 && value < map.get(s.charAt(i + 1))){
                value = -value;
            }
            sum = sum + value;
        }
    return sum;
    }
}