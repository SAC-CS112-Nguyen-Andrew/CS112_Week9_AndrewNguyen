import java.util.Scanner;

public class Tracking1
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int diceRoll;
        int gamesPlayed = 1;
        diceRoll = 1 + (int)(Math.random()*6);
        String a1 = "I am going to roll a dice. Guess if its odd or even";
        String a2 = "Type the word quit if you want to end the game: ";
        System.out.printf("%s%n%s",a1, a2);
        String userGuess = input.nextLine();
        if (( userGuess.equals ("even")) && diceRoll == 2 || ( userGuess.equals ("even") && diceRoll == 4) || ( userGuess. equals ("even") && diceRoll == 6))  
        {
         System.out.println("You win");
        }
        else if (( userGuess.equals ("odd")) && diceRoll == 1 || ( userGuess.equals ("odd") && diceRoll == 3) || ( userGuess. equals ("odd") && diceRoll == 5))
        {
            System.out.println("You win");
        }
        
        else if (( userGuess.equals ("even")) && diceRoll == 1 || ( userGuess.equals ("even") && diceRoll == 3) || ( userGuess. equals ("even") && diceRoll == 5))
        {
            System.out.println("You lose");
        }
        else if (( userGuess.equals ("odd")) && diceRoll == 2 || ( userGuess.equals ("odd") && diceRoll == 4) || ( userGuess. equals ("odd") && diceRoll == 6))
        {
            System.out.println("You lose");
        }
        while (!userGuess.equals ("quit"))
        {
            {
        System.out.printf("%s%n%s", a1, a2);
        userGuess = input.nextLine();
        gamesPlayed ++;
        
        if (( userGuess.equals ("even")) && diceRoll == 2 || ( userGuess.equals ("even") && diceRoll == 4) || ( userGuess. equals ("even") && diceRoll == 6))  
        {
         System.out.println("You win");
         System.out.printf("You played %d game(s) of dice.%n", gamesPlayed);
        }
        else if (( userGuess.equals ("odd")) && diceRoll == 1 || ( userGuess.equals ("odd") && diceRoll == 3) || ( userGuess. equals ("odd") && diceRoll == 5))
        {
            System.out.println("You win");
            System.out.printf("You played %d game(s) of dice.%n", gamesPlayed);
        }
        
        else if (( userGuess.equals ("even")) && diceRoll == 1 || ( userGuess.equals ("even") && diceRoll == 3) || ( userGuess. equals ("even") && diceRoll == 5))
        {
            System.out.println("You lose");
            System.out.printf("You played %d game(s) of dice.%n", gamesPlayed);
        }
        else if (( userGuess.equals ("odd")) && diceRoll == 2 || ( userGuess.equals ("odd") && diceRoll == 4) || ( userGuess. equals ("odd") && diceRoll == 6))
        {
            System.out.println("You lose");
            System.out.printf("You played %d game(s) of dice.%n", gamesPlayed);
        }
        else
        {
            System.out.println("Invalid choice.");
        }
        }
    }
        System.out.println("You quit the game");
        System.out.printf("You played %d game(s) of dice.%n", gamesPlayed);
        
}
}