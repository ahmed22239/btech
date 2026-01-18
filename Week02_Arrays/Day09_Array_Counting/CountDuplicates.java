/**
 * Question: Count duplicate elements in an array
 *
 * Example:
 * Input  : [1, 2, 3, 2, 4, 1]
 * Output : Duplicate count = 2
 *
 * Explanation:
 * - An element appearing more than once is duplicate
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week02_Arrays.Day09_Array_Counting;

public class CountDuplicates {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 2, 4, 1 };
        boolean visited[] = new boolean[arr.length];
        int duplicateCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if (count > 1) {
                duplicateCount++;
            }
        }
        System.out.println("Duplicate count is :  " + duplicateCount);
    }

}
