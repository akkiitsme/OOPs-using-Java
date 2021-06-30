import java.util.Random;
import java.util.Scanner;

public class game {
    // 0 == rock
    // 1 == paper
    // 2 == scissors
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int userinput = sc.nextInt();

            Random random = new Random();
            int computerinput = random.nextInt(3);

            if (userinput == 0) {
                System.out.println("Your choice: Rock");
            }
            else if (userinput == 1) {
                System.out.println("Your choice: Paper");
            }
            else if (userinput == 2){
                System.out.println("Your choice: Scissors");
            }

            if (computerinput == 0) {
                System.out.println("Computer choice: Rock");
            }
            else if (computerinput == 1) {
                System.out.println("Computer choice: Paper");
            }
            else if (computerinput == 2) {
                System.out.println("Computer choice: Scissors");
            }

            if (userinput == computerinput) {
                System.out.println("Draw!");
            } else if (userinput == 1 && computerinput == 0 || userinput == 0 && computerinput == 2 || userinput == 2 && computerinput == 1) {
                System.out.println("You win!");
            } else if (userinput == 0 && computerinput == 1 || userinput == 2 && computerinput == 0 || userinput == 1 && computerinput == 2) {
                System.out.println("Computer wins!");
            }
            else {
                System.out.println("Invalid input!");
            }

    }
}
