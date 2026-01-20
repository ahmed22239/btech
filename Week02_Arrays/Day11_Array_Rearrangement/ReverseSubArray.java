/**
 * Question: Reverse a subarray between given indices
 *
 * Example:
 * Input  : [1, 2, 3, 4, 5], start = 1, end = 3
 * Output : [1, 4, 3, 2, 5]
 *
 * Explanation:
 * - Use two pointers inside given range
 * - Swap until start < end
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day11_Array_Rearrangement;

public class ReverseSubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int start = 1; // Starting index of subarray
        int end = 3; // Ending index of subarray

        // Reverse the subarray from start to end
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; // Move start pointer forward
            end--; // Move end pointer backward
        }

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
