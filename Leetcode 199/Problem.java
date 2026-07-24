class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<Integer> stack = new Stack<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i< size;i++){
                TreeNode currentnode = queue.remove();

                if(currentnode != null){
                    stack.push(currentnode.val);
                    if(currentnode.left != null){
                        queue.add(currentnode.left);
                    }
                    if(currentnode.right != null){
                        queue.add(currentnode.right);
                    }
                }
                else{
                    if(!queue.isEmpty()){
                        queue.add(null);
                    }
                }
            }
            int value = stack.pop();
            list.add(value);
        }
        return list;
    }
}