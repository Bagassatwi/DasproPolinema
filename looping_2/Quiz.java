import java.util.Scanner;
import java.util.Random;

public class Quiz {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    char menu = 'y';
    do {
      int number = rand.nextInt(10) + 1;
      boolean success = false;

      do {
        System.out.print("Guess the number (1-10): ");
        int answer = input.nextInt();
        input.nextLine();

        if (answer < number) {
          System.out.println("Your guess is too small.");
        } else if (answer > number) {
          System.out.println("Your guess is too large.");
        }

        success = (answer == number);

      } while (!success);

      System.out.println("Congratulations! You guessed the number.");
      System.out.print("Do you want to repeat the game (Y/N)? ");
      menu = input.next().charAt(0);
      input.nextLine();

    } while (menu == 'Y' || menu == 'y');

    System.out.println("Thank you for playing!");
    input.close();
  }
}