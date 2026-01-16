/**
 * Purpose:
 * Reattempt 20 core logic problems from Week-1 without referring to old solutions.
 *
 * Focus:
 * - Logic clarity
 * - Loop control
 * - Edge case handling
 *
 * Time Complexity: Depends on problem
 * Space Complexity: O(1)
 */

package Week01_Basics_Logic.Day07_Revision;

public class ReattemptProblems {

    public static void main(String[] args) {

        // 1. Print 1 to N 
        int num1 = 5;
        for (int i = 1; i <= num1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. Sum of natural Numbers
        int num2 = 10, sum = 0;
        for (int i = 1; i <= num2; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is : " + sum);

        // 3. Even or Odd
        int num3 = 17;
        System.out.println(num3 % 2 == 0 ? "Even." : " Odd.");

        // 4. Largest of Three Numbers
        int a = 10, b = 20, c = 15;
        int largest = a;
        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        System.out.println("Largest is : " + largest);

        // 5.Count Digits
        int num5 = 90876, count = 0;
        while (num5 > 0) {
            count++;
            num5 = num5 / 10;
        }
        System.out.println("Digit Count is : " + count);

        // 6. Reverse Number
        int num6 = 1234, rev = 0;
        while (num6 > 0) {
            rev = rev * 10 + (num6 % 10);
            num6 = num6 / 10;
        }
        System.out.println("Reverse Number is : " + rev);

        // 7. Palindrome Number
        int num7 = 121, temp7 = num7, rev7 = 0;
        while (temp7 > 0) {
            rev7 = rev7 * 10 + (temp7 % 10);
            temp7 = temp7 / 10;
        }
        System.out.println(num7 == rev7 ? "Palindrome. " : "Not Palindrome.");

        // 8. Sum of Digits

        int num8 = 456, sum8 = 0;
        while (num8 > 0) {
            sum8 = sum8 + num8 % 10;
            num8 = num8 / 10;
        }
        System.out.println(" Sum of Digits  :  " + sum8);

        // 9. Prime Number Check
        int num9 = 29;
        boolean prime = num9 > 1;
        for (int i = 2; i <= num9; i++) {
            if (num9 % i == 0) {
                prime = false;
                break;
            }
        }
        System.out.println(prime ? "Numebr is Prime. " : "Number is Not Prime.");

        // 10. Print Prime Till N
        int limit = 10;
        for (int i = 2; i <= limit; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " ");
            }
        }
        System.out.println();

        // 11. Factorial
        int num11 = 5, fact = 1;
        for (int i = 1; i <= num11; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num11 + " is : " + fact);

        // 12. Count factors
        int num12 = 12, factors = 0;
        for (int i = 1; i <= num12; i++) {
            if (num12 % i == 0) {
                factors++;
            }
        }
        System.out.println("Factors Count : " + factors);

        // 13. GDC
        int x = 36, y = 60;
        while (y != 0) {
            int r = x % y;
            x = y;
            y = r;
        }
        System.out.println("GCD is  : " + x);

        // 14. LCM
        int p = 4, q = 6;
        int max = p > q ? p : q;
        while (true) {
            if (max % p == 0 && max % q == 0) {
                System.out.println(" LCM is  : " + max);
                break;
            }
            max++;
        }

        // 15. Fibonacci Series
        int f1 = 0, f2 = 1;
        System.out.println(" Fibonacci : " + f1 + " " + f2 + " ");
        for (int i = 3; i <= 7; i++) {
            int f3 = f1 + f2;
            System.out.print(f3 + " ");
            f1 = f2;
            f2 = f3;
        }
        System.out.println();

        // 16. Power of Number
        int base = 2, exp = 5, power = 1;
        for (int i = 1; i <= exp; i++) {
            power = power * base;
        }
        System.out.println("Power is: " + power);

        // 17. Armstrong Number
        int num17 = 153, temp17 = num17, digits = 0, armSum = 0;
        while (temp17 > 0) {
            digits++;
            temp17 /= 10;
        }
        temp17 = num17;
        while (temp17 > 0) {
            int d = temp17 % 10;
            int pow = 1;
            for (int i = 1; i <= digits; i++) {
                pow = pow * d;
            }
            armSum += pow;
            temp17 /= 10;
        }
        System.out.println(armSum == num17 ? "Armstrong." : "Not Armstrong.");

        // 18. Swap Two Numbers (No Third Numbers)
        int s1 = 5, s2 = 10;
        s1 = s1 + s2;
        s2 = s1 - s2;
        s1 = s1 - s2;
        System.out.println("Swapped : " + s1 + " , " + s2);

        // 19. Count Even and Odd Digits
        int num19 = 12345, even = 0, odd = 0;
        while (num19 > 0) {
            int d = num19 % 10;
            if (d % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num19 = num19 / 10;
        }
        System.out.println("Even Digits : " + even + " , Odd Digits : " + odd);

        // 20. Leep Year
        int year = 2014;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is Leap Year.");
        } else {
            System.out.println(year + " is not Leap Year.");
        }

    }

}
