import java.util.Scanner;

public class cafeOrderManager {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of orders: ");
    int numOrders = scanner.nextInt();

    String[] orderNames = new String[numOrders];
    double[] orderPrices = new double[numOrders];
    double totalCost = 0.0;

    for (int i = 0; i < numOrders; i++) {
      System.out.println("\n--- Order " + (i + 1) + " ---");
      scanner.nextLine();

      System.out.print("Enter food/drink name: ");
      orderNames[i] = scanner.nextLine();

      System.out.print("Enter price: ");
      orderPrices[i] = scanner.nextDouble();

      totalCost = totalCost + orderPrices[i];
    }

    System.out.println("\n--- Order List ---");
    for (int i = 0; i < numOrders; i++) {
      System.out.println((i + 1) + ". " + orderNames[i] + " - $" + orderPrices[i]);
    }

    System.out.println("\nTotal Cost of all orders: $" + totalCost);
  }
}