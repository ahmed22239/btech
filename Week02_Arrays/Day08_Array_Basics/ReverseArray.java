/**
 * Question: Reverse an array
 *
 * Example:
 * Input  : [1, 2, 3, 4, 5]
 * Output : [5, 4, 3, 2, 1]
 *
 * Explanation:
 * - Use two pointers (start & end)
 * - Swap elements until start < end
 *
 * Dry Run:
 * start=0, end=4 → swap(1,5)
 * start=1, end=3 → swap(2,4)
 * stop when start >= end
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day08_Array_Basics;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // print reversed array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
