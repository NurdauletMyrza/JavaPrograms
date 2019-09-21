package exercises.Chapter3;

public class Exercise18 {
    /** Cost of shipping */
    public static void main(String[] args) {
        // Prompt the user to enter weight
        System.out.print("Enter weight: ");
        double weight = new java.util.Scanner(System.in).nextDouble();

        // Display shipping cost
        System.out.print("The shipping cost is ");
        if (weight > 0 && weight <= 1)
            System.out.println(3.5);
        else if (weight > 1 && weight <= 3)
            System.out.println(5.5);
        else if (weight > 3 && weight <= 10)
            System.out.println(8.5);
        else if (weight > 10 && weight <= 20)
            System.out.println(10.5);
        else {
            System.out.println("not found.");
            System.out.print("Error: the package cannot be shipped");
            System.exit(1);
        }
    }
}
