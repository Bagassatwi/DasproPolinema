import java.util.Scanner;

public class linearSearch06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of array elements: ");
    int size = sc.nextInt();
    int[] arrayInt = new int[size];

    for (int i = 0; i < size; i++) {
      System.out.print(" Enter array element " + i + ": ");
      arrayInt[i] = sc.nextInt();
    }

    System.out.print(" Enter the key you want to search for: ");
    int key = sc.nextInt();

    int result = -1;
    for (int i = 0; i < arrayInt.length; i++) {
      if (arrayInt[i] == key) {
        result = i;
        System.out.println(" The key in the array is located at index position " + result);
        break;
      } else {
        System.out.println(" Key not found");
        break;
      }
    }
    sc.close();
  }
}