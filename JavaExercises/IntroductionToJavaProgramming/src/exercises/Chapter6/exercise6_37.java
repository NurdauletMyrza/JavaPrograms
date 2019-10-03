package exercises.Chapter6;
import java.util.Scanner;

public class exercise6_37 {
    /** Main method */
    public static void main(String[] args) {
        System.out.println(format(45,6));
        System.out.println(format(45,5));
        System.out.println(format(-5,3));
    }

    /** Format int number */
    public static String format(int number, int width) {
        String numberStr = Math.abs(number) + "";
        if (width > numberStr.length())
            for (int i = 0; i <= width - numberStr.length(); i++)
                numberStr = "0" + numberStr;
        return (number < 0)?"-"+numberStr:numberStr;
    }
}
