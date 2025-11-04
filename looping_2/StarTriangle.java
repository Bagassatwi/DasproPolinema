import java.util.Scanner;

public class StarTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of N: ");
    int N = sc.nextInt();
    if (N < 5) {
      System.out.println("N should be at least 5.");
      sc.close();
      return;
    }

    for (int i = N; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    sc.close();
  }
}
