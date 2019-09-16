package exercises.Chapter2;

/** Population projection */
public class Exercise11 {
    public static void main(String[] args) {
        System.out.print("Enter a number of years: ");
        int years = new java.util.Scanner(System.in).nextInt();
        System.out.printf("The population in %d years %d", years, (int)(312_032_486 + 365 * years * 24 * 3600 * (1 / 7.0 -  1 / 13.0 + 1 / 45.0)));
    }
}
