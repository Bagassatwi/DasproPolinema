import java.util.Scanner;

public class SquareNumericHollow {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of the square (N): ");
    int N = sc.nextInt();
    if (N < 3) {
      System.out.println("N should be at least 3.");
      sc.close();
      return;
    }

    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        if (i == 1 || i == N || j == 1 || j == N) {
          System.out.print(N + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }

    sc.close();
  }
}
