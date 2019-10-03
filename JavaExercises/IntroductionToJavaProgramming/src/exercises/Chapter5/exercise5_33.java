package exercises.Chapter5;

public class exercise5_33 {
    /** Perfect number */
    public static void main(String[] args) {
        for (int number = 1; number <= 10_000; number++) {
            int sum = 0;
            for (int divisor = 1; divisor <= number / 2.; divisor++) {
                if (number % divisor == 0) {
                    sum += divisor;
                }
            }
            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}
