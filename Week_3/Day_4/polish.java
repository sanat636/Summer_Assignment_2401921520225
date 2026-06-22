class Solution {
    public int operation(int a,int b,String s){
      if(s.equals("+")) return a+b;
      if(s.equals("-")) return a-b;
      if(s.equals("*")) return a*b;
      if(s.equals("/")) return a/b;
      return 0;
    }
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int ans=0;
        for(String s : tokens){
         if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
            int b=st.pop();
            int a=st.pop();
            ans=operation(a,b,s);
            st.push(ans);
         } else{
            st.push(Integer.parseInt(s));
         }
        }
        return st.pop();
    }
}