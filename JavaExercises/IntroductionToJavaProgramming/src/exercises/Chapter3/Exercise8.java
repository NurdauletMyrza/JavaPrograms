package exercises.Chapter3;

/** Sort three integers */
public class Exercise8 {
    public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt the user to enter numbers
        System.out.print("Enter three numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Display numbers in sorted version
        if (number1 <= number2) {
            if (number2 <= number3) {
                System.out.printf("%d\n%d\n%d", number1, number2, number3);
            }
            else if (number1 <= number3) {
                System.out.printf("%d\n%d\n%d", number1, number3, number2);
            }
            else {
                System.out.printf("%d\n%d\n%d", number3, number1, number2);
            }
        }
        else {
            if (number1 <= number3) {
                System.out.printf("%d\n%d\n%d", number2, number1, number3);
            }
            else if (number2 <= number3) {
                System.out.printf("%d\n%d\n%d", number2, number3, number1);
            }
            else {
                System.out.printf("%d\n%d\n%d", number3, number2, number1);
            }
        }
    }
}
