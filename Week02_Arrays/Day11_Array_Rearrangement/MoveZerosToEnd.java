/**
 * Question: Move all zeros to the end of the array
 *
 * Example:
 * Input  : [0, 1, 0, 3, 12]
 * Output : [1, 3, 12, 0, 0]
 *
 * Explanation:
 * - Maintain an index to place non-zero elements
 * - Traverse the array
 * - Copy non-zero elements to the front
 * - Fill remaining positions with zeros
 *
 * Algorithm:
 * 1. Initialize index = 0
 * 2. Loop through array
 * 3. If element != 0, place it at arr[index] and increment index
 * 4. After loop, fill rest of array with 0
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day11_Array_Rearrangement;

public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 3, 12 };
        int index = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

}
