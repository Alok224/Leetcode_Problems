class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
       int[] indexarray1 = new int[255];
       int[] indexarray2 = new int[255];

       int i = 0;
       while(i<s.length() && i<t.length()){
            if(indexarray1[(int)(s.charAt(i))] != indexarray2[(int)(t.charAt(i))]){
                return false;
            }
            indexarray1[(int)(s.charAt(i))] = i+1;
            indexarray2[(int)(t.charAt(i))] = i+1;
            i++;
       }
       return true;
    }
}