/**
 * Question: Find Equilibrium Index
 *
 * Equilibrium index is where:
 * left sum == right sum
 *
 * Example:
 * Input  : [-7, 1, 5, 2, -4, 3, 0]
 * Output : Index 3
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Week02_Arrays.Day13_Array_Advanced;

public class EquilibriumIndex {

    public static void main(String[] args) {

        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };

        int totalSum = 0;
        int leftSum = 0;

        // Calculate total sum of the array
        for (int num : arr) {
            totalSum = totalSum + num;
        }

        // Traverse the array to find the equilibrium index
        for (int i = 0; i < arr.length; i++) {

            // Right sum = total Sum - left sum - current element
            totalSum = totalSum - arr[i];

            // Check equilibrium condition
            if (leftSum == totalSum) {
                System.out.println("Equilibrium Index is : " + i);
                return;
            }

            // Add current element to left sum for next iteration
            leftSum = leftSum + arr[i];
        }

        // If no equilibrium index found
        System.out.println("No Equilibrium Index Found.");
    }
}
