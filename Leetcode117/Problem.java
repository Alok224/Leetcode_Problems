class Solution {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if(root == null){
            return null;
        }
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i = 0; i<size; i++){
                Node currentnode = queue.remove();

                if(currentnode.left != null){
                    queue.add(currentnode.left);
                }
                if(currentnode.right != null){
                    queue.add(currentnode.right);
                }

                if(i < size -1){
                    currentnode.next = queue.peek();
                }
                else{
                    currentnode.next = null;
                }
            }
            
        }
        return root;
    }
}