import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {

        System.out.print("Enter a list of numbers: ");
        Scanner input = new Scanner(System.in );
        Scanner inputLine = new Scanner(input.nextLine());
        input.close();

        int min = inputLine.nextInt();
        int max = min;
        while (inputLine.hasNextInt()) {
            int nextInt = inputLine.nextInt();

            if (nextInt < min)
              min = nextInt;

            if (nextInt > max)
                max = nextInt;
        }
        inputLine.close();
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
