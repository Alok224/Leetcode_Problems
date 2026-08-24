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
    public static int check(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftheight = check(root.left);
        int rightheight = check(root.right);
        if(leftheight == -1 || rightheight == -1){
            return -1;
        }
        if(Math.abs(leftheight - rightheight) > 1){
            return -1;
        }
        return 1 + Math.max(leftheight,rightheight);
    }
    public boolean isBalanced(TreeNode root) {
        int value = check(root);
        if(value != -1){
            return true;
        }
        return false;
    }
}