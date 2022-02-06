import java.util.Scanner;
public class VertebrateClassification {
    public static void main(String[] args) {
        System.out.print("Is the animal cold blooded? ");
        Scanner input = new Scanner(System.in);
        String isColdBlooded = input.next();
        boolean coldBlooded = isColdBlooded.equalsIgnoreCase("Yes");
        System.out.print("Does the animal have scales or feathers? ");
        String whatSkinType = input.next();
        boolean skinType = whatSkinType.equalsIgnoreCase("Yes");
        System.out.print("Does the animal have fins? ");
        String doesHasFins = input.next();
        boolean hasFins = doesHasFins.equalsIgnoreCase("Yes");
        input.close();

        if(coldBlooded) {
            if(skinType) {
                if(hasFins) {
                    System.out.println("Your animal is a Fish. Blub blub. ");
                }
                else {
                    System.out.println("Your animal is a Reptile. Reptiles are cool. ");
                }
            }
            else {
                System.out.println("Your animal is a Amphibian. Land and water baybeee. ");
            }
        }
        else if(skinType){
            System.out.println("Your animal is a Bird. kaKAW. ");
        }
        else {
            System.out.println("Your animal is a Mammal. Boring, not original and lame. ");
        }
    }
}
//this is bad practice, dont ask questions that you dont need too.