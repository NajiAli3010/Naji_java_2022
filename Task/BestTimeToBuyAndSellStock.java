package Task;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int ans = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (min < prices[i]) {
                ans = Math.max(ans, prices[i] - min);
            }
            min = Math.min(min, prices[i]);
        }
        return ans;
    }
}
