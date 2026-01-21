/**
 * Question: Maximum sum of subarray of size K
 *
 * Example:
 * Input  : [2, 1, 5, 1, 3, 2], K = 3
 * Output : 9  (subarray [5,1,3])
 *
 * Explanation:
 * - Calculate sum of first K elements
 * - Slide window by:
 *   removing first element of window
 *   adding next element
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day12_Array_Optimization;

public class MaxSumSubarrayK {

    public static void main(String[] args) {

        int[] arr = { 2, 1, 5, 1, 3, 2 };

        int k = 3; // Size of subarray or window size

        // Sum of first k window
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum = windowSum + arr[i];
        }

        // Initialize maxSum to window sum
        int maxSum = windowSum;

        // Slide the window form index k
        for (int i = k; i < arr.length; i++) {
            // Add new element and remove old one
            windowSum = windowSum + arr[i] - arr[i - k];

            // Update maxSum if needed
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        // Print the result
        System.out.println("Maximum sum of subarray of size " + k + " is: " + maxSum);
    }

}
