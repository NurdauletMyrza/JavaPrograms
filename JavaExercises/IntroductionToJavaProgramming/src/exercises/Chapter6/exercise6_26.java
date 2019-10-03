package exercises.Chapter6;

public class exercise6_26 {
    /** Palindromic prime */
    public static void main(String[] args) {
        final int PER_LINE = 10;
        int count = 0;
        int number = 2;
        while (count < 100) {
            if (isPrime(number)) {
                if (isPalindromic(number)) {
                    System.out.print(number + " ");
                    count++;
                    if (count % PER_LINE == 0) {
                        System.out.println();
                    }
                }
            }
            number++;
        }
    }

    public static boolean isPalindromic(int number) {
        String str = Integer.toString(number);
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
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
