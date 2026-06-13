class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String, List<String>> map = new HashMap<>();
      for(int i=0;i<strs.length;i++){
       char[] ch=strs[i].toCharArray();
       Arrays.sort(ch);
       String word=new String(ch);
       if(map.containsKey(word)){
        map.get(word).add(strs[i]);
       } else{
        List<String> l=new ArrayList<>();
        l.add(strs[i]);
        map.put(word,l);
       }

      }
      List<List<String>> ans= new ArrayList<>();
      for(List<String> s : map.values()){
        ans.add(s);
      }
      return ans;
    }
}