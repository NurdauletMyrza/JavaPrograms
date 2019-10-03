package exercises.Chapter6;

public class exercise6_10 {
    /** Main method */
    public static void main(String[] args) {
        System.out.print(2 + " ");
        for (int i = 3, count = 0; i < 10000; i+=2, count++) {
            if (count % 100 == 0) System.out.println();
            System.out.print((exercises.PrimeNumberMethod.isPrime(i)) ? i + " " : "");
        }
    }
}
