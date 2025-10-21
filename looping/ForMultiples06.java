import java.util.Scanner;

public class ForMultiples06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input the multiple: ");
    int sum = 0, counter = 0;
    int multiple = sc.nextInt();
    for (int i = 1; i <= 50; i++) {
      if (i % multiple == 0) {
        sum = sum + i;
        counter++;
      }
    }
    double avg = (double) sum / counter;
    System.out.printf("There are %d number that are multiples of %d between 1 and 50%n", counter, multiple);
    System.out.printf("the sum of all multiples of %d between 1 and 50 is %d%n", multiple, sum);
    System.out.printf("the average of all multiples of %d between 1 and 50 is %.2f%n", multiple, avg);
    sc.close();
  }
}
