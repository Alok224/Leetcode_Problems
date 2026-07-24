class Solution {
    static TreeNode first;
    static TreeNode middle;
    static TreeNode last;
    static TreeNode head;
    public static void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        if(head != null && root.val < head.val){
            // case of violation
            if(first == null){
                // first violation
                first = head;
                middle = root;
            }
            else{
                // second violation
                last = root;
            }
        }
        head = root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        
        head = first = middle = last = null;

        // TreeNode head = new TreeNode(Integer.MIN_VALUE);
        // call the function for inorder
        inorder(root);
        // in case of first violation
        if (first != null && last != null) {
        // two violations (non-adjacent swap)
        int temp = first.val;
        first.val = last.val;
        last.val = temp;
        }
        else if (first != null && middle != null) {
            // one violation (adjacent swap)
            int temp = first.val;
            first.val = middle.val;
            middle.val = temp;
        }

    }
}