/**
 * Question: Search element using Linear Search
 *
 * Example:
 * Input  : [4, 7, 1, 9], key = 7
 * Output : Found at index 1
 *
 * Explanation:
 * - Traverse array one by one
 * - Compare each element with key
 * - Stop when match is found
 *
 * Algorithm:
 * 1. Start from index 0
 * 2. Compare current element with key
 * 3. If match found, print index and stop
 * 4. If end reached, element not found
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day10_Array_Searching;

public class LinearSearch {

    public static void main(String[] args) {

        int arr[] = { 4, 7, 1, 9 };
        int key = 7; // Element to be searched
        int index = -1; // Variable to store index of found element -- // Initialized to -1 (not found)

        // Traverse the array from start to end
        for (int i = 0; i < arr.length; i++) {

            // if current element matches key
            if (arr[i] == key) {
                index = i; // store index
                break; // stop searching
            }
        }

        // Check if element was found and print result
        if (index != -1) {
            System.out.println("Element found at index " + index + ".");
        } else {
            System.out.println("Element not found in the array.");
        }
    }

}
