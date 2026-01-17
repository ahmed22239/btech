/**
 * Question: Find the average of elements in an array
 *
 * Example:
 * Input  : [10, 20, 30, 40]
 * Output : Average = 25.0
 *
 * Explanation:
 * - Find sum of all elements
 * - Divide sum by number of elements
 * - Use double to get precise average
 *
 * Dry Run:
 * sum = 0
 * sum = 0 + 10 → 10
 * sum = 10 + 20 → 30
 * sum = 30 + 30 → 60
 * sum = 60 + 40 → 100
 *
 * average = 100 / 4 = 25.0
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day08_Array_Basics;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        double average = (double) sum / arr.length;
        System.out.println("Average  is :  " + average);
    }

}
