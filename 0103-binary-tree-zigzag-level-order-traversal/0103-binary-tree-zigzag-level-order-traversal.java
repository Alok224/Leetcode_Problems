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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        Boolean flag = true;
        while(q.isEmpty() == false){
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i<size; i++){
                TreeNode node = q.peek();
                q.poll();
                if(flag == false){
                    list.add(0,node.val);
                }
                else{
                    list.add(node.val);
                }
                if(node.left != null){
                    q.offer(node.left);
                }
                if(node.right != null){
                    q.offer(node.right);
                }
            }
            result.add(list);
            flag = !flag;
        }
        return result;
    }
}