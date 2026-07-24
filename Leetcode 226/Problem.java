class Solution {
    
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }


        // move to left subtree
        TreeNode left = invertTree(root.left);
        // move to right subtree
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;
        
        return root;
    }
}