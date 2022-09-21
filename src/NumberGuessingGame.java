import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int randNum = rand.nextInt(100)+1;
        //System.out.println("Random number is "+ randNum);

        while(true){
            System.out.println("Enter yor Guess(1-100): ");

            int playerGuess = sc.nextInt();

            if(playerGuess==randNum){
                System.out.println("Correct you win!");
                break;
            } else if (randNum>playerGuess) {
                System.out.println("Nope The number is higher, Guess Again! ");
            }else {
                System.out.println("Nope The number is lower , Guess Again! ");
            }
        }
    }
}
