class Solution {
    public int maxProfit(int[] prices) {
    if(prices.length<2) return 0;
    int s=prices[0];
    int profit=0;
    for(int i=1; i<prices.length;i++){
        if(prices[i]<s) s=prices[i];
        else{
        int p1=prices[i]-s;
        if(p1>profit) profit=p1;
    }
    } 
    return profit;
    }
}