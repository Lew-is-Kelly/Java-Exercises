/*  SELF ASSESSMENT of whether my code is easy to understand.
   1. Did I use easy-to-understand meaningful variable names?
       Mark out of 10: 10
       Comment: Involve terms that are asked to the user.
   2. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5: 5
       Comment: Used lowerCamelCase.
   3. Did I indent the code appropriately?
       Mark out of 15: 15
       Comment: Code is indented for easier understanding.
      Total Mark out of  30 (Add all the previous marks): 30
*/
import java.util.Scanner;
public class PlantClassifier
{
    public static void main(String[] args)
    {
        System.out.print("Does the plant have cells and tissues which are organised into functional structures (Yes/No)? ");
        Scanner input = new Scanner(System.in);
        String organisedCellsAnswer = input.next();
        boolean organisedCells = organisedCellsAnswer.equalsIgnoreCase("Yes");

        if (organisedCells)
        {
            System.out.print("Does the plant have vascular tissues (Yes/No)? ");
            String vascularTissuesAnswer = input.next();
            boolean vascularTissues = vascularTissuesAnswer.equalsIgnoreCase("Yes");

            if (vascularTissues)
            {
                System.out.print("Is the plant dispersed by seeds (Yes/No)? ");
                String dispersedBySeedsAnswer = input.next();
                boolean dispersedBySeeds = dispersedBySeedsAnswer.equalsIgnoreCase("Yes");

                if (dispersedBySeeds)
                {
                    System.out.print("Are the seeds enclosed (Yes/No)? ");
                    String enclosedSeedsAnswer = input.next();
                    boolean enclosedSeeds = enclosedSeedsAnswer.equalsIgnoreCase("Yes");

                    if (enclosedSeeds)
                    {
                        System.out.println("The plant is an ANGIOSPERM.");
                    }
                    else {
                        System.out.println("The plant is a GYMNOSPERM.");
                    }
                }
                else {
                    System.out.println("The plant is a PTERIDOPHYTE.");
                }
            }
            else {
                System.out.println("The plant is a BRYOPHYTE.");
            }
        }
        else {
            System.out.println("The plant is an ALGAE.");
        }
    }
}