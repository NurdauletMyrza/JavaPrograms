package exercises.Chapter3;

/** Financial application: compute taxes */
public class Exercise13 {
    public static void main(String[] args) {
        // Create a Scanner
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        double tax = 0;

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

        System.out.println("Single filter: " + tax);

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

        System.out.println("Married jointly: " + tax);

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

        System.out.println("Married separately: " + tax);

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

        System.out.println("Head of household: " + tax);
    }
}
