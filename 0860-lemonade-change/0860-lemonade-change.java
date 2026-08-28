class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0; int ten = 0; int twenty = 0;
        int n = bills.length;
        int i = 0;
        while(i<n){
            if(bills[i] == 5){
                five = five + 1;
            }
            else if(bills[i] == 10){
                if(five != 0){
                    five = five - 1;
                    ten = ten + 1;
                }
                else{
                    return false;
                }
            }
            else{
                if(ten != 0 && five != 0){
                    ten = ten - 1;
                    five = five - 1;
                    twenty = twenty + 1;
                }
                else if(five >= 3){
                    five = five - 3;
                }
                else{
                    return false;
                }
            }
            i++;
        }
        return true;
    }
}