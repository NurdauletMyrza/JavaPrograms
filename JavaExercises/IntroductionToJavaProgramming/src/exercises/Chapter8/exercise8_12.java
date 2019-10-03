package exercises.Chapter8;

import java.util.Scanner;

public class exercise8_12 {
    /** Financial application: compute tax */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter filing status
        System.out.print("(0-single filer, 1-married jointly or qualifying widow(er)," +
                " 2-married separately, 3-head of household)\nEnter the filing status: ");
        byte status = input.nextByte();

        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},   // Single filer
                {16700, 67900, 137050, 20885, 372950},  // Married jointly
                                                        // -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475},   // Married separately
                {11950, 45500, 117450, 190200, 372950}  // Head of household
        };

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        // Compute tax
        double tax;
        if (income <= brackets[status][0]){
            tax = income * 0.1;
        }
        else if (income <= brackets[status][1]) {
            tax = brackets[status][0] * 0.1 + (income - brackets[status][0]) * 0.15;
        }
        else if (income <= brackets[status][2]) {
            tax = brackets[status][0] * 0.1 + (brackets[status][1] - brackets[status][0]) * 0.15 + (income - brackets[status][1]) * 0.25;
        }
        else if (income <= brackets[status][3]) {
            tax = brackets[status][0] * 0.1 + (brackets[status][1] - brackets[status][0]) * 0.15 + (brackets[status][2] - brackets[status][1]) * 0.25 + (income - brackets[status][2]) * 0.28;
        }
        else if (income <= brackets[status][4]) {
            tax = brackets[status][0] * 0.1 + (brackets[status][1] - brackets[status][0]) * 0.15 + (brackets[status][2] - brackets[status][1]) * 0.25 + (brackets[status][3] - brackets[status][2]) * 0.28 + (income - brackets[status][3]) * 0.33;
        }
        else {
            tax = brackets[status][0] * 0.1 + (brackets[status][1] - brackets[status][0]) * 0.15 + (brackets[status][2] - brackets[status][1]) * 0.25 + (brackets[status][3] - brackets[status][2]) * 0.28 + (brackets[status][4] - brackets[status][3]) * 0.33 + (income - brackets[status][4]) * 0.35;
        }


        // Display the result
        System.out.println("Tax is " + (int)(tax * 100) / 100.0);

    }
}
