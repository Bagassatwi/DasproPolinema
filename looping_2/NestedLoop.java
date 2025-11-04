import java.util.Scanner;

public class NestedLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double[][] temps = new double[5][7];

    for (int i = 0; i < temps.length; i++) {
      System.out.println("City: " + i);
      for (int j = 0; j < temps[0].length; j++) {
        System.out.print("Day " + (j + 1) + ": ");
        temps[i][j] = scanner.nextDouble();
      }
      System.out.println();
    }

    System.out.println("\n--- Temperature Data ---");
    for (int i = 0; i < temps.length; i++) {
      System.out.print("City " + i + ": ");
      for (int j = 0; j < temps[0].length; j++) {
        System.out.print(temps[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("\n--- Data Display (foreach) ---");
    int cityIndex = 0;
    for (double[] cityData : temps) {
      System.out.print("City " + cityIndex + ": ");
      for (double dayTemp : cityData) {
        System.out.print(dayTemp + " ");
      }
      System.out.println();
      cityIndex++;
    }

    System.out.println("\n--- Average Temperatures ---");
    for (int i = 0; i < temps.length; i++) {
      double sum = 0;
      for (int j = 0; j < temps[0].length; j++) {
        sum += temps[i][j];
      }
      double average = sum / temps[0].length;
      System.out.printf("Average for City %d: %.2f\n", i, average);
    }

    scanner.close();
  }
}