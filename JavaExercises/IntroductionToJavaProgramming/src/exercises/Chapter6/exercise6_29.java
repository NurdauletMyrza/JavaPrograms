package exercises.Chapter6;

public class exercise6_29 {
    /** Twin primes */
    public static void main(String[] args) {
        int count = 0;
        int number = 2;
        while (count < 1000) {
            if (isTwinPrime(number)) {
                System.out.printf("(%d, %d)\n", number, number +2);
                count++;
            }
            number++;
        }
    }

    public static boolean isTwinPrime(int number) {
        return isPrime(number) && isPrime(number + 2);
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
