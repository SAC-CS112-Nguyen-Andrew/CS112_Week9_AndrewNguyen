import java.util.Scanner;

public class BasicGame
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int diceRoll;
        diceRoll = 1 + (int)(Math.random()*6);
        String a1 = "I am going to roll a dice. Guess if its odd or even: ";
        
        System.out.print("This is a dice game, " + a1 + diceRoll);
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
        else
        {
            System.out.println("Invalid choice.");
        }
    }
    
}