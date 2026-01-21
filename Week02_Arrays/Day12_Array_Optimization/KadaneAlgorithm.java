/**
 * Question: Find Maximum Sum Subarray (Kadane’s Algorithm)
 *
 * Example:
 * Input  : [-2, 1, -3, 4, -1, 2, 1]
 * Output : 6  (subarray [4, -1, 2, 1])
 *
 * Explanation:
 * - Maintain current sum of subarray
 * - If current sum becomes negative, reset it
 * - Keep track of maximum sum found so far
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day12_Array_Optimization;

public class KadaneAlgorithm {

    public static void main(String[] args) {

        int[] arr = { -2, 1, -3, 4, -1, 2, 1 };

        // max store the maximium subarray sum
        int max = arr[0];

        // currentSum store the sum of current subarray
        int currentSum = 0;

        // Traverse through the array
        for (int num : arr) {
            currentSum = currentSum + num; // add current element to currentSum

            // update max if currentSum is greater than max
            if (currentSum > max) {
                max = currentSum;
            }

            // if currentSum becomes negative, reset it to 0
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        // Print the maximum subarray sum
        System.out.println("Maximum Subarray Sum is: " + max);
    }

}
