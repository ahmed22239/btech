/**
 * Question: Find maximum and minimum element in an array
 *
 * Example:
 * Input  : [12, 5, 22, 1, 18]
 * Output : Max = 22, Min = 1
 *
 * Explanation:
 * - Assume first element as max and min
 * - Compare remaining elements and update values
 *
 * Dry Run:
 * max=12, min=12
 * 5  → min=5
 * 22 → max=22
 * 1  → min=1
 * 18 → no change
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day08_Array_Basics;

public class MaxMinInArray {
    public static void main(String[] args) {

        int arr[] = { 12, 5, 22, 1, 18 };

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element in array: " + max);
        System.out.println("Minimum element in array: " + min);
    }

}
