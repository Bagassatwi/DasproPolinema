import java.util.Scanner;

public class DisplayTwo06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input a number: ");
    int numInput = input.nextInt();
    for (int i = 2; i <= numInput; i += 2) {
      System.out.print(i + " ");
    }
  }
}
