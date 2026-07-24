class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {  
       Queue<TreeNode> queue = new LinkedList<>(); 
       List<Integer> list1 = new ArrayList<>();
       List<List<Integer>> list = new ArrayList<>();
    //    Create a stack
        Stack<Integer> stack = new Stack<>();

        // true = 1, false = 0;
        Boolean flag = false;

        if(root == null){
            return list;
        }

        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){
            TreeNode currentnode = queue.poll();

            if(currentnode != null){
                if(flag == false){
                    list1.add(currentnode.val);
                }
                else{
                    stack.add(currentnode.val);
                }

                if(currentnode.left != null){
                    queue.add(currentnode.left);
                }
                if(currentnode.right != null){
                    queue.add(currentnode.right);
                }
            }

            else{
                while(!stack.isEmpty()){
                  list1.add(stack.pop());
                }

                list.add(new ArrayList<>(list1));
                list1.clear();
                flag = !flag;    

                if(!queue.isEmpty()){
                    queue.add(null);
                }
                else{
                    break;
                }
            }
            
            
        }
        return list;
    }
}