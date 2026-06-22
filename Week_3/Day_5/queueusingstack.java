class MyQueue {
     private Stack<Integer> ip;
     private Stack<Integer> op;
    private int a;
    public MyQueue() {
       ip=new Stack<>();
       op=new Stack<>();
       a=-1;
    }
    
    public void push(int x) {
        if(ip.empty()) a=x;
        ip.push(x);
    }
    
    public int pop() {
        if(op.empty()){
            while(!ip.empty()){
                op.push(ip.pop());
            }
        }
        int val=op.pop();
        return val;
    }
    
    public int peek() {
        if(op.empty()) return a;
        return op.peek();
    }
    
    public boolean empty() {
        return ip.empty() && op.empty();
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