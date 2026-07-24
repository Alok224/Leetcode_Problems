class Solution {
    public TreeNode NR = null;
    public void flatten(TreeNode root) {

        // follow the reverse preorder traversal to make the problem easy

        if(root == null){
            return;
        }

        // go to right subtree first
        flatten(root.right);
        flatten(root.left);

        // If I reached to root then,
        root.left = null;
        root.right = NR;
        NR = root;
    }
}