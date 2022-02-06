import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year ");
        int year = input.nextInt();
        input.close();

        boolean isLeapYear = false;
        if (year % 400 == 0) {
            isLeapYear = true;
        }
        else {
            if (year % 100 != 0) {
                if (year % 4 == 0) {
                    isLeapYear = true;
                }
            }
        }
        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
