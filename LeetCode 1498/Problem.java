class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        // trim the string
        s = s.trim();
        // Now, using split() method
        String[] wordsarray = s.split("\\s+");
        for(int i = wordsarray.length - 1; i>=0; i--){
            sb.append(wordsarray[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}