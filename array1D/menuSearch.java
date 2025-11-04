import java.util.Scanner;

public class menuSearch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] menu = { "Fried Rice", "Fried Noodles", "Toasted Bread", "Fried Potatoes", "Teh Tarik", "Cappuccino",
        "Chocolate Ice" };

    System.out.println("--- Cafe Menu ---");
    for (int i = 0; i < menu.length; i++) {
      System.out.println("- " + menu[i]);
    }

    System.out.print("\nEnter the item name to search for: ");
    String searchItem = scanner.nextLine();

    boolean found = false;

    for (int i = 0; i < menu.length; i++) {
      if (menu[i].equalsIgnoreCase(searchItem)) {
        found = true;
        break;
      }
    }

    System.out.println("\n--- Search Results ---");
    if (found) {
      System.out.println("SUCCESS! The item '" + searchItem + "' is available on the menu.");
    } else {
      System.out.println("SORRY. The item '" + searchItem + "' is NOT on the menu.");
    }
  }
}