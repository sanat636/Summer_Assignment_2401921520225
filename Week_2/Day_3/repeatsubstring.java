class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                int x=n/i;
                String s1=s.substring(0,i);
                StringBuilder newstr=new StringBuilder();
                while(x>0){
                    newstr.append(s1);
                    x--;
                }
                if(s.equals(newstr.toString())) return true;
            }
        }
        return false;
    }
}