/**
 * Question: Count unique elements in an array
 *
 * Example:
 * Input  : [1, 2, 2, 3, 4, 4]
 * Output : Unique count = 2
 *
 * Explanation:
 * - Unique elements appear only once
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(n)
 */

package Week01_Basics_Logic.Week02_Arrays.Day09_Array_Counting;

public class CountUniqueElements {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 3, 4, 4 };
        boolean visited[] = new boolean[arr.length];
        int uniqueCount = 0;

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
            if (count == 1) {
                uniqueCount++;
            }
        }
        System.out.println("Unique count is :  " + uniqueCount);
    }
    
}
