class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int value) {
        // while(s1.size() != 0){
        //     s2.push(s1.peek());
        //     s1.pop();
        // }
        // s1.push(x);
        // while(s2.size() != 0){
        //     s1.push(s2.peek());
        //     s2.pop();
        // }



        while(s2.isEmpty() == false){
            int element = s2.peek();
            s1.push(element);
            s2.pop();
        }
        s2.push(value);
        while(s1.isEmpty() == false){
            int element = s1.peek();
            s2.push(element);
            s1.pop();
        }
    }
    
    public int pop() {
       return s2.pop();
    }
    
    public int peek() {
        return s2.peek();
    }
    
    public boolean empty() {
        return s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */