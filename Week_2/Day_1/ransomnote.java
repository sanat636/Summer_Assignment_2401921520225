class Solution {
    boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() == 0) return false;
        int[] k=new int[26];
        for(int i=0;i<magazine.length();i++){
            k[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            k[ransomNote.charAt(i)-'a']--;
            if(k[ransomNote.charAt(i)-'a']<0) return false;
        }
        return true;
    }
};