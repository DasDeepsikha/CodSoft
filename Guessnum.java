// Number guessing game

import java.util.Scanner;
import java.util.Random;

public class Guessnum
{
    public static void main(String[] args) 
    {
        generateRandom();
    }

    public static void generateRandom()
    {
        Random ran = new Random();

        // generating a random number betwwen 0 - 100
        int ran_num = ran.nextInt(101);

        // calling guess method
        guess(ran_num);
    }

    private static void guess(int ran_num) 
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Number Guessing game");
        System.out.println("Guess a number between 0-100: ");
        int guess = in.nextInt();
        System.out.println("");

        // validation of number
        while ( guess<0 || guess>100 )
        {
            System.out.println("The number you have guessed is out of bound.");
            System.out.println("Guess a number between 0 - 100: ");
            guess = in.nextInt();
            System.out.println("");
        }
            int attempt = 0;
            while (guess != ran_num)
            {
                attempt++;
                System.out.println("Wrong guess!");
                System.out.println("Guess again: ");
                guess = in.nextInt();
                System.out.println("");

                
                while ( guess<0 || guess>100 )
                    {
                        System.out.println("The number you have guessed is out of bound.");
                        System.out.println("Guess a number between 0 - 100: ");
                        guess = in.nextInt();
                        System.out.println("");
                    }
                    while(attempt == 5)
                    {
                        System.out.println("Sorry ... You have used all your attempts.");
                        System.out.println("The number was: "+ran_num);

                        System.out.println("Do you want to play again?");
                        System.out.println("Press '1' to play again and '0' to exit");
                        int option = in.nextInt();

                            if(option == 1){
                                generateRandom();
                            }
                            else{
                                System.out.println("Thanks for playing with us.");
                                return;
                            }
                        return;
                    }

            }
        
            

        //Game won
        System.out.println("Correct answer."); 
        System.out.println("Congratulations....You won!");
        System.out.println("Number of attempts:"+attempt);
        System.out.println("");

        // Want to play again
        System.out.println("Press 1 to play again.");
        System.out.println("Press 0 to exit.");
        int choice = in.nextInt();

        if(choice == 1)
        {
            generateRandom();
        }
        else
        {
            return;
        }
    }
}
