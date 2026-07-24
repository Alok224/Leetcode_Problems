class Solution {
    public int[] helper(TreeNode root){
        if(root == null){
            return new int[2];
        }
        // move to left subtree
        int[] left_choice_array = helper(root.left);
        int[] right_choice_array = helper(root.right);
        int[] options = new int[2];

        // Either the node is looted or not looted
        options[0] = root.val + left_choice_array[1] + right_choice_array[1];

        options[1] = Math.max(left_choice_array[0],left_choice_array[1]) + Math.max(right_choice_array[0],right_choice_array[1]);

        return options;

    }
    public int rob(TreeNode root) {
        // create an array
        int[] options = helper(root);
        return Math.max(options[0],options[1]);
    }
}