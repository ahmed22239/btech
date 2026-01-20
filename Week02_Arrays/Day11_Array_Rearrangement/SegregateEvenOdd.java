/**
 * Question: Segregate even and odd numbers in an array
 *
 * Example:
 * Input  : [3, 1, 2, 4]
 * Output : [4, 2, 1, 3] (order may vary)
 *
 * Explanation:
 * - Even numbers should come first
 * - Odd numbers should come later
 * - Use two-pointer approach
 *
 * Algorithm:
 * 1. Initialize left = 0, right = n-1
 * 2. Move left pointer forward if element is even
 * 3. Move right pointer backward if element is odd
 * 4. Swap when left is odd and right is even
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day11_Array_Rearrangement;

public class SegregateEvenOdd {

    public static void main(String[] args) {

        int[] arr = { 3, 1, 2, 4 };
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Move left pointer if element is even
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }

            // Move right pointer if element is odd
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }

            // Swap misplaced elements
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
