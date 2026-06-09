class Solution {
    public List<Integer> findAnagrams(String s, String p) {
      List<Integer> l=new ArrayList<>();
        if(p.length()>s.length()) return l;
        int[] a=new int[26];
        int[] b=new int[26];
        for(int i=0;i<p.length();i++){
            a[p.charAt(i)-'a']++;
        }
        int k=p.length();
        for(int i=0;i<s.length();i++){
            b[s.charAt(i)-'a']++;
            if(i>=k) b[s.charAt(i-k)-'a']--;
            if(i>=k-1){
                boolean flag=true;
                for(int j=0;j<26;j++){
                    if(a[j]!=b[j]){
                        flag=false;
                        break;
                    }
                }
                if(flag) l.add(i-k+1);
            }
        }
    
        return l;

    }
}