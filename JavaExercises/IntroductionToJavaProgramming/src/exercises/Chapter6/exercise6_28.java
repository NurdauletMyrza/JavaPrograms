package exercises.Chapter6;

public class exercise6_28 {
    /** Mersenne prime */
    public static void main(String[] args) {
        System.out.printf("%-15c%s\n", 'p', "2^p-1");
        System.out.println("_____________________");
        for (int p = 1; p <= 31; p++) {
            int number = (int)(Math.pow(2, p)) - 1;
            if (isMersennePrime(number)) {
                System.out.printf("%-15d%d\n", p, number);
            }
        }
    }

    public static boolean isMersennePrime(int number) {
        if (isPrime(number++)) {
            while (number % 2 == 0) {
                number /= 2;
                if (number == 1) {
                    return true;
                }
            }
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
