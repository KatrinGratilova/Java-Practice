package hw10_Profit;

public class Profit {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2, 4, 1}));
        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    // 2ms     On
    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice)
                buyPrice = prices[i];
            else if(prices[i] - buyPrice > profit)
                profit = prices[i] - buyPrice;
        }

        return profit;
    }
}
