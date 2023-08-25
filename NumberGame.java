import java.util.*;
import java.util.Scanner;

public class NumberGame{

    static int score = 0;

    public static void numberGame(){
        Scanner sc = new Scanner(System.in);
        int answer = 1 + (int)(100 * Math.random());
        //System.out.println("The number is : "+answer);
        int i = 0,guess;
        System.out.println("Guess a number "+"between 1 and 100 "+"in a maximum of 5 trials");
       
        int score1[] = {50,40,30,20,10};

        //The maximum trials for a player to guess a number is 5
        final int k = 5;

        while(i<k){
            System.out.println("Trial number "+(i+1));
            //System.out.println("Guess a number");
            
            guess = sc.nextInt();

            if(guess == answer){
                System.out.println("You have guessed "+"it correct");
                score +=score1[i];
                break;
            }

            else if(answer < guess && i != k-1){
                System.out.println("The number is smaller than "+guess);
            }


            else if(answer > guess && i != k-1){
                System.out.println("The number is greater than "+guess);
            }
        }
        if(i == k){
            System.out.println("All five trials have been exhausted");
            System.out.println("The number is "+answer);
        }
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        //First time when you want to play the game no need to enter anything
        numberGame();
        while(true){
            System.out.println("Enter 1 to play again\n"+"Enter 2 to exit");
            int ch = in.nextInt();
            if(ch == 1){
                numberGame();
            }else{
                System.out.println("Your total score : "+score);
                break;
            }
        }
    }
}
