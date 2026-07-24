class Solution {
    public int minDepth(TreeNode root) {
    if (root == null) return 0;
    
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    queue.add(null);
    int depth = 1; // Start with depth 1 (root node)
    
    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        
        // Process all nodes at the current level
        for (int i = 0; i < levelSize; i++) {
            TreeNode currentNode = queue.poll();
            
           if(currentNode != null){
                // Check if this is a leaf node
                if (currentNode.left == null && currentNode.right == null) {
                    return depth;
                }
                
                // Add child nodes to the queue
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }

           }
           else{
                if(!queue.isEmpty()){
                    queue.add(null);
                }
                else{
                    break;
                }
           }
        }
        depth++; // Move to the next level
    }
    return depth;
}
}