import java.util.Scanner;

public class arrayAverageScore06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of Students: ");
    int numStudents = sc.nextInt();
    int[] score = new int[numStudents];
    int numStudentsFail = 0, numStudentsPass = 0;
    double totalPass = 0, averagePass;
    double totalfail = 0, averageFail;
    for (int i = 0; i < score.length; i++) {
      System.out.print("Enter the final score " + (i) + ": ");
      score[i] = sc.nextInt();
    }

    for (int i = 0; i < score.length; i++) {
      if (score[i] > 70) {
        totalPass += score[i];
        numStudentsPass++;
      } else {
        totalfail += score[i];
        numStudentsFail++;
      }
    }
    averagePass = totalPass / numStudentsPass;
    averageFail = totalfail / numStudentsFail;
    System.out.println("The average score of students who passed is: " + averagePass);
    System.out.println("The average score of students who failed is: " + averageFail);

  }
}
