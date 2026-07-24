class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){
            // empty root means empty tree that contains no path
            return false;
        }
        if(root.left == null && root.right == null){
            return root.val == targetSum;
        }

        int remainingsum = targetSum - root.val;
        // move to left and right part of subtree
        return hasPathSum(root.left,remainingsum) || hasPathSum(root.right,remainingsum);
    }
}