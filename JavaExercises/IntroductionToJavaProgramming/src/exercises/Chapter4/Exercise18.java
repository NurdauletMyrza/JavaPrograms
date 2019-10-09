package exercises.Chapter4;
import java.util.Scanner;

public class Exercise18 {
    /** Student major and status */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a two characters
        System.out.print("Enter two characters: ");
        String twoCharacters = input.next();

        // Assign lesson
        String lesson = "";
        switch (twoCharacters.charAt(0)) {
            case 'M': lesson = "Mathematics"; break;
            case 'C': lesson = "Computer Science"; break;
            case 'I': lesson = "Information Technology"; break;
            default: System.out.println("Invalid input (first character)");System.exit(1);
        }

        // Assign student
        String student = "";
        switch (twoCharacters.charAt(1)) {
            case '1': student = "Freshman"; break;
            case '2': student = "Sophomore"; break;
            case '3': student = "Junior"; break;
            case '4': student = "Senior"; break;
            default: System.out.println("Invalid input (second character)"); System.exit(1);
        }

        // Display result
        System.out.println(lesson + " " + student);
    }
}
