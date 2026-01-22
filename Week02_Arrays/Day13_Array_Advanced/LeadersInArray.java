/**
 * Question: Find Leaders in an Array
 *
 * A leader is an element greater than all elements to its right.
 *
 * Example:
 * Input  : [16, 17, 4, 3, 5, 2]
 * Output : 17 5 2
 *
 * Logic:
 * - Traverse from right to left
 * - Keep track of maximum so far
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day13_Array_Advanced;

public class LeadersInArray {

    public static void main(String[] args) {

        int[] arr = { 16, 17, 4, 3, 5, 2 };

        int maxFromRight = arr[arr.length - 1];
        System.out.print(maxFromRight + " "); // Last element is always a leader

        // Traverse the array from second last to the beginning
        for (int i = arr.length - 2; i >= 0; i--) {

            // If current element is greater than maxFromRight, it is a leader
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }

}
