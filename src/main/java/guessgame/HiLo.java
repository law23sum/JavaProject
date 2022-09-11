package guessgame;

import java.util.Scanner;                                                                                               //  Scanner class

public class HiLo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);                                                                          //  Scanner's object
        String playAgain;
        do {                                                                                                            //  least once run
            int attempt = 0, guess = 0;                                                                                 //  reset parameter values
            int theNumber = getRandomNumber(-100,100);                                                                  //  number generator: random() -> 0.0 - 1.0 digit -> on number line, shift left to -100
          //System.out.println(theNumber);                                                                              //  number generator debug
            while (guess != theNumber) {                                                                                //  till true
                attempt = attempt + 1;                                                                                  //  counter
                System.out.print("Guess a digit between -100 & 100: ");                                                 //  System class: System's object: System.out, System.in
                guess = scan.nextInt();                                                                                 //  user's input
                System.out.println("You guessed the digit: " + guess);
                if (guess > theNumber)                                                                                  //  user's input validate
                    System.out.println("Too high, try again. ");
                else if (guess < theNumber)
                    System.out.println("Too low, try again. ");
                else
                    System.out.println("Correct! \n" + "Total Guesses: " + attempt);
            }
            System.out.print("Another round? ");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you. Come Again!");
        scan.close();                                                                                                   //  close input resource
    }

    private static int getRandomNumber(int min, int max) {
        return (int) (Math.random() * (max-min+1)) + min;
    }
}