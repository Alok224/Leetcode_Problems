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
    public TreeNode searchBST(TreeNode root, int val) {
        // while(root != null && root.val != val){
        //     // check
        //     if(val < root.val){
        //         // move left
        //         root = root.left;
        //     }
        //     else{
        //         root = root.right;
        //     }
        // }
        // return root;

        if(root == null){
            return root;
        }
        if(root.val == val){
            return root;
        }
        if(root.val < val){
            // move left
            return searchBST(root.right,val);
        }
        return searchBST(root.left,val);
    }
}