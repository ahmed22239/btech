/**
 * Question: Count even and odd elements in an array
 *
 * Example:
 * Input  : [2, 5, 8, 7, 10]
 * Output : Even = 3, Odd = 2
 *
 * Explanation:
 * - Traverse the array
 * - If number % 2 == 0 → even
 * - Else → odd
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day09_Array_Counting;

public class CountEvenOdd {

    public static void main(String[] args) {

        int[] arr = { 2, 5, 8, 7, 10 };
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Count is :  " + evenCount + ", And  Odd Count is : " + oddCount);
    }

}
