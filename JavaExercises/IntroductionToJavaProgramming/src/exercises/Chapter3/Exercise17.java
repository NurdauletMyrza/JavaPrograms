package exercises.Chapter3;

/** Game: scissor, rock, paper */
public class Exercise17 {
    public static void main(String[] args) {
        // Generate random number
        byte computer = (byte)(Math.random() * 3);

        // Prompt the user to enter number
        System.out.print("scissor (0), rock (1), paper(2): ");
        byte user = new java.util.Scanner(System.in).nextByte();

        // Display result
        System.out.print("The computer is ");
        switch (computer) {
            case 0: System.out.print("scissor"); break;
            case 1: System.out.print("rock"); break;
            case 2: System.out.print("paper");
        }
        System.out.print(". You are ");
        switch (user) {
            case 0: System.out.print("scissor"); break;
            case 1: System.out.print("rock"); break;
            case 2: System.out.print("paper");
        }
        System.out.print(". ");
        if (user == computer)
            System.out.println("It is a draw");
        else {
            switch (user) {
                case 0: System.out.println(computer == 2 ? "You won" : "You lose"); break;
                case 1: System.out.println(computer == 0 ? "You won" : "You lose"); break;
                case 2: System.out.println(computer == 1 ? "You won" : "You lose");
            }
        }
    }
}
