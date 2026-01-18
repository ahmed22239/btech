/**
 * Question: Find frequency of each element in an array
 *
 * Example:
 * Input  : [1, 2, 2, 3, 1]
 * Output :
 * 1 -> 2
 * 2 -> 2
 * 3 -> 1
 *
 * Explanation:
 * - Use visited array
 * - Count occurrences of each element
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week02_Arrays.Day09_Array_Counting;

public class FrequencyOfElements {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 3, 1 };

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;
            }
            int count = 1;

            for (int j = 1 + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }

}
