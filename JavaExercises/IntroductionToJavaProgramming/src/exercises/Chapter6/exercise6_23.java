package exercises.Chapter6;

public class exercise6_23 {
    /** Occurrence of a specified character */
    public static void main(String[] args) {
        System.out.println(count("Welcome", 'e'));
    }

    public static int count(String str, char a) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        return count;
    }
}
