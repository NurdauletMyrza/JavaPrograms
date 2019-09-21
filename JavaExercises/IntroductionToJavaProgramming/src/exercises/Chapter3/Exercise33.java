package exercises.Chapter3;

/** Financial: compare costs */
public class Exercise33 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt the user to enter the weight and price of first package
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        // Prompt the user to enter the weight and price of second package
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        // Display result
        if (weight1 / price1 == weight2 / price2) {
            System.out.println("Two packages have the same price.");
            System.exit(1);
        }
        System.out.printf("Package %d has a better price.", (weight1 / price1 > weight2 / price2) ? 1 : 2);
    }
}
