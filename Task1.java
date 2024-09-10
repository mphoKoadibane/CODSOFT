import java.util.Random;
import java.util.Scanner;

/**
 * Write a description of class Task1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Task1
{
    
  
    // instance variables - replace the example below with your ownpublic class RandomNumber
    public static void main (String [] args)
    {
        
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int userGuess=0;
        
        String playAgain;
      
        do{
            int randomnumber = (int) (Math.random() * 100)+1;
            int maxAttempts =5;
            int attempts =0;
            
            System.out.println( " Random number between 1 and 100:"+ randomnumber);
            
        //loop until the user guesses correctly
         while(userGuess!= randomnumber)
         {
             // prompt user to enter their guess
             System.out.print("Enter your guess:");
             userGuess = scanner.nextInt();
             if(userGuess < randomnumber)
             { 
                 System.out.println("Too low! Try again"); 
             } 
             else if (userGuess> randomnumber)
             {
                 System.out.println("Too high! Try again.");
             }
             else
             {
                 System.out.println("Congratulations! You guessed the correct number:"+ randomnumber);
                }
            // check if the user has reached the maximum number of attempts
             if(attempts == maxAttempts)
             {
                 System.out.println("Sorry, you've reached the maximum number of attempts.The correct number was:"+randomnumber);
                }
            }
        //Ask if the user wants to play again
        System.out.print("Do you want to play another round? (yes/no)");
        playAgain = scanner.next(); //Read the user's response
    
        
       }
        while(playAgain.equalsIgnoreCase("yes"));
    
    System.out.println("Thank you for playing");
    scanner.close();
  } 
} 
