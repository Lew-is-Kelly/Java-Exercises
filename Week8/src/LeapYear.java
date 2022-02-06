import java.util.Scanner;
public class LeapYear {
    public static final int MONTHS_IN_A_YEAR = 12;
    public static boolean isLeapYear (int year){
        boolean isLeap;
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    isLeap = true;
                }
                else
                    {
                        isLeap = false;
                    }
            }
            else
                {
                    isLeap = true;
                }
            }
        else
            {
                isLeap = false;
            }
        return isLeap;
    }

    public static int daysInMonth (int month, int year)
    {
        int days;
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                if (isLeapYear(year))
                {
                    days = 29;
                }
                else
                {
                    days = 28;
                }
                break;
            default:
                days = 0;
        }
        return days;
    }
    public static boolean validDate (int day, int month, int year)
    {
        boolean isDate = true;

        if (day > daysInMonth(month, year) || day <= 0)
        {
            isDate = false;
        }

        if (month > MONTHS_IN_A_YEAR || month <= 0)
        {
            isDate = false;
        }

        return isDate;
    }
    public static void main(String []args)
    {
        System.out.print("Enter a date in the format (DD/MM/YYYY): ");
        Scanner input = new Scanner (System.in);
        int day, month, year;
        String date;
        String[] dateIn;
        date = input.nextLine();
        dateIn = date.split("/");
        day = Integer.parseInt(dateIn[0]);
        month = Integer.parseInt(dateIn[1]);
        year = Integer.parseInt(dateIn[2]);

        System.out.println(validDate(day, month, year) ? "Date is valid." : "Date is invalid");
    }
}
