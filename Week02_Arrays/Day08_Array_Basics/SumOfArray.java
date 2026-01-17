/**
 * Question: Find the sum of all elements in an array
 *
 * Example:
 * Input  : [5, 10, 15]
 * Output : 30
 *
 * Explanation:
 * - Initialize sum = 0
 * - Add each array element to sum
 *
 * Dry Run:
 * sum=0
 * sum=0+5  → 5
 * sum=5+10 → 15
 * sum=15+15 → 30
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day08_Array_Basics;

public class SumOfArray {

    public static void main(String[] args) {
        int[] arr = { 5, 10, 15 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum is : " + sum);
    }

}
