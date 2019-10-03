package exercises.Chapter6;

public class exercise6_11 {
    /** Financial application: compute commissions */
    public static void main(String[] args) {
        System.out.printf("%-20s%s\n", "Sales Amount", "Commission");
        for (int i = 0; i < 30; i++) {
            System.out.print("_");
        }
        for (int salesAmount = 10_000; salesAmount <= 100_000; salesAmount += 5000) {
            System.out.printf("\n%-20d%7.1f", salesAmount, computeCommission(salesAmount));
        }
    }

    public static double computeCommission(double salesAmount) {
        final double commission0to5 = 0.08;
        final double commission5to10 = 0.1;
        final double commission10above = 0.12;
        double commision = 0;
        if (salesAmount < 5000) {
            commision += salesAmount * commission0to5;
        }
        else {
            commision += 5000 * commission0to5;
            if (salesAmount < 10_000) {
                commision += (salesAmount - 5000) * commission5to10;
            }
            else {
                commision += 5000 * commission5to10 + (salesAmount - 10_000) * commission10above;
            }
        }
        return commision;
    }
}
