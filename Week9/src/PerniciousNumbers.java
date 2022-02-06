/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful and properly formatted variable names?
       Mark out of 5: 5
       Comment: Yes.
    2. Is my code easy to follow/understand?
       Mark out of 5: 5
       Comment: Yes.
   3. Did I use the functions as required?
       Mark out of 10: 10
       Comment: Yes.
       Total Mark out of  20 (Add all the previous marks): 20
*/

import java.util.Scanner;
public class PerniciousNumbers {
    public static void main(String[] args) {
        System.out.print("Enter the maximum number you want to consider: ");
        Scanner input = new Scanner(System.in);
        int max = input.nextInt();
        for (int count=1; count<=max; count++)
        {
            if (isPernicious(count))
            {
                System.out.println("" + count
                        + " is a pernicious number as it contains "
                        + countBinaryOnes(count)
                        + " ones in it's binary representation ("
                        + getBinaryString(count) + ")");
            }
        }
    }
    public static String getBinaryString(int number)
    {
        boolean negative;
        negative=number<0;
        if (!negative) {
            return Integer.toBinaryString(number);
        }
        else
        {
            return "-"+Integer.toBinaryString(Math.abs(number));
        }
    }
    public static boolean isPernicious(int number)
    {
        return isPrime(countBinaryOnes(number));
    }
    public static int countBinaryOnes(int number)
    {
        return Integer.bitCount(Math.abs(number));
    }
    public static boolean isPrime(double number)
    {
        boolean is = true;
        if (number<=1)
        {
            is = false;
        }
        else
        {
            for (int i = 2; i <= Math.sqrt(number); ++i)
            {
                if (number % i == 0)
                {
                    is = false;
                    break;
                }
            }
        }
        return is;
    }
}
