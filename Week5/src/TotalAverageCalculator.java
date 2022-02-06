/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable and constant names?
       Mark out of 10: 10
       Comment: Used common language to describe variables.
   2. Did I format the variable and constant names properly (in lowerCamelCase and UPPERCASE)?
       Mark out of 5: 5
       Comment: All constants and variables in correct format.
   3. Did I indent the code appropriately?
       Mark out of 10: 10
       Comment: Yes, all code indented under relating code.
   4. Did I implement a for loop to read the input as required?
       Mark out of 10: 10
       Comment: for loop used to request inputs.
      Total Mark out of  35 (Add all the previous marks): 35
*/

import java.util.Scanner;
public class TotalAverageCalculator
{

    public static final int MINIMUM = 2;
    public static final int MAXIMUM = 10;

    public static void main(String[] args)
    {
        System.out.print("How many integers do you want to enter? ");
        Scanner input = new Scanner(System.in);
        int numberOfIntegers = input.nextInt();

        if(numberOfIntegers >= MINIMUM && numberOfIntegers <= MAXIMUM)
        {
            double total = 0;
            for (int count = 1; count <= numberOfIntegers; count++)
            {
                System.out.print("Enter integer " + count + ": ");
                int inputNumber = input.nextInt();
                total = total + inputNumber;
            }
            double average = total / numberOfIntegers;
            System.out.printf("The sum of your integers is %.0f and the average is %.2f", total, average);
        }
        else
        {
            System.out.println("Error:  This program is constrained to only compute the total & average of between " +
                    MINIMUM + " & " + MAXIMUM + " integers.");
        }
        input.close();
    }
}
