package exercises.Chapter5;

public class exercise5_42 {
    /** Financial application: find the sales amount */
    public static void main(String[] args) {
        // Assign values
        int minimumSales = 0;
        int earn;
        double commision;
        final int goal = 30_000;
        final double commission0to5 = 0.08;
        final double commission5to10 = 0.1;
        final double commission10above = 0.12;

        // Finds result
        do {
            minimumSales++;
            commision = 0;
            if (minimumSales < 5000) {
                commision += minimumSales * commission0to5;
            }
            else {
                commision += 5000 * commission0to5;
                if (minimumSales < 10_000) {
                    commision += (minimumSales - 5000) * commission5to10;
                }
                else {
                    commision += 5000 * commission5to10 + (minimumSales - 10_000) * commission10above;
                }
            }
            earn = (int)(minimumSales - commision);
        } while (earn < goal);

        // Display result
        System.out.println(minimumSales);
    }
}
