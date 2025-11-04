import java.util.Arrays;
import java.util.Scanner;

public class athletes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[][] sports = new String[4][5];
    String[] sportNames = { "Badminton", "Table_Tennis", "Basketball", "Volleyball" };
    for (String sport : sportNames) {
      System.out.println("Enter names of 5 athletes for " + sport + ":");
      for (int i = 0; i < 5; i++) {
        System.out.print("Athlete " + (i + 1) + ": ");
        String name = sc.nextLine();
        switch (sport) {
          case "Badminton":
            sports[0][i] = name;
            break;
          case "Table_Tennis":
            sports[1][i] = name;
            break;
          case "Basketball":
            sports[2][i] = name;
            break;
          case "Volleyball":
            sports[3][i] = name;
            break;
        }
      }

      switch (sport) {
        case "Badminton":
          Arrays.sort(sports[0]);
          break;
        case "Table_Tennis":
          Arrays.sort(sports[1]);
          break;
        case "Basketball":
          Arrays.sort(sports[2]);
          break;
        case "Volleyball":
          Arrays.sort(sports[3]);
          break;
      }

      System.out.println();

    }
    for (String sport : sportNames) {
      System.out.println("\nAthletes in " + sport + ":");
      for (int i = 0; i < 5; i++) {
        switch (sport) {
          case "Badminton":
            System.out.println("Athlete " + (i + 1) + ": " + sports[0][i]);
            break;
          case "Table_Tennis":
            System.out.println("Athlete " + (i + 1) + ": " + sports[1][i]);
            break;
          case "Basketball":
            System.out.println("Athlete " + (i + 1) + ": " + sports[2][i]);
            break;
          case "Volleyball":
            System.out.println("Athlete " + (i + 1) + ": " + sports[3][i]);
            break;
        }
      }
    }
  }
}
