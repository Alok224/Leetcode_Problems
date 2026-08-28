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
    int preindex = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    public TreeNode helper(int[] preorder, int instart, int inend){
        if(instart > inend){
            return null;
        }
        int rootvalue = preorder[preindex];
        preindex = preindex + 1;
        TreeNode root = new TreeNode(rootvalue);
        int index = map.get(rootvalue);
        root.left = helper(preorder,instart,index - 1);
        root.right = helper(preorder,index + 1, inend);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // inorder map
        int n = inorder.length;
        for(int i = 0; i<n; i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,0,n - 1);
    }
}