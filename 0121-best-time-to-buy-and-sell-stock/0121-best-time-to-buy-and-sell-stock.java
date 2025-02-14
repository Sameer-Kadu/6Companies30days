class Solution {
    public int maxProfit(int[] prices) {
       int bestBuy = prices[0];
       int sum = 0;
       int max = 0;
        for(int i = 0;i<prices.length;i++)
        {
             if(prices[i] > bestBuy)
            {
                sum = prices[i] - bestBuy;
                if(sum > max)
                {
                    max = sum;
                }
            }
            if(prices[i] < bestBuy)
            {
                bestBuy = prices[i];
            }
           
        }
        // if(max < 0)
        // {
        //     return 0;
        // }
        return max;
    }
}