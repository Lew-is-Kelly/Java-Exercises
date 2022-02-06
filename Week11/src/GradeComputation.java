import java.util.Scanner;

public class GradeComputation {
    public static final String[] MODULE_CODES   = {"CSU11001",
            "CSU11010",
            "CSU11013",
            "CSU11021",
            "CSU11022",
            "CSU11026",
            "CSU11031",
            "CSU11081",
            "CSU12002",
            "STU11002"};

    public static final int[] MODULE_CREDITS = {5, 10, 5, 5, 5, 10, 5, 5, 5, 5};

    public static final int SPECIFIED_MARK = 40;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String error="Error - Enter a number between 0.0 and 100.0 or quit.";
        double[] marks = new double[10];
        boolean quit=false;
        int index=0;
        System.out.println("Welcome to the first year grade assessor.");
        while (!quit)
        {
            if (index != 10)
            {
                System.out.print("Enter the student mark for " + MODULE_CODES[index] + " (or enter quit): ");
                Scanner inputNextLine = new Scanner(input.nextLine());
                if (!inputNextLine.hasNext("quit"))
                {
                    if(inputNextLine.hasNextDouble())
                    {
                        double in = inputNextLine.nextDouble();
                        if (in >= 0.0 && in <= 100.0)
                        {
                            marks[index] = in;
                            index++;
                        }
                        else
                        {
                            System.out.println(error);
                        }
                    }
                    else
                    {
                        System.out.println(error);
                    }
                }
                else
                {
                    quit=true;
                }
            }
            else
            {
                System.out.println("Result = "
                        + determineOverallGrade(marks)
                        + " with an overall mark of "
                        + Math.round(weightedAverageMark(marks)) + "%.");
                int credits=creditsBelowSpecifiedMark(marks, SPECIFIED_MARK);
                if(determineOverallGrade(marks).equals("FAIL"))
                {
                    System.out.print("   "+ credits +" credits were failed.\n\n");
                }
                else
                {
                    System.out.print("\n");
                }
                index=0;
            }
        }
    }
    public static int creditsBelowSpecifiedMark(double[] marks, int specifiedMinimumMark)
    {
        int creditsFailed=0;
        for(int i=0; i<marks.length; i++)
        {
            if(Math.round(marks[i])<specifiedMinimumMark)
            {
                creditsFailed+=MODULE_CREDITS[i];
            }
        }
        return creditsFailed;
    }
    public static double weightedAverageMark(double[] marks)
    {
        if (marks!=null)
        {
            double grade=0;
            for(int i=0; i<10; i++)
            {
                grade+=(MODULE_CREDITS[i]*marks[i]);
            }
            grade/=60;
            return grade;
        }
        return 0.0;
    }
    public static String determineOverallGrade(double[] marks)
    {
        if (marks!=null)
        {
            double grade = Math.round(weightedAverageMark(marks));
            for(int i=0; i<marks.length; i++)
            {
                if(marks[i]<35)
                {
                    return "FAIL";
                }
            }
            if(creditsBelowSpecifiedMark(marks, SPECIFIED_MARK)>10)
            {
                return "FAIL";
            }
            else
            {
                if (grade >= 70)
                {
                    return "I";
                }
                else if (grade >= 60)
                {
                    return "II.1";
                }
                else if (grade >= 50)
                {
                    return "II.2";
                }
                else if (grade >= 40)
                {
                    return "III";
                }
                else
                {
                    return "FAIL";
                }
            }
        }
        else
        {
            return "Error - null array";
        }
    }
}
