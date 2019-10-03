package exercises.Chapter7;

public class exercise7_14 {
    /** Computing gcd */
    public static void main(String[] args) {
        System.out.println(gcd(125, 50, 100));
    }

    public static int gcd(int... numbers) {
        int result = 1;
        int min = min(numbers);
        for (int i = 1; i < min; i++) {
            boolean isDivisible = true;
            for (int number: numbers) {
                if (number % i != 0) {
                    isDivisible = false;
                }
            }
            if (isDivisible) {
                result = i;
            }
        }
        return result;
    }

    public static int min(int... numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }
}
