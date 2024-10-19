package seventyFive;

public class _4 {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2,4}));
    }
    public static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (price > buy  && price - buy > profit ){
                profit = price - buy;
            }
            if (price < buy) {
                buy = price;
            }

        }
        return profit;
    }
}
