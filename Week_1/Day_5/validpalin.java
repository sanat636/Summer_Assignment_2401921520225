class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true;
        s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String sc=s.trim();
        int i=0;
        int j=sc.length()-1;
        boolean flag=true;
        while(i<=j){
            if(sc.charAt(i)!=sc.charAt(j)){
                flag=false;
                break;
            }
            i++;
            j--;
        }
      if(flag==true) return true;
      else return false;
    }
}