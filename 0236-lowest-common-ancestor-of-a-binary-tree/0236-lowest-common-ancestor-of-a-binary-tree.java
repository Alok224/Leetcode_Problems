/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // public boolean function2(TreeNode root, TreeNode q, List<TreeNode> list2){
    //     if(root == null){
    //         return false;
    //     }
    //     list2.add(root);
    //     if(root == q){
    //         return true;
    //     }
    //     if(function(root.left,q,list2) == true || function(root.right,q,list2) == true){
    //         return true;
    //     }
    //     list2.remove(list2.size() - 1);
    //     return false;
    // }

    // public boolean function(TreeNode root, TreeNode p, List<TreeNode> list1){
    //     if(root == null){
    //         return false;
    //     }
    //     list1.add(root);
    //     if(root == p){
    //         return true;
    //     }
    //     if(function(root.left,p,list1) == true || function(root.right,p,list1) == true){
    //         return true;
    //     }
    //     list1.remove(list1.size() - 1);
    //     return false;
    // }

    // public TreeNode function(TreeNode root, TreeNode p, TreeNode q){
    //     if(root == null || root == p || root == q){
    //         return root;
    //     }

    //     TreeNode left = function(root.left,p,q);
    //     TreeNode right = function(root.right,p,q);

    //     if(left == null){
    //         return right;
    //     }
    //     else if(right == null){
    //         return left;
    //     }
    //     return root;
    // }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // List<TreeNode> list1 = new ArrayList<>();
        // List<TreeNode> list2 = new ArrayList<>();
        // function(root,p,list1);
        // function2(root,q,list2);
        // TreeNode value = root;
        // for(int i = 0; i<Math.min(list1.size(),list2.size()); i++){
        //     if(list1.get(i).val == list2.get(i).val){
        //         value = list1.get(i);
        //     }
        //     else{
        //         return value;
        //     }
        // }
        // return value;

        // return function(root,p,q);
        if(root == p || root == q || root == null){
            return root;
        }

        TreeNode leftpart = lowestCommonAncestor(root.left, p, q);
        TreeNode rightpart = lowestCommonAncestor(root.right, p, q);

        if(leftpart == null){
            return rightpart;
        }
        if(rightpart == null){
            return leftpart;
        }
        return root;
    }
}