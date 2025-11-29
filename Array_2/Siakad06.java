import java.util.Scanner;

public class Siakad06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of students: ");
    int numStudents = sc.nextInt();
    System.out.print("Enter number of courses: ");
    int numCourses = sc.nextInt();
    int[][] score = new int[numStudents][numCourses];
    for (int i = 0; i < score.length; i++) {
      double sumForEachStudent = 0;
      System.out.println("Entering scores for student #" + (i + 1));
      for (int j = 0; j < score[i].length; j++) {
        System.out.print("Course #" + (j + 1) + " score: ");
        score[i][j] = sc.nextInt();
        sumForEachStudent += score[i][j];
      }
      System.out.println("Average Score: " + (sumForEachStudent / score[i].length));
    }

    for (int j = 0; j < score[0].length; j++) {
      double sumForEachCourse = 0;
      for (int i = 0; i < score.length; i++) {
        sumForEachCourse += score[i][j];
      }
      System.out.println("Average Score for Course #" + (j + 1) + ": " + (sumForEachCourse / score.length));
    }
  }
}
