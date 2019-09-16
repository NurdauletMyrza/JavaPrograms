package exercises.Chapter2;

/** Geometry: area of hexagon */
public class Exercise16 {
    public static void main(String[] args) {
        System.out.print("Enter the side: ");
        double side = new java.util.Scanner(System.in).nextDouble();
        System.out.printf("The area of the hexagon is %f", 3 * Math.sqrt(3) / 2 * Math.pow(side, 2));
    }
}
