/**
 * Question: Count positive, negative and zero elements in an array
 *
 * Example:
 * Input  : [3, -1, 0, 5, -7, 0]
 * Output :
 * Positive = 2
 * Negative = 2
 * Zeros    = 2
 *
 * Explanation:
 * - Traverse the array once
 * - If element > 0 → positive count
 * - If element < 0 → negative count
 * - Else → zero count
 *
 * Dry Run:
 * 3   → positive = 1
 * -1  → negative = 1
 * 0   → zero = 1
 * 5   → positive = 2
 * -7  → negative = 2
 * 0   → zero = 2
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day09_Array_Counting;

public class CountPositiveNegativeZero {

    public static void main(String[] args) {

        int arr[] = { 3, -1, 0, 5, -7, 0, 9, -4, 0, 2 };

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive Count is : " + positiveCount);
        System.out.println("Negative Count is : " + negativeCount);
        System.out.println("Zeros    Count is : " + zeroCount);

    }

}
