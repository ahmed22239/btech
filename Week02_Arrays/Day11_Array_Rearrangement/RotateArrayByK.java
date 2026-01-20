/**
 * Question: Rotate array to the right by K positions
 *
 * Example:
 * Input  : [1, 2, 3, 4, 5], k = 2
 * Output : [4, 5, 1, 2, 3]
 *
 * Explanation:
 * - Rotation is done using reversal technique
 *
 * Algorithm:
 * 1. Reverse entire array
 * 2. Reverse first K elements
 * 3. Reverse remaining elements
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day11_Array_Rearrangement;

public class RotateArrayByK {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int k = 2; 
        int n = arr.length;

        k = k % n; // In case k is greater than n

        // Step 1: Reverse entire array
        reverse(arr, 0, n - 1);
        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);
        // Step 3: Reverse remaining elements
        reverse(arr, k, n - 1);

        // Print rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Function to reverse a portion of the array
    static void reverse(int[] arr, int start, int end) {
        // Swap elements from start to end
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++; // Move forward
            end--; // Move backward
        }
    }

}
