import java.util.Scanner;

public class exercises {

  public static void main(String[] args) {
    System.out.println("--- Exercise 1: Multiples of 5 up to 50 ---");
    for (int i = 5; i <= 50; i = i + 5) {
      System.out.print(i + " ");
    }
    System.out.println();
    System.out.println("--- Exercise 2: Countdown from 10 to 1 ---");
    for (int j = 10; j >= 1; j--) {
      System.out.print(j + " ");
    }
    System.out.println();
    System.out.println("--- Exercise 3: Squares of numbers from 1 to 10 ---");
    for (int k = 1; k <= 10; k++) {
      int square = k * k;
      System.out.print(square + " ");
    }
    System.out.println();
    System.out.println("--- Exercise 4: Calculate Factorial (n!) ---");

    Scanner sc = new Scanner(System.in);
    int n;

    do {
      System.out.print("Enter a positive integer to calculate its factorial: ");

      if (sc.hasNextInt()) {
        n = sc.nextInt();
        if (n >= 0) {
          break;
        } else {
          System.out.println("Factorial is defined for non-negative integers. Try again.");
        }
      } else {
        System.out.println("Invalid input. Please enter an integer.");
        sc.next();
        n = -1;
      }
    } while (true);

    long factorial = 1;

    if (n == 0) {

      factorial = 1;
    } else {

      for (int i = 1; i <= n; i++) {
        factorial = factorial * i;
      }
    }

    System.out.println(n + "! = " + factorial);

    sc.close();
  }
}