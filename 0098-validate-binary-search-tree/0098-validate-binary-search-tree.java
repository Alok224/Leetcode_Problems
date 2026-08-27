/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    // public boolean checkfn(TreeNode root, long min, long max){
    //     if(root.val > min  && root.val < max){
    //         return true;
    //     }
    //     return false;
    // }
    // public boolean function(TreeNode root, long min, long max){
    //     if(root == null){
    //         return true;
    //     }
    //     if(checkfn(root,min,max) == false){
    //         return false;
    //     }
    //     return function(root.left,min,root.val) && function(root.right,root.val,max);
    // }




    public boolean checkfn(TreeNode root, long min, long max){
        if(root.val > min && root.val < max){
            return true;
        }
        return false;
    }
    public boolean function(TreeNode root, long min, long max){
        if(root == null){
            return true;
        }

        if(checkfn(root,min,max) == false){
            return false;
        }
        boolean leftcheck = function(root.left,min,root.val);
        boolean rightcheck = function(root.right,root.val,max);
        return leftcheck && rightcheck;
    }
    public boolean isValidBST(TreeNode root) {
        // long max = Long.MAX_VALUE; long min = Long.MIN_VALUE;
        // return function(root,min,max);

        long max = Long.MAX_VALUE; long min = Long.MIN_VALUE;
        return function(root,min,max);
    }
}