class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] x=new int[128];
      int a=0;
      int sum=0;
      for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        x[c]++;
        while(x[c]>1){
            x[s.charAt(a)]--;
            a++;
        }
        sum=Math.max(sum,i-a+1);
      }
      return sum;


    }
}