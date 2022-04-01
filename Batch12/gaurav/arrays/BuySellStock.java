class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int result = 0;
        if(prices.length == 1) return result;
        
        result = prices[1] - prices[0];
        int min = prices[0];
        
        for(int i=1; i<n; i++) {
            int diff = prices[i] - min;
            if(diff > result) {
                result = diff;
            }
            if(prices[i] < min) {
                min = prices[i];
            }
        }
        
        if(result < 0) return 0;
        return result;
    }
}
