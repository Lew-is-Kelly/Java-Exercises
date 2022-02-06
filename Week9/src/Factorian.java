import java.util.Scanner;
public class Factorian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean end = false;
        while (!end)
        {
            System.out.print("Please enter number or type 'quit' to quit: ");
            if (!input.hasNext("quit") && !input.hasNext("exit"))
            {
                String in = input.next();
                int num = Integer.parseInt(in);
                System.out.println("" + num + " is " + (isFactorian(num) ? "" : "not ") + "a factorial number.");
            }
            else
            {
                end = true;
            }
        }
    }
    public static double computeFactorial(int num)
    {
        double fact = 1;
        if (num!=0)
        {
            for (int i = 1; i <= num; i++) {
                fact*=i;
            }
        }
        else
        {
            fact = 0;
        }
        return fact;
    }
    public static boolean isFactorian(int num)
    {
        boolean is;
        int totalFact = 0;
        int digit;
        int cpy = num;

        do
        {
            digit = cpy%10;
            cpy /= 10;
            totalFact += computeFactorial(digit);
        } while (digit!=0);

        is = num == totalFact;

        return is;
    }
}
