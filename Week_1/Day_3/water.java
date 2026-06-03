class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int water=0;
        while(i<j){
            int ht=Math.min(height[i],height[j]);
            int bt=j-i;
            int x=ht*bt;
            water=Math.max(x,water);
            if(height[i]>height[j]) j--;
            else i++;
        }
        return water;
    }
}