/**
 * Question: Print all elements of an array
 *
 * Example:
 * Input  : [10, 20, 30, 40]
 * Output : 10 20 30 40
 *
 * Explanation:
 * - Use a loop to traverse the array
 * - Print each element using its index
 *
 * Dry Run:
 * i=0 → print 10
 * i=1 → print 20
 * i=2 → print 30
 * i=3 → print 40
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day08_Array_Basics;

public class PrintArray {

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
