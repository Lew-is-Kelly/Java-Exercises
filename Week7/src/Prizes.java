/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable names?
       Mark out of 5: 5
       Comment: Names correspond to their function.
   2. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5: 5
       Comment: All variables in lowerCamelCase.
   3. Did I indent the code appropriately?
       Mark out of 5: 5
       Comment: All code indented where appropriate.
   4. Did I implement a switch statement as required?
       Mark out of 10: 10
       Comment: Switch statement used to determine prizes.
       Total Mark out of  25 (Add all the previous marks): 25
*/
import java.util.Scanner;
public class Prizes
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("This program tells competition participants what prize they have won.");
        boolean end = false;
        do
        {
            System.out.print("Enter your place number (or type 'exit'): ");
            if (!input.hasNext("exit"))
            {
                String stringPlace = input.next();
                int place = Integer.parseInt(stringPlace);
                String gets = "0";
                if (place > 0 && place < 11)
                {
                    switch (place)
                    {
                        case 1:
                            stringPlace = "1st";
                            gets = "two theatre tickets + drinks during the interval + dinner before the show.";
                            break;
                        case 2:
                            stringPlace = "2nd";
                            gets = gets + "two theatre tickets + drinks during the interval.";
                            break;
                        case 3:
                            stringPlace = "3rd";
                            gets = "two theatre tickets.";
                            break;
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            stringPlace = stringPlace + "th";
                            gets = "a 5 Euro book token.";
                            break;
                        case 4:
                        case 5:
                            stringPlace = stringPlace + "th";
                            gets = "a 10 Euro book token.";
                            break;
                        default:
                            break;
                    }
                    System.out.println("You came in " + stringPlace + " place and hence won " + gets);
                }
                else
                {
                    System.out.println("Sorry.  You did not win a prize.");
                }
            }
            else
            {
                end = true;
            }
        } while (!end);
    }
}
