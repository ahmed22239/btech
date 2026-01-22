/**
 * Question: Find Majority Element
 *
 * Majority element appears more than n/2 times.
 *
 * Example:
 * Input  : [2, 2, 1, 1, 2, 2, 2]
 * Output : 2
 * Explanation: The element 2 appears 5 times which is more than n/2 (7/2 = 3.5)
 *
 * Logic:
 * - Use Boyer-Moore Voting Algorithm
 * 
 * Algorithm Steps:
 * 1. Initialize two variables: candidate and count.
 * 2. Iterate through each element in the array:
 *      - If count is 0, set candidate to the current element.
 *      - If the current element is equal to candidate, increment count.
 *      - Otherwise, decrement count.
 * 3. After the first pass, candidate holds the potential majority element.
 * 4. (Optional) Verify that candidate is indeed the majority element by counting its occurrences.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day13_Array_Advanced;

public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 2, 2, 2 };

        int candidate = arr[0]; // Initial candidate
        int count = 1; // Initial count

        // Finding the candidate for majority element
        for (int i = 1; i < arr.length; i++) {

            // Check if current element matches candidate
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            // Check if count is zero
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        // Print the majority element
        System.out.println("Majority Element is : " + candidate + ".");
    }

}
