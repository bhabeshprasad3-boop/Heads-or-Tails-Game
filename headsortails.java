import java.util.Scanner;
import java.util.Random;
public class headsortails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] choice = {"heads", "tails"};

        System.out.println("Choose what comes heads/tails: ");
        String userchoice = sc.next().toLowerCase();
        int computerchoice = rand.nextInt(2);
        String computerguess = choice[computerchoice];

        if (userchoice.equals(computerguess)) {
            System.out.println("You guessed it right! " + computerguess + " You win");
        } else {
            System.out.println("You guessed it wrong! " + computerguess + " You lose");
        }
    }

}

