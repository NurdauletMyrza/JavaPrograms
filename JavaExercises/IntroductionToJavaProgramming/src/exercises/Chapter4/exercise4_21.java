package exercises.Chapter4;
import java.util.Scanner;

public class exercise4_21 {
    /** Check SSN */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a SSN
        System.out.print("Enter a SSN: ");
        String ssn = input.next();

        int index1 = ssn.indexOf("-");
        int index2 = ssn.indexOf("-", index1 + 1);

        boolean b = index1 == 3 && index2 == 6;

        for (int i = 0; i < ssn.length(); i++) {
            if (!b)
                break;
            if (i == index1 || i == index2)
                continue;
            b = Character.isDigit(ssn.charAt(i));
        }

        // Display result
        System.out.printf("%s is a%svalid social security number", ssn, b ? " " : "n in");
    }
}
