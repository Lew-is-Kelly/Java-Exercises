/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable names?
       Mark out of 5: 5
       Comment: All values given functional names.
   2. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5: 5
       Comment: All Variables in lowerCamelCase.
   3. Did I indent the code appropriately?
       Mark out of 5: 5
       Comment: All code indented where necessary.
   4. Did I implement a while loop or do-while loop as required?
       Mark out of 10: 10
       Comment: I used a do-while loop.
      Total Mark out of  25 (Add all the previous marks): 25
*/

import java.util.Scanner;

public class IncrementalStatistics {

    public static void main(String[] args) {

        System.out.println("This program computes the average and variance of all numbers entered.");
        System.out.print("Enter a number (or type 'exit'): ");
        Scanner input = new Scanner(System.in);

        double average = 0;
        int count = 1;
        double variance = 0;
        boolean exit = false;

        do {
            if (!input.hasNext("exit") && !input.hasNext("quit")) {
                try {
                    String stringNumber = input.next();
                    double newNumberIn = Double.parseDouble(stringNumber);
                    double lastAverage = average;
                    average = lastAverage + ((newNumberIn - lastAverage) / count);
                    if (newNumberIn != 1) {
                        variance = (((count - 1) * variance) + (newNumberIn - lastAverage) * (newNumberIn - average)) / count;
                    }
                    System.out.printf("So far the average is %.1f and the variance is %.1f \n", average, variance);
                    System.out.print("Enter a number (or type 'exit'): ");
                    count++;
                } catch (NumberFormatException exception) {
                    System.out.println("Error:  You must enter a real number (e.g. 12.5)");
                    System.out.print("Enter a number (or type 'exit'): ");
                }
            } else {
                    exit = true;
                    System.out.println("Goodbye");
                }
        } while (!exit);
        input.close();
    }
}