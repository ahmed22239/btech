/**
 * Question:
 * Create a simple calculator using switch-case.
 *
 * Operations:
 * +  Addition
 * -  Subtraction
 * *  Multiplication
 * /  Division
 *
 * Edge Case:
 * - Division by zero must be handled
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day06_Input_EdgeCases;

public class SimpleCalculator {

    public static void main(String[] args) {

        int a = 20;
        int b = 5;
        char operator = '/';

        // perform operation based on operator
        switch (operator) {

            case '+':
                System.out.println("Result = " + (a + b));
                break;

            case '-':
                System.out.println("Result = " + (a - b));
                break;

            case '*':
                System.out.println("Result = " + (a * b));
                break;

            case '/':
                // handle division by zero
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Division by zero not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }

}
