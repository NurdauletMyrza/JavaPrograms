package exercises.Chapter6;

public class exercise6_19 {
    /** The MyTriangle class */
    public static void main(String[] args) {
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;
        System.out.println(MyTriangle.isValid(side1, side2, side3));
        System.out.println(MyTriangle.area(side1, side2, side3));
    }
}
