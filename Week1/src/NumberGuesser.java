import java.util.Random;
import java.util.Scanner;
public class NumberGuesser
{
    public static int GUESSES_ALLOWED = 5;
    public static int MAX_NUMBER = 20;
    public static int UNKNOWN_NUMBER = -1;

    public static void main(String[] args)
    {

        Random generator = new Random();
        int numberToGuess = generator.nextInt(MAX_NUMBER+1);

        int numberGuessed = UNKNOWN_NUMBER;
        int count = 0;
        for(count = 0; (count < GUESSES_ALLOWED) && (numberGuessed != numberToGuess); count++)
        {
            Scanner input = new Scanner( System.in );
            System.out.print("Guess the number (between 0 and " + MAX_NUMBER + ")");
            numberGuessed = input.nextInt();
            if (numberGuessed < numberToGuess)
            {
                System.out.println("" + numberGuessed + " is too low.");
            }
            else if (numberGuessed > numberToGuess)
            {
                System.out.println("" + numberGuessed + " is too high.");
            }
        }
        if (numberGuessed == numberToGuess)
        {
            System.out.println("Ding Ding Ding! We have a winner! You got it in " + count + " guesses!");
        }
        else System.out.println("Better luck next time, bitch baby. The number was " + numberToGuess + ".");

    }
}
