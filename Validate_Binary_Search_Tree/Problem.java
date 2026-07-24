class Solution {
    public static void inorder(TreeNode root,List<Integer> list){
        if(root == null){
            return;
        }
        // move to left subtree
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);

    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        //    Check the tree is in sorted or not
        // call the function
        inorder(root,list);

        // I want to check that the list is in sorted or not?
        // Should be strictly inceasing.
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1)){
                return false;
            }
        }
    return true;
        
    }
}