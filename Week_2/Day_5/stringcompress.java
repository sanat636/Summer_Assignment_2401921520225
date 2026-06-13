class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int i=0,idx=0;
        while(i<n){
            char c=chars[i];
            int count=0;
            while(i<n && chars[i]==c){
                i++;
                count++;
            }
            chars[idx++]=c;
            if(count>1){
                String cs=Integer.toString(count);
                for(char ch : cs.toCharArray()){
                    chars[idx++]=ch;
                }
            }
        }
        return idx;
    }
}