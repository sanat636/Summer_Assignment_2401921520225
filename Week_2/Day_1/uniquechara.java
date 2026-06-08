class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        int[] freq=new int[26];
        for(int i=0;i<n;i++){
           char c=s.charAt(i);
           int idx=c-'a';
           freq[idx]++;
        }
        char ans=s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1) return i; 
        }
        return -1;
    }
}