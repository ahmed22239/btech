/**
 * Question: Search element in sorted array (Linear approach)
 *
 * Example:
 * Input  : [2, 4, 6, 8, 10], key = 8
 * Output : Found at index 3
 *
 * Explanation:
 * - Traverse sorted array sequentially
 * - Compare each element with key
 *
 * Algorithm:
 * 1. Start from first element
 * 2. Compare element with key
 * 3. If found, print index
 * 4. If end reached, not found
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day10_Array_Searching;

public class SearchInSortedArray {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10 };
        int key = 8; // Element to be searched

        // Traverse the sorted array
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("Element found at index " + i + ".");
                return; // exits program
            }
        }

        // If we reach here, element was not found
        System.out.println("Element not found in the array.");
    }

}
