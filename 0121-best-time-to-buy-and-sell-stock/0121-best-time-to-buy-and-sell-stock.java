class Solution {
    public int maxProfit(int[] prices) {
       int bestBuy = Integer.MAX_VALUE;
       int sum = 0;
       int max = Integer.MIN_VALUE;
        for(int i = 0;i<prices.length;i++)
        {
            if(prices[i] < bestBuy)
            {
                bestBuy = prices[i];
            }
            if(prices[i] > bestBuy)
            {
                sum = prices[i] - bestBuy;
                if(sum > max)
                {
                    max = sum;
                }
            }
        }
        if(max < 0)
        {
            return 0;
        }
        return max;
    }
}