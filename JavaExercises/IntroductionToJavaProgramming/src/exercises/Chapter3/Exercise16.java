package exercises.Chapter3;

/** Random point */
public class Exercise16 {
    public static void main(String[] args) {
        // Generate random point in rectangle
        double x = Math.random() * 50 * Math.pow(-1, (int)(Math.random() * 2));
        double y = Math.random() * 100 * Math.pow(-1, (int)(Math.random() * 2));

        // Display random point
        System.out.printf("Random point in rectangle (%f, %f)", x, y);
    }
}



//                            |
//                            |
//          |----------------100----------------|
//          |                 |                 |
//   x      |                 |                 |
//          |                 |    o            |
//          |                 |                 |
//          |                 |                 |
//          |                 |                 |
//          |                 |                 |
//------- -100 ------------------------------- 100 --------
//          |                 |                 |
//          |                 |                 |
//          |                 |                 |
//          |                 |                 |
//          |                 |                 |
//          |                 |                 |
//          |                 |                 |
//          |                 |                 |
//          |----------------100----------------|
//                            |
//                            |
//