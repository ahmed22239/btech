/**
 * Question: Trapping Rain Water
 *
 * Problem Statement:
 * Given an array where each element represents the height of a bar,
 * find how much rain water can be trapped between the bars.
 *
 * Example:
 * Input  : [3, 0, 0, 2, 0, 4]
 * Output : 10
 *
 * Explanation:
 * Water can be stored only when there are taller bars on both sides.
 * The amount of water stored at any position depends on:
 * - the tallest bar on the left
 * - the tallest bar on the right
 *
 * Water stored at a position =
 * min(leftMax, rightMax) - currentHeight
 *
 * ----------------------------------------------------
 * Algorithm (Step-by-Step):
 * 1. Use two pointers: left (start) and right (end)
 * 2. Keep track of:
 *    - leftMax: maximum height from the left side
 *    - rightMax: maximum height from the right side
 * 3. Compare height[left] and height[right]
 *    - If left is smaller:
 *        - If height[left] >= leftMax, update leftMax
 *        - Else, water trapped = leftMax - height[left]
 *        - Move left pointer forward
 *    - Else:
 *        - If height[right] >= rightMax, update rightMax
 *        - Else, water trapped = rightMax - height[right]
 *        - Move right pointer backward
 * 4. Add trapped water at each step
 * 5. Continue until left pointer crosses right pointer
 *
 * ----------------------------------------------------
 * Logic:
 * - Water level depends on the smaller boundary
 * - Two pointers help us avoid extra arrays
 * - We calculate water on the fly while moving pointers
 *
 * ----------------------------------------------------
 * Time Complexity:
 * O(n)
 * Reason: Each bar is visited only once
 *
 * Space Complexity:
 * O(1)
 * Reason: No extra array is used
 *
 * ----------------------------------------------------
 * Interview Tip:
 * This problem is commonly asked to test:
 * - Two pointer technique
 * - Logical thinking
 * - Space optimization
 */

package Week01_Basics_Logic.Week02_Arrays.Day13_Array_Advanced;

public class TrappingRainWater {

    public static void main(String[] args) {

        int[] height = { 3, 0, 0, 2, 0, 4 };

        // Call the trap function and print the result
        System.out.println("Trapped Rain Water: " + trap(height));
    }

    // Function to calculate trapped rain water
    public static int trap(int[] height) {

        // If the array is empty, then no water can be trapped
        if (height.length == 0) {
            return 0;
        }

        // Left pointer starting from the beginning
        int left = 0;
        // Right pointer starting from the end
        int right = height.length - 1;
        // Maximum height found from the left side
        int leftMax = 0;
        // Maximum height found from the right side
        int rightMax = 0;
        // Variable to store total trapped water
        int totalWater = 0;

        // Loop until left pointer crosses right pointer
        while (left < right) {

            // If left height is less than right height
            if (height[left] < height[right]) {
                // If current left height is greater than or equal to leftMax
                if (height[left] >= leftMax) {

                    // Update leftMax
                    leftMax = height[left];
                } else {

                    // Calculate trapped water at left position
                    totalWater += leftMax - height[left];
                }

                // Move left pointer to the right
                left++;
            } else {
                // If current right height is greater than or equal to rightMax
                if (height[right] >= rightMax) {
                    // Update rightMax
                    rightMax = height[right];
                } else {
                    // Calculate trapped water at right position
                    totalWater += rightMax - height[right];
                }
                // Move right pointer to the left
                right--;
            }
        }
        
        // Return the total trapped water
        return totalWater;

    }

}
