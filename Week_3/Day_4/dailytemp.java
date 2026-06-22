class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n=temp.length;
        Stack<Integer> st=new Stack<>();
        int[] answer=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && temp[i]>=temp[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()) answer[i]=0;
            else answer[i]=st.peek()-i;
            st.push(i);
        }
        return answer;
    }
}