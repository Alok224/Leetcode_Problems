class Solution {
    
    public boolean check(TreeNode leftroot, TreeNode rightroot){
        if(leftroot == null && rightroot == null){
            return true;
        }
        if(leftroot == null){
            return false;
        }
        if(rightroot == null){
            return false;
        }
        if(leftroot.val == rightroot.val){
            // move to left subtree and right subtree
            return check(leftroot.left,rightroot.right) && check(leftroot.right, rightroot.left);
        }
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }

        // call the function
        if(check(root.left,root.right) == false){
            return false;
        }
    return true;
    }
}