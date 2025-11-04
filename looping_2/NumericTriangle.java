import java.util.Scanner;

public class NumericTriangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of N: ");
    int N = sc.nextInt();
    if (N < 3) {
      System.out.println("N should be at least 3.");
      sc.close();
      return;
    }
    for (int i = 1; i <= N; i++) {
      for (int k = N; k > i; k--) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    }

    sc.close();
  }

}
