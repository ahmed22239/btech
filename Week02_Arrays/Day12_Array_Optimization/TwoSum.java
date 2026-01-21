/**
 * Question: Two Sum Problem
 *
 * Example:
 * Input  : [2, 7, 11, 15], target = 9
 * Output : Indices 0 and 1
 *
 * Explanation:
 * - Check every possible pair
 * - If sum equals target, print indices
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day12_Array_Optimization;

public class TwoSum {

    public static void main(String[] args) {

        int[] arr = { 2, 7, 11, 15 };
        int target = 9;

        // outer loop to pick the first element
        for (int i = 0; i < arr.length; i++) {

            // inner loop to pick the second element
            for (int j = i + 1; j < arr.length; j++) {
                // check if the sum equals target
                if (arr[i] + arr[j] == target) {
                    // print the indices
                    System.out.println("Indices: " + i + " and " + j);
                    return;
                }

            }
        }

        // if no pair found
        System.out.println("No two sum solution pair found.");
    }

}
