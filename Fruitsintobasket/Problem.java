class Solution {
    public int totalFruit(int[] fruits) {
        int i = 0;
        int j = 0;
        int k = 2;
        int max = 0;
        // create a map
        HashMap<Integer, Integer> map = new HashMap<>();
        while(j<fruits.length){
            // always add the fruit
            map.put(fruits[j],map.getOrDefault(fruits[j],0) + 1);

            if(k<map.size()){
                while(k<map.size()){
                    map.put(fruits[i],map.get(fruits[i]) -1);
                    if(map.get(fruits[i]) == 0){
                        // remove it from the map
                        map.remove(fruits[i]);
                    }
                    i++;
                }
            }

            if(k == map.size()){
                // find the max element
                max = Math.max(max,j-i+1);
               
            }
            j++;
        }
        if(k>map.size()){
            max = j-i;
        }
        return max;
    }
}