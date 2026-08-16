class MinStack {
    // Stack<Integer> st;
    // Stack<Integer> minst;

    Stack<Integer> st;
    Stack<Integer> minstack;
    public MinStack() {
        // st = new Stack<>();
        // minst = new Stack<>();


        st = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minstack.isEmpty() == true || minstack.peek() >= val){
            minstack.push(val);
        }

        
    }
    
    public void pop() {
        int element = st.peek();

        if(element == minstack.peek()){
            minstack.pop();
        }
        st.pop();




    }
    
    public int top() {
        // return st.peek();
        return st.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */