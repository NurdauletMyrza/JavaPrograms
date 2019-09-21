package exercises.Chapter3;

/** Financial application: monetary units */
public class Exercise7 {
    public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100; // dollars
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;    // quarters
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;   // dimes
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;  // nickels
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;  // pennies

        // Display results
        System.out.println("Your amount " + amount + " consists of");   // output
        // variant 1
        switch (numberOfOneDollars) {
            case 0: break;
            default: System.out.printf("    %d dollar%s\n", numberOfOneDollars, numberOfOneDollars != 1 ? "s" : "");
        }
        // variant 2
        if (numberOfQuarters != 0) {
            System.out.printf("    %d quarter%s\n", numberOfQuarters, numberOfQuarters != 1 ? "s" : "");
        }
        // variant 3
        if (numberOfDimes == 1)
            System.out.println("    " + numberOfDimes + " dime");
        else if (numberOfDimes != 0)
            System.out.println("    " + numberOfDimes + " dimes");
        if (numberOfNickels == 1)
            System.out.println("    " + numberOfNickels + " nickel");
        else if (numberOfNickels != 0)
            System.out.println("    " + numberOfNickels + " nickels");
        if (numberOfPennies == 1)
            System.out.println("    " + numberOfPennies + " penny");
        else if (numberOfPennies != 0)
            System.out.println("    " + numberOfPennies + " pennies");
    }
}
