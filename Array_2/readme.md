# Array Practicum

Simple overview of use/purpose.

## Description

Basic Programming Practicum: Array Assignment

## Getting Started

### Question 2.1 (Declare, Initialize, and Display 2-Dimensional Array)
1. Do array elements have to be filled in sequentially starting from the 0th index? Please
explain!
   
    No, because arrays in java support random access, meaning you can read or write to any element at any valid index.

1. Why is there a null in the list of audience names?

    The null appears because the element audience[3][1] was never assigned a value.
2. Complete the audience list in step 4 so that it looks like the following program code
   ```java
      audience[0][0] = "Amin";
      audience[0][1] = "Bena";
      audience[1][0] = "Candra";
      audience[1][1] = "Dela";
      audience[2][0] = "Eka";
      audience[2][1] = "Farhan";
      audience[3][0] = "Gisel";
      audience[3][1] = "Hana";
   ```
   
3. Explain the function of audience.length and audience[0].length! <br/> Do audience[0].length, audience[1].length, audience[2].length, and audience[3].length have the same value? Why?

    - audience.length gives you the length of the outer array, while audience[0].length gives you the length of that inner array
    - audience[0].length, audience[1].length, audience[2].length, audience[3].length have the same value because the array was declared as new String[4][2], meaning Java creates 4 inner arrays, and all of them are given the same length of 2.


4. Modify the program code in step 4 to display the length of each row in the array using a for loop. Compile, run, then commit

    ```java
    System.out.println(audience.length);

    for (int i = 0; i < audience.length; i++) {
      System.out.println("Length of row " + (i + 1) + ": " + audience[i].length);
    }
    ```
5. 

6.  Create a program that can manage food and beverage orders at a cafe. The program will allow users to enter orders, calculate the total cost of the order, and display a list of the orders that have been placed.

<ul>

  <li> 
    Input:
    <ul >
    <li>
      number of orders (input by the user).
    </li>
    <li>
      name of the food/drink and the price for each order (input by the user).
    </li>
    </ul>
  </li>

  <li>
    Process:
    <ul>
      <li>
        Store the order data in a one-dimensional array for the order names; and a separate one-dimensional array for the prices.
      </li>
      <li>
        Calculate the total cost of all orders entered.
      </li>
      <li>
        Display a list of orders that have been entered along with the total cost.
      </li>
    </ul>
  </li>

  <li>
    Output:
    <ul>
      <li>
        List of orders and the total cost of all orders.
      </li>
    </ul>
  </li>
</ul>

```java
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
```

3. Continuing with the example of ordering food at a cafe, create a program that allows users to order food from the cafe's menu. The program must store a list of food items in an array and provide an option to search for the desired item using a linear search method.
   <ul>
  <li>
    Input:
    <ul>
      <li>
        A predefined menu item in array form. The item names are initialized during the array declaration. For example:
        <br/>        
        <pre><code>String[] menu = {"Fried Rice", "Fried Noodles", "Toasted Bread", "Fried Potatoes", "Teh Tarik", "Cappuccino", "Chocolate Ice"};</code></pre>
      </li>
      <li>
        The name of the item to be searched for (user input).
      </li>
    </ul>
  </li>
  
  <li>
    Process:
    <ul>
      <li>
        The program searches for the item entered by the user using a linear search algorithm.
      </li>
      <li>
        If the item is found, the program informs the user that it is available. If not, the program informs the user that the item is not on the menu.
      </li>
    </ul>
  </li>
  
  <li>
    Output:
    <ul>
      <li>
        Display the search results (available or not available) to the user.
      </li>
    </ul>
  </li>
</ul>

```java
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
```