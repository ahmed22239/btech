/**
 * Question: Find subarray with sum equal to K
 *
 * Example:
 * Input  : [1, 2, 3, 7, 5], K = 12
 * Output : Subarray found
 * Explanation: The subarray [2, 3, 7] has sum equal to 12
 *
 * Logic:
 * - Use sliding window (for positive numbers)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day13_Array_Advanced;

public class SubarraySumEqualsK {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        int k = 12;

        int start = 0;
        int currentSum = 0;

        // Sliding window approach
        for (int end = 0; end < arr.length; end++) {

            // Add the current element to currentSum
            currentSum = currentSum + arr[end];
            // Shrink the window as long as currentSum is greater than k
            while (currentSum > k) {
                currentSum = currentSum - arr[start];
                start++;
            }

            // Check if currentSum equals k
            if (currentSum == k) {
                System.out.println("Subarray found from index " + start + " to " + end + " .");
                return;
            }
        }

        // If we reach here, no subarray found

    }
}
