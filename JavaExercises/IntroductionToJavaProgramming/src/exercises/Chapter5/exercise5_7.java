package exercises.Chapter5;

public class exercise5_7 {
    /** Financial application: compute future tuition */
    public static void main(String[] args) {
        double tuition = 10000;
        double increases = 1.05;
        double cost = 0;


        for (int i = 0; i < 14; i++) {
            tuition *= increases;
            if (i > 9) {
                cost += tuition;
            }
        }

        System.out.println(cost);
    }
}
