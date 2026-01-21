/**
 * Question: Find the second largest element in an array
 *
 * Example:
 * Input  : [10, 5, 20, 8]
 * Output : 10
 *
 * Explanation:
 * - We keep track of the largest and second largest values
 * - Traverse the array only once
 * - Update values based on comparisons
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day12_Array_Optimization;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = { 10, 5, 20, 8 };

        // Initialize variables to track largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Traverse each elements of array
        for (int num : arr) {
            // // If current number is greater than largest

            if (num > largest) {
                secondLargest = largest; // Move old largest to secondLargest
                largest = num; // Update largest

            }
            // If number is less than largest but greater than secondLargest
            else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Output the second largest element
        System.out.println("Second Largest Element is : " + secondLargest);

    }

}
