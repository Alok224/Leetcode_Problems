class Solution {
    public int funcncr(int row, int col){
        if(row == 0 && col == 0){
            return 1;
        }
        if(col == 0){
            return 1;
        }
        int res = 1;
        for(int i = 0; i<col; i++){
            res = res * (row - i);
            res = res / (i+1);
        }
        return res;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> List = new ArrayList<>();
        int n = numRows;
        for(int i = 1; i<=n; i++){
            List<Integer> list = new ArrayList<>();
            for(int c = 1; c<=i; c++){
                int ans = funcncr(i-1,c-1);
                list.add(ans);
            }
            List.add(list);
        }
        return List;
    }
}