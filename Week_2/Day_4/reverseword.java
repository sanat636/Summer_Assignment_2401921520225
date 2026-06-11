class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        char[] ch=s.toCharArray();
        for(int i=0;i<n;i++){
            if(ch[i]!=' '){
                int j=i;
                while(j+1<n && ch[j+1]!=' '){
                    j++;
                }
                reverse(ch,i,j);
                i=j;
            }
        }
        return new String(ch);
    }
    private void reverse(char[] ch, int i, int j){
    while(i<j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        i++;
        j--;
    }
}
}
