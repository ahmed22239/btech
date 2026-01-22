/**
 * Question: Best Time to Buy and Sell Stock (One Transaction)
 *
 * Example:
 * Input  : [7, 1, 5, 3, 6, 4]
 * Output : Max Profit = 5
 * (Buy at price 1 and sell at price 6)
 * 
 *
 * Explanation:
 * - Buy at lowest price
 * - Sell at highest price after buying
 * 
 * Approach:
 * 1. Initialize minPrice to the first price and maxProfit to 0.
 * 2. Iterate through the price array:
 *      - Update minPrice if the current price is lower.
 *      - Calculate potential profit by subtracting minPrice from the current price.
 *      - Update maxProfit if the calculated profit is higher than the current maxProfit.
 * 3. Return maxProfit after iterating through the array.
 * 
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day13_Array_Advanced;

public class StockBuySell {

    public static void main(String[] args) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };

        int minPrice = prices[0];
        int maxProfit = 0;

        // Iterate through the price array
        for (int i = 1; i < prices.length; i++) {

            // Update minprice if current price is lower
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // Calculate potential profit
            int profit = prices[i] - minPrice;

            // Update maxProfit if current profit is higher
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
        // Print the maximum profit
        System.out.println("Max Profit is : " + maxProfit + ".");
    }

}
