import java.util.Scanner;

public class TheTriangle06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input a number: ");
    int i = 0;
    String s = "";
    int numInput = input.nextInt();
    for (; i < numInput; i++) {
      s += " *";
      System.out.println(s);
    }
  }
}
