import java.util.Scanner;

public class gradeManager {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of student grades: ");
    int numGrades = scanner.nextInt();

    int[] grades = new int[numGrades];

    System.out.println("Enter the grades:");
    for (int i = 0; i < numGrades; i++) {
      System.out.print("Student " + (i + 1) + " Grade: ");
      grades[i] = scanner.nextInt();
    }

    int sum = 0;
    int highest = grades[0];
    int lowest = grades[0];

    for (int i = 0; i < numGrades; i++) {
      sum = sum + grades[i];

      if (grades[i] > highest) {
        highest = grades[i];
      }

      if (grades[i] < lowest) {
        lowest = grades[i];
      }
    }

    double average = (double) sum / numGrades;

    System.out.println("\n--- Grade Report ---");
    System.out.print("All Grades Entered: ");
    for (int i = 0; i < numGrades; i++) {
      System.out.print(grades[i] + (i < numGrades - 1 ? ", " : ""));
    }
    System.out.println();

    System.out.println("Average Grade: " + average);
    System.out.println("Highest Grade: " + highest);
    System.out.println("Lowest Grade: " + lowest);
  }
}