/**
 * Question: Rearrange array so positive and negative numbers appear alternately
 *
 * Example:
 * Input  : [-1, 2, -3, 4, -5, 6]
 * Output : [-1, 2, -3, 4, -5, 6]
 * 
 * Input  : [1, 2, 3, -4, -1]
 * Output : [-4, 1, -1, 2, 3]
 *
 * 
 * Explanation:
 * - Separate positive and negative numbers
 * - Place them alternately in a new array
 *
 * Algorithm:
 * 1. Count positives and negatives
 * 2. Store them in separate arrays
 * 3. Merge them alternately
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week02_Arrays.Day11_Array_Rearrangement;

public class RearrangePositiveNegative {

    public static void main(String[] args) {
        // Original input array
        int[] arr = { -1, 2, -3, 4, -5, 6 };

        // Length of the array
        int n = arr.length;

        // Temporary arrays to store positives and negatives
        int[] positives = new int[n];
        int[] negatives = new int[n];

        // Index counters for positives and negatives
        int p = 0;
        int q = 0;

        // STEP 1: Separate positive and negative numbers
        for (int i = 0; i < n; i++) {

            // If number is positive or zero
            if (arr[i] >= 0) {
                positives[p] = arr[i]; // store in positives array
                p++; // move positive index forward
            }
            // If number is negative
            else {
                negatives[q] = arr[i]; // store in negatives array
                q++; // move negative index forward
            }
        }

        // Result array to store final rearranged elements
        int[] result = new int[n];

        // Indexes to track positives, negatives, and result
        int i = 0;
        int pi = 0;
        int ni = 0;

        // STEP 2: Place negative and positive alternately
        while (pi < p && ni < q) {

            // Place one negative number
            result[i] = negatives[ni];
            i++;
            ni++;

            // Place one positive number
            result[i] = positives[pi];
            i++;
            pi++;
        }

        // STEP 3: Copy remaining positive numbers (if any)
        while (pi < p) {
            result[i] = positives[pi];
            i++;
            pi++;
        }

        // STEP 4: Copy remaining negative numbers (if any)
        while (ni < q) {
            result[i] = negatives[ni];
            i++;
            ni++;
        }

        // Print the final rearranged array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

}
