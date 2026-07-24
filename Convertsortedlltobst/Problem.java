class Solution {
    public TreeNode helper(List<Integer> list, int start, int end){
        if(start > end){
            return null;
        }

        // find the mid element
        int midindex = start + (end - start)/2;

        // create a root
        TreeNode root = new TreeNode(list.get(midindex));
        // for left subtree
        root.left = helper(list,start,midindex - 1);
        // for right subtree
        root.right = helper(list,midindex + 1, end);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        // create a ArrayList
        List<Integer> list = new ArrayList<>();

        ListNode currentnode = head;
        while(currentnode != null){
            list.add(currentnode.val);
            currentnode = currentnode.next;
        }

        int start = 0;
        int end = list.size() -1;

        // call the function
        TreeNode root = helper(list,start,end);
        return root;
    }
}