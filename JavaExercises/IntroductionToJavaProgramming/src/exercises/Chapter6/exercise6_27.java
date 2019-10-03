package exercises.Chapter6;

import org.omg.PortableInterceptor.INACTIVE;

public class exercise6_27 {
    /** Emirp */
    public static void main(String[] args) {
        final int PER_LINE = 10;
        int count = 0;
        int number = 2;
        while (count < 100) {
            if (isEmirpPrime(number)) {
                System.out.print(number + " ");
                count++;
                if (count % PER_LINE == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }

    public static boolean isEmirpPrime(int number) {
        if (isPrime(number)) {
            StringBuilder str = new StringBuilder(Integer.toString(number));
            int reverseNumber = Integer.parseInt(str.reverse().toString());
            return isPrime(reverseNumber) && reverseNumber != number;
        }
        return false;
    }

    public static boolean isPrime(int number) {
        for (int devider = 2; devider <= number / 2; devider++) {
            if (number % devider == 0) {
                return false;
            }
        }
        return number > 1;
    }
}
