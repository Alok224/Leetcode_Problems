class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = arr.length - 1;
        int max_element = -1;
        while(i>=0){
            if(arr[i] >= max_element){
                max_element = arr[i];
                list.add(arr[i]);
            }
            i--;
        }
        Collections.reverse(list);
        return list;
    }
}
