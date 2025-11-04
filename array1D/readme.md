# Array Practicum

Simple overview of use/purpose.

## Description

Basic Programming Practicum: Array Assignment

## Getting Started

### Question 2.1 (Fill in Array Element)
1. If the contents of each element of the array num are changed with numbers 5.0, 12867, 7.5, 2000000. What happens? How can it be like that?
   
    A compilation error will occur, because the array types are int, meaning it can't hold decimal numbers

2. Modify the program code by initializing the array elements at the same time when declaring the array.

    ```java
    public class arrayNumbers06 {
      public static void main(String[] args) {
        int[] num = {5, 12, 7, 20};

        System.out.println(num[0]);
      }
    }
    
    ```
3. Change the statement in step 6 to be like this
   ```java
    for (int i = 0; i < 4; i++) {
      System.out.println(num[i]);
    }
   ```
   What is the result? How can it be like that?
   result: 

    5

    12

    7

    20

    it's like that because The code uses a loop to iterate through the array elements

4. If the condition in the for-loop statement is changed to i <= 4, what is the output of the program? Why is the result like that?
result:

5

12

7

20

0

because we added a <= to the condition, meaning it will also print num[4] and since we don't specify the last element and specified the array to be new int[4], it's going to print 0.

5. Commit and push the changes to GitHub. 

### Question 2.2 (Requesting User Input to Fill in an Array Element)

1. Change the statement in step 5 to be like this
```java
    for (int i = 0; i < finalScore.length; i++) {
      System.out.print("Enter the final score " + (i) + ": ");
      finalScore[i] = sc.nextInt();
    }
```
Run the program. Have there been any changes? How can it be like that? <br />
No changes on the result, because when we specify i < 10, it's essentially the same as i < finalScore.length because finalScore.length is 10.

2. Apa yang dimaksud dengan kondisi i < finalScore.length? <br/>
   it checks whether i is less than finalScore.length
3.  Change the statement in step 6 to be like this, so that the program only displays the grades of students who passed, students who have a score > 70
   ```java
      for (int i = 0; i < finalScore.length; i++) {
        if (finalScore[i] > 70) {
          System.out.println("Student " + i + " Passed!");
        }
      }
   ```
   Run the program and describe the flow of the program!

```
    1. The program starts and creates a Scanner object to take input from the user.

    2. It makes an integer array named finalScore that can store 10 scores.

    3. It uses a for loop to ask the user to enter 10 final scores, one by one and each score is saved into the array.

    4. After all scores are entered, another for loop checks each score.

    5. If a score is greater than 70, the program prints that the student (with that index number) “Passed!”.

    6. Only students with scores above 70 are displayed. Those who didn’t pass are shown.

    7. The program ends after checking all 10 students.
```

4. Modify the program so that it displays all students, and mark which one passed, and which did not!
```java
import java.util.Scanner;

public class arrayValue06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] finalScore = new int[10];
    for (int i = 0; i < finalScore.length; i++) {
      System.out.print("Enter the final score " + (i) + ": ");
      finalScore[i] = sc.nextInt();
    }

    for (int i = 0; i < finalScore.length; i++) {
      if (finalScore[i] > 70) {
        System.out.println("Student " + i + " Passed!");
      } else {
        System.out.println("Student " + i + " Failed!");
      }
    }
  }
}
```


### Question 2.3 (Perform Arithmetic Operations on Array Elements)
1. Modify the program in Experiment 3 so that the program can display the number of students who passed, students who have a score greater than 70(>70)
   ```java
    for (int i = 0; i < score.length; i++) {
      if (score[i] > 70) {
        System.out.println("Student " + (i + 1) + " Passed!");
      }
    }
   ```
2. Modify the program in Experiment 3 so that it can produce output like the following display
```
Enter the number of Students: 5
Enter the final score 0: 81
Enter the final score 1: 76
Enter the final score 2: 90
Enter the final score 3: 68
Enter the final score 4: 63
The average score of students who passed is: 82.33333333333333
The average score of students who failed is: 65.5
```

```java
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
```

### Question 2.4 (Searching)
1. Explain the meaning of the break; statement on line 13 of the program code in Experiment 4. <br /> when the condition is met, it gets out of the loop.
2. Modify the program code in experiment 4 so that the program can receive input in the form of the number of array elements, the contents of the array, and the key you want to search for. Then, print to the screen the index of the element positions of the searched key. Example of program results:
   ```
    Enter the number of array elements: 8
    Enter array element 0: 12
    Enter array element 1: 18
    Enter array element 2: -6
    Enter array element 3: 10
    Enter array element 4: 6
    Enter array element 5: 15
    Enter array element 6: 11
    Enter array element 7: 9
    Enter the key you want to search for: 10
    The key in the array is located at index position 3
   ```

  ```java
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
        break;
      }
    }

    System.out.println(" The key in the array is located at index position " + result);
    sc.close();
  }
  ```

3. Modify the program in experiment 4 so that the program will give the message "key not found" if the key is not in the array. Example of program results:
```
Enter the number of array elements: 6
Enter array element 0: 19
Enter array element 1: 23
Enter array element 2: 29
Enter array element 3: 31
Enter array element 4: 37
Enter array element 5: 43
Enter the key you want to search for: 11
Key not found
```

```java
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
```

### Assignment
1. You are asked to create a program that can store and manage student grades. The grades are integers. The program must provide features for:
- entering the number of student grades to be entered,
- entering each student's grade,
- calculating the average grade,
- displaying the highest and lowest grades, and
- displaying all grades entered.
```java
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
```

2.  Create a program that can manage food and beverage orders at a cafe. The program will allow users to enter orders, calculate the total cost of the order, and display a list of the orders that have been placed.

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