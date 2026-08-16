class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int val) {
        int size = q.size();
        q.offer(val);

        for(int i = 0; i<size; i++){
            int top = q.peek();
            q.offer(top);
            q.poll();
        }
    }
    
    public int pop() {
        int popelement = q.peek();
        q.poll();
        return popelement;
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
       if(q.isEmpty() == false){
        return false;
       }
       return true;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */