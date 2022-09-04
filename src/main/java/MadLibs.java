import java.util.Scanner;                                                                                               //  Scanner class

public class MadLibs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain;
        do {
            String color, pastTenseVerb, adjective, noun;
            System.out.println("Welcome to MadLibs! \nFill in the empty blanks! \n");
            System.out.println(" The _____ dragon __________ at the _________");
            System.out.println("     color        past-tense        adjective\n");
            System.out.println(" knight, who rode in on a sturdy, giant ____.");
            System.out.println("                                        noun");
            System.out.print("Choose a color: ");
            color = scan.next();
            System.out.print("Choose a past-tense verb: ");
            pastTenseVerb = scan.next();
            System.out.print("Choose an adjective: ");
            adjective = scan.next();
            System.out.print("Choose a noun: ");
            noun = scan.next();
            System.out.println("\n\tThe " + color + " dragon " + pastTenseVerb + " at the " + adjective);
            System.out.println("\tknight, who rode in on a sturdy, giant " + noun + ".\n");
            System.out.print("Another round? ");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you. Come Again!");
        scan.close();
    }
}
