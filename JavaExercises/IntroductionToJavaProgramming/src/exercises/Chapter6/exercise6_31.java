package exercises.Chapter6;

import java.util.Scanner;

public class exercise6_31 {
    /** Financial: credit card number validation */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();
        System.out.printf("%d is %svalid", number, isValid(number) ? "" : "in");
    }

    /** Display true if the card number is valid */
    public static boolean isValid(long number) {
        boolean isValid = true;
        if (!(getSize(number) >= 13 && getSize(number) <= 16)) {
            return false;
        }
        if (!(prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6))) {
            return false;
        }
        return (sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
    }

    /** Get result from the Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        int digit;
        while (number > 0) {
            number /= 10;
            digit = (int)(number % 10);
            sum += getDigit(digit * 2);
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number) {
        int result = 0;
        while (number > 0) {
            result += number % 10;
            number /= 10;
        }
        return result;
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        int digit;
        while (number > 0) {
            digit = (int)(number % 10);
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    /** Return true if the digit d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        long prefix = getPrefix(number, Integer.toString(d).length());
        return prefix == d;
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        return Long.toString(d).length();
    }

    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k) {
        String numberStr = Long.toString(number);
        long prefix = number;
        if (numberStr.length() >= k) {
            prefix = Long.parseLong(numberStr.substring(0, k));
        }
        return prefix;
    }
}
