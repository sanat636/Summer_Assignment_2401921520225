class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        int i=0,j=0,p=0;
        int n=nums.length;
        int[] res=new int[n-k+1];
        while(j<n){
          while(!ad.isEmpty() && ad.peekLast()<nums[j]){
            ad.pollLast();
          }  
          ad.add(nums[j]);
          if(j-i+1<k) j++;
          else if(j-i+1==k) {
            res[p++]=ad.peek();
            if(nums[i]==ad.peek()) ad.pollFirst();
            i++;
            j++;
          }
        }
        return res;
    }
}