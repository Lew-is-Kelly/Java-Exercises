import java.util.Arrays;
import java.util.Scanner;

public class Median {
    public static final int TOTAL_NUM_OF_VALUES = 3;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the median & rolling average system.");
        boolean quit=false;
        double[] userNum = {};
        while(!quit)
        {
            System.out.print("Enter a number (or enter quit): ");
            Scanner inputNextLine = new Scanner(input.nextLine());
            if (!inputNextLine.hasNext("quit"))
            {
                if (inputNextLine.hasNextDouble())
                {
                    double[] temp = new double[userNum.length + 1];
                    System.arraycopy(userNum, 0, temp, 0, userNum.length);
                    temp[temp.length - 1] = inputNextLine.nextDouble();
                    userNum = temp;
                    System.out.println("The median of " + convertToString(userNum) + " is "
                            + String.format("%.1f", computeMedian(userNum))
                            + " and the rolling average of the last 3 values is "
                            + String.format("%.1f",computeRollingAverage(userNum, TOTAL_NUM_OF_VALUES))
                            + ".");
                }
                else {
                    System.out.println("Error - Enter any real number or quit.");
                }
            }
            else {
                quit = true;
            }
            inputNextLine.close();
        }
        input.close();
    }
    public static double computeMedian(double[] userNum)
    {
        if (userNum!=null && userNum.length!=0)
        {
            double median;
            double[] sorted = createSortedArray(userNum);
            if (sorted.length % 2 == 1) {
                median = sorted[((sorted.length + 1) / 2) - 1];
            } else {
                median = (sorted[(sorted.length / 2) - 1] + sorted[sorted.length / 2]) / 2;
            }
            return median;
        }
        else
        {
            return 0;
        }
    }
    public static double[] createSortedArray(double[] userNum)
    {
        if(userNum!=null)
        {
            double[] sorted = userNum.clone();
            Arrays.sort(sorted);
            return sorted;
        }
        else
        {
            return null;
        }
    }
    public static double computeRollingAverage(double[] userNum, int totalNumOfValues)
    {
        if (userNum!=null && userNum.length!=0)
        {
            double rolling = 0;
            int starting = userNum.length < totalNumOfValues ? 0 : userNum.length - totalNumOfValues;
            if(totalNumOfValues!=0)
            {
                for (int i = starting; i < userNum.length; i++)
                {
                    rolling = rolling + userNum[i];
                }
                rolling = rolling / (userNum.length < totalNumOfValues ? userNum.length : totalNumOfValues);
                return rolling;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            return 0;
        }
    }
    public static String convertToString(double[] userNum)
    {
        if (userNum!=null && userNum.length!=0)
        {
            String list = "{ ";
            String[] listOfNumbers = new String[userNum.length];
            for (int c = 0; c < userNum.length; c++) {
                listOfNumbers[c] = String.format("%.1f", userNum[c]);
            }
            for (int i = 0; i < listOfNumbers.length; i++) {
                list = list + listOfNumbers[i] + (i == listOfNumbers.length - 1 ? " }" : ", ");
            }
            return list;
        }
        else
        {
            return "{ }";
        }
    }
}
