package exercises.Chapter2;

/** Cost of driving */
public class Exercise23 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        System.out.printf("The cost of driving is $%f", distance / milesPerGallon * pricePerGallon);
    }
}
