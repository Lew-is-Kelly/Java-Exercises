/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful and properly formatted variable names?
       Mark out of 5: 5
       Comment: All variables named after their use.
    2. Did I indent the code appropriately?
       Mark out of 5: 5
       Comment: All code indented where needed.
   3. Did I make use of the functions appropriately within main and the other functions?
       Mark out of 10: 10
       Comment: Functions used where needed.
       Total Mark out of  20 (Add all the previous marks): 20
*/
import java.util.Scanner;
public class ThreeNumbers
{
    public static void main(String[] args)
    {
        String ask = ("Please enter your three integers separated by spaces (or enter 'quit'):  ");
        boolean leave = false;
        Scanner input = new Scanner (System.in);
        System.out.print(ask);
        do
        {
            if(!input.hasNext("quit") && !input.hasNext("exit"))
            {
                input.useDelimiter("\\p{javaWhitespace}+");
                int numOne = input.nextInt();
                int numTwo = input.nextInt();
                int numThree = input.nextInt();
                System.out.println(getFormattedOutputString(medianOf(numOne, numTwo, numThree),
                        countOfNumbersGreaterThanTheAverage(numOne, numTwo, numThree)));
                System.out.print(ask);
            }
            else
            {
                leave = true;
            }
        } while(!leave);
    }
    public static int medianOf(int numOne,int numTwo,int numThree)
    {
        int median;
        if (numOne==numTwo || numOne==numThree || numTwo==numThree)
        {
            if (numOne==numTwo)
            {
                median = numOne;
            }
            else if (numTwo==numThree)
            {
                median = numTwo;
            }
            else
            {
                median = numOne;
            }
        }
        else
        {
            if (numOne < numTwo && numOne > numThree || numOne < numThree && numOne > numTwo) {
                median = numOne;
            } else if (numTwo < numOne && numTwo > numThree || numTwo < numThree && numTwo > numOne) {
                median = numTwo;
            } else {
                median = numThree;
            }
        }
        return median;
    }
    public static double averageOf(double numOne,double numTwo,double numThree)
    {
        return (numOne + numTwo + numThree)/3;
    }
    public static int countOfNumbersGreaterThanTheAverage(int numOne, int numTwo, int numThree)
    {
        double average = averageOf(numOne,numTwo,numThree);
        if ((numOne>average && numTwo>average) || (numTwo>average && numThree>average) || (numThree>average && numOne>average))
        {
            if (numOne>average && numTwo>average && numThree>average)
            {
                return 3;
            }
            else
            {
                return 2;
            }
        }
        else if (numOne>average || numTwo>average || numThree>average)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static String getFormattedOutputString(int medianOf, int countOfNumbersGreaterThanTheAverage)
    {
        return ("The median of your numbers is " + medianOf +
                ", and " + countOfNumbersGreaterThanTheAverage +
                " of them " + (countOfNumbersGreaterThanTheAverage>1?"are":"is") + " greater than their average.");
    }
}
