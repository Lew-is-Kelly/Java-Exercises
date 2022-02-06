import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean quit=false;
        int[] frequencies = {0,0,0,0,0,0,0,0,0,0};
        while(!quit)
        {
            System.out.print("Enter a number> ");
            Scanner inputNextLine = new Scanner(input.nextLine());
            int number = inputNextLine.nextInt();
            if (!inputNextLine.hasNext("quit"))
            {
                countDigitFrequencies(number, frequencies);
                printDigitFrequencies(frequencies);
            }
            else
            {
                quit=true;
            }

        }
    }
    public static void printDigitFrequencies(int[] frequencies)
    {
        StringBuilder generator = new StringBuilder();
        if (frequencies != null)
        {
            for (int index = 0; index < frequencies.length; index++)
            {
                generator.append(" ");
                generator.append(String.format("%.1f", frequencies[index]));
                generator.append((index == frequencies.length - 1) ? "" : ",");
            }
        }
        generator.append(" }");
        System.out.println("Digit frequencies: " );
    }
    public static void countDigitFrequencies(int number, int[] frequencies)
    {
        switch(number)
        {
            case 0:
                frequencies[0]+=1;
                break;
            case 1:
                frequencies[1]+=1;
                break;
            case 2:
                frequencies[2]+=1;
                break;
            case 3:
                frequencies[3]+=1;
                break;
            case 4:
                frequencies[4]+=1;
                break;
            case 5:
                frequencies[5]+=1;
                break;
            case 6:
                frequencies[6]+=1;
                break;
            case 7:
                frequencies[7]+=1;
                break;
            case 8:
                frequencies[8]+=1;
                break;
            case 9:
                frequencies[9]+=1;
                break;
            default:
                System.out.print("peepeepoopoo");
        }
    }
}
