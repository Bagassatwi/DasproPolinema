package Array_2;

import java.util.Scanner;

public class CinemaWithScanner06 {
  public static void main(String[] args) {
    String[][] audience = new String[4][2];
    Scanner scanner = new Scanner(System.in);
    String name;
    int row = 0;
    int col = 0;

    while (true) {
      System.out.print("Enter a name: ");
      name = scanner.next();
      System.out.print("Enter row number: ");
      row = scanner.nextInt();
      System.out.print("Enter column number: ");
      col = scanner.nextInt();
      while (audience[row - 1][col - 1] != null) {
        System.out.print("Seat already taken! Please choose another seat.\n");
        System.out.print("Enter row number: ");
        row = scanner.nextInt();
        System.out.print("Enter column number: ");
        col = scanner.nextInt();
      }
      if (audience[row - 1][col - 1] != null) {
        System.out.println("Seat already taken! Please choose another seat.");
        continue;
      }
      audience[row - 1][col - 1] = name;
      System.out.print("Are there any other audiences to be added (Y/N): ");
      String next = scanner.next();
      if (next.equalsIgnoreCase("n")) {
        break;
      }
    }
    for (int i = 0; i < audience.length; i++) {
      for (int j = 0; j < audience[i].length; j++) {
        if (audience[i][j] == null) {
          audience[i][j] = "***";
        }
      }
    }

    System.out.println("All audiences by row: ");
    for (int i = 0; i < audience.length; i++) {
      System.out.println("Audience in row " + (i + 1) + ": " + String.join(", ", audience[i]));
    }
  }
}
