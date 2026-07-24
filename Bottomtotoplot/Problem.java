class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        // create a queue
        Queue<TreeNode> queue = new LinkedList<>();
        // create a stack
        Stack<List<Integer>> stack = new Stack<>();

        if(root == null){
            return result;
        }

        queue.add(root);
        queue.add(null);
        // traverse the entire queue
        while(!queue.isEmpty()){
            TreeNode currentnode = queue.remove();

            if(currentnode != null){
                // add that currentnode to the list
                 list.add(currentnode.val);
                 if(currentnode.left != null){
                    queue.add(currentnode.left);
                 }
                 if(currentnode.right != null){
                    queue.add(currentnode.right);
                 }
            }
            else{
                // add the list in stack
                stack.push(new ArrayList<>(list));
                list.clear();
                if(!queue.isEmpty()){
                    queue.add(null);
                }
                else{
                    break;
                }

            }
            
        }

        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
    
    return result;
    }
}