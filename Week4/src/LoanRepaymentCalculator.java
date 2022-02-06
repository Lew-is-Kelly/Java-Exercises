/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 5: 3
       Comment: Only used one constant.
   2. Did I use easy-to-understand, meaningful CONSTANT names?
       Mark out of 5: 5
       Comment: Used common terms not easy to mix up.
        3. Did I format the CONSTANT names properly (in UPPERCASE)?
       Mark out of 5: 5
       Comment: All constants are in uppercase with '_' separating the words.
   4. Did I use easy-to-understand meaningful variable names?
       Mark out of 10: 10
       Comment: Used common terms not easy to mix up.
   5. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5: 5
       Comment: All in lowerCamelCase
   6. Did I indent the code appropriately?
       Mark out of 10: 10
       Comment: All code is indented after relating code.
     Total Mark out of  40 (Add all the previous marks): 38
*/

import java.util.Scanner;
public class LoanRepaymentCalculator {
    public static final double MONTHS_IN_A_YEAR = 12;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter loan amount? ");
        double totalLoanAmount = input.nextDouble();
        System.out.print("Enter annual interest rate (e.g. 0.04)? ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Enter the term of the loan in years? ");
        double loanTerm = input.nextInt();
        input.close();

        double loanInMonths = loanTerm * MONTHS_IN_A_YEAR;
        double monthlyInterestRate = annualInterestRate / MONTHS_IN_A_YEAR;
        double monthlyRepayment = totalLoanAmount * ((monthlyInterestRate *
                                    Math.pow((1.0 + monthlyInterestRate) , loanInMonths))) /
                                    (Math.pow((1.0 + monthlyInterestRate) , loanInMonths) - 1.0);

        System.out.printf("The monthly repayment for a %.0f year loan of %.2f" +
                        " at an annual interest rate of %.2f would be %.2f",
                        loanTerm, totalLoanAmount, annualInterestRate, monthlyRepayment);
    }
}
