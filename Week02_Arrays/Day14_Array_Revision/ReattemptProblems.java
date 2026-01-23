/**
 * Week 02 - Day 14 : Array Revision (Single File)
 * ------------------------------------------------
 * This file contains the TOP 15 most important array problems
 * frequently asked in coding interviews and placements.
 *
 * Topics Covered:
 * 1. Max & Min in Array
 * 2. Reverse Array
 * 3. Linear Search
 * 4. Binary Search
 * 5. First & Last Occurrence
 * 6. Move Zeros to End
 * 7. Count Even & Odd Elements
 * 8. Second Largest Element
 * 9. Rotate Array by K
 * 10. Kadane’s Algorithm (Maximum Subarray Sum)
 * 11. Prefix Sum Array
 * 12. Two Sum Problem
 * 13. Leaders in Array
 * 14. Majority Element (Moore’s Voting Algorithm)
 * 15. Trapping Rain Water
 *
 * Key Highlights:
 * - Single-file revision for quick practice
 * - Beginner-friendly logic with step-by-step comments
 * - Optimized solutions where applicable
 * - Interview and resume ready
 *
 */

/*
 * NOTE ABOUT clone():
 * -------------------
 * Arrays in Java are reference types.
 * If we pass the same array to multiple methods and modify it,
 * the original array also gets changed.
 *
 * To avoid this problem, we use arr.clone().
 * clone() creates a new copy of the array so that:
 * - Original array remains unchanged
 * - Each problem works independently
 *
 * Example:
 * reverseArray(arr.clone());  // works on copy
 * moveZeros(arr.clone());     // original arr is safe
 */

package Week01_Basics_Logic.Week02_Arrays.Day14_Array_Revision;

public class ReattemptProblems {

    public static void main(String[] args) {

        // Sample array used for most problems
        int[] arr = { 1, 2, 0, 3, 2, 4, 0, 5 };

        // 1. Max & Min in Array
        System.out.println("\n1. Max & Min in Array:");
        maxMin(arr);

        // 2. Reverse Array
        System.out.println("\n2. Reverse Array:");
        reverseArray(arr.clone());

        // 3. Linear Search
        System.out.println("\n3. Linear Search:");
        linearSearch(arr, 3);

        // 4. Binary Search (Array must be sorted)
        System.out.println("\n4. Binary Search:");
        int[] sortedArr = { 0, 0, 1, 2, 2, 3, 4, 5 };
        binarySearch(sortedArr, 4);

        // 5. First & Last Occurrence
        System.out.println("\n5. First & Last Occurrence:");
        firstLastOccurrence(sortedArr, 2);

        // 6. Move Zeros to End
        System.out.println("\n6. Move Zeros to End:");
        moveZeros(arr.clone());

        // 7. Count Even & Odd Elements
        System.out.println("\n7. Count Even & Odd Elements:");
        countEvenodd(arr);

        // 8. Second Largest Element
        System.out.println("\n8. Second Largest Element:");
        secondLargest(new int[] { 10, 5, 20, 8 });

        // 9. Rotate Array By k
        System.out.println("\n9. Rotate Array by K:");
        rotateByK(new int[] { 1, 2, 3, 4, 5 }, 2);

        // 10. Kadane (Max Subarray Sum)
        System.out.println("\n10. Kadane's Algorithm (Max Subarray Sum):");
        kadane(new int[] { -2, 1, -3, 4, -1, 2, 1 });

        // 11. Prfix Sum Array
        System.out.println("\n11. Prefix Sum Array:");
        prefixSum(new int[] { 1, 2, 3, 4 });

        // 12. Two Sum
        System.out.println("\n12. Two Sum Problem:");
        twoSum(new int[] { 2, 7, 11, 15 }, 9);

        // 13. Leaders in Array
        System.out.println("\n13. Leaders in Array:");
        leaders(new int[] { 16, 17, 4, 3, 5, 2 });

        // 14. Majority Element
        System.out.println("\n14. Majority Element:");
        majorityElement(new int[] { 2, 2, 1, 2, 3, 2, 2 });

        // 15. Trapping Water Problem
        System.out.println("\n15. Trapping Rain Water:");
        trappingRainWater(new int[] { 3, 0, 0, 2, 0, 4 });

    }

    // 1. Max and Min
    static void maxMin(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int x : arr) {
            if (x > max)
                max = x;
            if (x < min)
                min = x;
        }
        System.out.println("Max = " + max + ", Min = " + min);
    }

    // 2. Reverse Array
    static void reverseArray(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
        print(arr);
    }

    // 3. Linear Search
    static void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    // 4. Binary Search (Assuming array is sorted)
    static void binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element not found");
    }

    // 5. First & Last Occurrence
    static void firstLastOccurrence(int[] arr, int key) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (first == -1)
                    first = i;
                last = i;
            }
        }
        System.out.println("First Occurrence: " + first + ", Last Occurrence: " + last);
    }

    // 6. Move Zeros to End
    static void moveZeros(int[] arr) {
        int index = 0;
        for (int x : arr)
            if (x != 0)
                arr[index++] = x;
        while (index < arr.length)
            arr[index++] = 0;
        print(arr);
    }

    // 7. Count Even & Odd Elements
    static void countEvenodd(int[] arr) {
        int even = 0, odd = 0;
        for (int x : arr) {
            if (x % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + ", Odd: " + odd);
    }

    // 8. Second Largest Element
    static void secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x > second && x != largest) {
                second = x;
            }
        }
        System.out.println("Second Largest Element is : " + second);
    }

    // 9. Rotate Array by K
    static void rotateByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // In case k > n
        reverse(arr, 0, n - 1); // Reverse the whole array
        reverse(arr, 0, k - 1); // Reverse first k elements
        reverse(arr, k, n - 1); // Reverse remaining n-k elements
        print(arr);
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
    }

    // 10. Kadane’s Algorithm (Maximum Subarray Sum)
    static void kadane(int[] arr) {
        int maxSum = arr[0], curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            maxSum = Math.max(maxSum, curr);
        }
        System.out.println("Maximum Subarray Sum is : " + maxSum);
    }

    // 11. Prefix Sum Array
    static void prefixSum(int[] arr) {
        for (int i = 1; i < arr.length; i++)
            arr[i] = arr[i] + arr[i - 1];
        print(arr);
    }

    // 12. Two Sum Problem
    static void twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                    return;
                }
            }
        }
        System.out.println("No pair found");
    }

    // 13. Leaders in Array
    static void leaders(int[] arr) {
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        System.out.print(maxFromRight + " ");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
        System.out.println();
    }

    // 14. Majority Element (Moore’s Voting Algorithm)
    static void majorityElement(int[] arr) {
        int count = 0, candidate = 0;
        for (int x : arr) {
            if (count == 0) {
                candidate = x;
            }
            count = (x == candidate) ? count + 1 : count - 1;
        }
        System.out.println("Majority Element is : " + candidate);
    }

    // 15. Trapping Rain Water
    static void trappingRainWater(int[] height) {
        int l = 0, r = height.length - 1;
        int leftMax = 0, rightMax = 0, water = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                if (height[l] >= leftMax) {
                    leftMax = height[l];
                } else {
                    water += leftMax - height[l];
                }
                l++;
            } else {
                if (height[r] >= rightMax) {
                    rightMax = height[r];
                } else {
                    water += rightMax - height[r];
                }
                r--;
            }
        }
        System.out.println("Trapped Rain Water is : " + water);
    }

    /*
     * UTILITY METHOD
     * --------------
     * This is a helper method used only for printing arrays.
     * It avoids writing the same print loop again and again.
     *
     * Why used?
     * - Reduces code repetition
     * - Makes code clean and readable
     * - Used by multiple problems
     *
     * This method does NOT solve any problem.
     * It only helps in displaying output.
     */
    static void print(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }
}
