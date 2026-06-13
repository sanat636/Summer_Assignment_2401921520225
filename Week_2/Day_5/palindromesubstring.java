class Solution {
    private boolean sol(String s,int l,int r){
        while(l<=r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int n=s.length();
        int max=Integer.MIN_VALUE;
        int idx=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(sol(s,i,j)){
                    if(j-i+1>max){
                        idx=i;
                        max=j-i+1;
                    }
                }
            }
        }
        return s.substring(idx,idx+max);
    }
}