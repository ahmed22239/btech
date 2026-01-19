/**
 * Question: Find first and last occurrence of an element
 *
 * Example:
 * Input  : [1, 2, 2, 2, 3], key = 2
 * Output : First = 1, Last = 3
 *
 * Explanation:
 * - Traverse entire array
 * - First occurrence stored once
 * - Last occurrence updated every time
 *
 * Algorithm:
 * 1. Initialize first = -1, last = -1
 * 2. Traverse array
 * 3. If key found:
 *    - If first == -1, set first index
 *    - Always update last index
 * 4. Print first and last
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day10_Array_Searching;

public class FirstLastOccurrence {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 2, 3 };
        int key = 2;

        // Initialize first and last occurrence indices
        int first = -1;
        int last = -1;

        // Loop through the array to find first and last occurrences
        for (int i = 0; i < arr.length; i++) {

            // Check if current element matches the key
            if (arr[i] == key) {

                // Set first occurrence if not already set
                if (first == -1) {
                    first = i;
                }
                // Update last occurrence
                last = i;
            }
        }

        // Print the results
        if (first == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("First Occurrence : " + first);
            System.out.println("Last Occurrence : " + last);
        }
    }

}
