class Solution {
    public static TreeNode helper(int[] nums,int start,int end){
        if(start > end){
            return null;
        }
        // to find the mid element for left subtree and right subtree
        int midindex = start + (end - start)/2;
        // define the root for bst
        TreeNode root = new TreeNode(nums[midindex]);
        // for left subtree, call the function
        root.left = helper(nums,start,midindex-1);
        // for right subtree, call the function
        root.right = helper(nums,midindex+1,end);

        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        
        // to create the tree call the function
        TreeNode root = helper(nums,start,end);
        return root;
    }
}
