/**
 * Question: Search element using Binary Search
 *
 * Example:
 * Input  : [2, 4, 6, 8, 10], key = 6
 * Output : Found at index 2
 *
 * Explanation:
 * - Works only on sorted arrays
 * - Divide search space into half
 *
 * Algorithm:
 * 1. Set start = 0, end = n-1
 * 2. Find mid = (start + end) / 2
 * 3. If arr[mid] == key → found
 * 4. If key > arr[mid] → search right half
 * 5. Else → search left half
 * 6. Repeat until start <= end
 *
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day10_Array_Searching;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10 };
        int key = 6;

        // Start and end pointers
        int start = 0;
        int end = arr.length - 1;

        boolean found = false;

        // Continue until search space exists
        while (start <= end) {

            // Find mid index
            int mid = start + (end - start) / 2;

            // Check if key is present at mid
            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid + ".");
                found = true;
                break;
            }

            // If key is greater, search right half
            else if (arr[mid] < key) {
                start = mid + 1;
            }

            // Else search left half
            else {
                end = mid - 1;
            }

        }

        // If key not found
        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }

}
