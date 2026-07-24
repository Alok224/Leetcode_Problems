class Solution {
    public boolean check(TreeNode p, TreeNode q){
         if(p == null && q == null){
            return true;
        }

        if(p == null){
            return false;
        }

        if(q == null){
            return false;
        }

        if(p.val == q.val){
            // move to right subtree and left subtree
            return check(p.left, q.left) && check(p.right,q.right);
        }
        return false;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
       
       if(check(p,q) == true){
        return true;
       }
       else{
        return false;
       }
    }
}