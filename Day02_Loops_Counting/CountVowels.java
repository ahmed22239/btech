/**
 * Question:
 * Count vowels in a given string.
 *
 * Example:
 * Input: "logicbuilding"
 * Output: 5
 *
 * Logic:
 * - Loop through characters
 * - Check vowel condition
 */

package Week01_Basics_Logic.Day02_Loops_Counting;

public class CountVowels {
    public static void main(String[] args) {
        String input = "logicbuilding";
        int vowelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

    }

}
