class Solution {
    public String decodeString(String s) {
        Stack<Integer> count=new Stack<>();
        Stack<StringBuilder> ch=new Stack<>();
        StringBuilder sb= new StringBuilder();
        int n=0;
        for(char c : s.toCharArray()){
            if(c>='0' && c<='9'){
                n=n*10+(c-'0');
            }
            else if(c=='['){
                count.push(n);
                ch.push(sb);
                n=0;
                sb=new StringBuilder(); 
            }
            else if(c==']'){
                int x=count.pop();
                StringBuilder prev=sb;
                sb=ch.pop();
                while(x>0){
                    sb.append(prev);
                    x--;
                }
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
}