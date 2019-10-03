package exercises.Chapter6;

public class exercise6_15 {
    /** Financial application: print a tax table */
    public static void main(String[] args) {
        System.out.printf("%-20s%-20s%-20s%-20sHead of\n", "Taxable", "Single", "Married Joint", "Married");
        System.out.printf("%-40s%-20s%-20sa House\n", "Income", "or Qualifying", "Separate");
        System.out.printf("%50s\n", "Window(er)");
        for (int i = 0; i < 90; i++) {
            System.out.print("_");
        }
        System.out.println();
        for (int income = 50_000; income <= 60_000; income += 50) {
            System.out.printf("%-20d", income);
            for (int status = 0; status < 4; status++) {
                System.out.printf("%-20d", Math.round(computeTax(status, income)));
            }
            System.out.println();
        }
    }

    public static double computeTax(int status, double taxableIncome) {
        double tax = 0;
        double income = taxableIncome;
        switch (status) {
            case 0:
                // single filter
                if (income <= 8350){
                    tax = income * 0.1;
                }
                else if (income <= 33_950) {
                    tax = 8350 * 0.1 + (income - 8350) * 0.15;
                }
                else if (income <= 82_250) {
                    tax = 8350 * 0.1 + (33_950 - 8_350) * 0.15 + (income - 33_950) * 0.25;
                }
                else if (income <= 171_550) {
                    tax = 8350 * 0.1 + (33_950 - 8_350) * 0.15 + (82_350 - 33_950) * 0.25 + (income - 82_350) * 0.28;
                }
                else if (income <= 372_950) {
                    tax = 8350 * 0.1 + (33_950 - 8_350) * 0.15 + (82_350 - 33_950) * 0.25 + (171_550 - 82_350) * 0.28 + (income - 171_550) * 0.33;
                }
                else {
                    tax = 8350 * 0.1 + (33_950 - 8_350) * 0.15 + (82_350 - 33_950) * 0.25 + (171_550 - 82_350) * 0.28 + (372_950 - 171_550) * 0.33 + (income - 372_950) * 0.35;
                }
                break;
            case 1:
                // married jointly
                if (income <= 16_700){
                    tax = income * 0.1;
                }
                else if (income <= 67_900) {
                    tax = 16_700 * 0.1 + (income - 16_700) * 0.15;
                }
                else if (income <= 137_050) {
                    tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 + (income - 67_900) * 0.25;
                }
                else if (income <= 208_850) {
                    tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 + (137_050 - 67_900) * 0.25 + (income - 137_050) * 0.28;
                }
                else if (income <= 372_950) {
                    tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 + (137_050 - 67_900) * 0.25 + (208_850 - 137_050) * 0.28 + (income - 208_850) * 0.33;
                }
                else {
                    tax = 16_700 * 0.1 + (67_900 - 16_700) * 0.15 + (137_050 - 67_900) * 0.25 + (208_850 - 137_050) * 0.28 + (372_950 - 208_850) * 0.33 + (income - 372_950) * 0.35;
                }
                break;
            case 2:
                // married separately
                if (income <= 8350){
                    tax = income * 0.1;
                }
                else if (income <= 33_950) {
                    tax = 8350 * 0.1 + (income - 8350) * 0.15;
                }
                else if (income <= 68_525) {
                    tax = 8350 * 0.1 + (33_950 - 8_350) * 0.15 + (income - 33_950) * 0.25;
                }
                else if (income <= 104_425) {
                    tax = 8350 * 0.1 + (33_950 - 8_350) * 0.15 + (68_525 - 33_950) * 0.25 + (income - 68_950) * 0.28;
                }
                else if (income <= 186_475) {
                    tax = 8350 * 0.1 + (33_950 - 8_350) * 0.15 + (68_525 - 33_950) * 0.25 + (104_425 - 68_525) * 0.28 + (income - 104_425) * 0.33;
                }
                else {
                    tax = 8350 * 0.1 + (33_950 - 8_350) * 0.15 + (68_525 - 33_950) * 0.25 + (104_425 - 68_525) * 0.28 + (186_475 - 104_425) * 0.33 + (income - 186_475);
                }
                break;
            case 3:
                // head of household
                if (income <= 11_950){
                    tax = income * 0.1;
                }
                else if (income <= 45_500) {
                    tax = 11_950 * 0.1 + (income - 11_950) * 0.15;
                }
                else if (income <= 117_450) {
                    tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (income - 45_500) * 0.25;
                }
                else if (income <= 190_200) {
                    tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (117_450 - 45_500) * 0.25 + (income - 117_450) * 0.28;
                }
                else if (income <= 372_950) {
                    tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (117_450 - 45_500) * 0.25 + (190_200 - 117_450) * 0.28 + (income - 190_200) * 0.33;
                }
                else {
                    tax = 11_950 * 0.1 + (45_500 - 11_950) * 0.15 + (117_450 - 45_500) * 0.25 + (190_200 - 117_450) * 0.28 + (372_950 - 190_200) * 0.33 + (income - 372_950);
                }
                break;
            default:
                System.out.println("Error: invalid status");
                System.exit(1);
        }
        return tax;
    }
}
