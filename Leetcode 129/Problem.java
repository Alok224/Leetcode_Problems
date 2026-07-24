class Solution {
    int sum = 0;
    public void helper(TreeNode root, int value){

        value = root.val + value * 10;

        if(root.left == null && root.right == null){
            sum = sum + value;
            return;
        }

        // move to left subtree
        if(root.left != null){
            helper(root.left, value);
        }
        
        // move to right subtree
        if(root.right != null){
            helper(root.right, value);
        }
    }
    public int sumNumbers(TreeNode root) {
        int value = 0;
        // call the function
        helper(root,value);
        return sum;
    }
}