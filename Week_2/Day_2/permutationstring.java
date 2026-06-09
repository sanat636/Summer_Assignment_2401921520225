class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
     int[] a=new int[26];
     int[] b=new int[26]; 
      for(int i=0;i<s1.length();i++){
        a[s1.charAt(i)-'a']++;
      }
      int x=s1.length();
      for(int i=0;i<s2.length();i++){
        b[s2.charAt(i)-'a']++;
        if(i>=x) b[s2.charAt(i-x)-'a']--;
      
      boolean flag=true;
      for(int j=0;j<a.length;j++){
        if(a[j]!=b[j]){
            flag=false;
            break;
        }
      }
       if(flag) return true;
      }
     
      return false;
    }
}