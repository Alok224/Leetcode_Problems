class Solution {
    static class Node{
        Node[] children;
        Boolean eow;

        public Node(){
            children = new Node[26];
            eow = false;

            for(int i = 0; i<26; i++){
                children[i] = null;
            }
        }
    }
    Node root = new Node();

    public void insert(String s){
        Node current = root;
        for(int i = 0;i<s.length(); i++){
            int index = s.charAt(i) - 'a';
            if(current.children[index] == null){
                // store it
                current.children[index] = new Node();
            }
            if(i == s.length() -1){
                current.children[index].eow = true;
            }
            current = current.children[index];
        }
    }

    public String longestwrd(StringBuilder temp, Node root, String ans){
        if(root == null){
            return ans;
        }
        for(int i = 0; i<26; i++){
            if(root.children[i] != null && root.children[i].eow == true){
                temp.append((char)(i + 'a'));
                if(ans.length() < temp.length()){
                    ans = temp.toString();
                }
                // recursive call
                ans = longestwrd(temp,root.children[i],ans);
                // backtrack
                temp.deleteCharAt(temp.length() - 1);
            }
        }
        return ans;
    }


    public String longestWord(String[] words) {
        for(int i = 0; i<words.length; i++){
            insert(words[i]);
        }
        StringBuilder temp = new StringBuilder();
        String ans = " ";
    
        // function
        return longestwrd(temp,root,ans);
    }
}