# Looping Practicum

Simple overview of use/purpose.

## Description

Basic Programming Practicum: Looping Assignment

### 2.1 Experiment 1: Loop Review

1.  **If `int i=1` is changed to `i=0` :**
    The loop will execute $N+1$ times. If the input $N$ is 5 , the loop condition $i<=N$ will be true for $i = 0, 1, 2, 3, 4, 5$. This results in 6 iterations, printing 6 asterisks (`******`) instead of 5.
2.  **If `i<=N` is changed to `i>N` :**
    The loop body will not execute. The initialization is $i=1$ . Assuming $N$ is a positive integer (e.g., 5 ), the condition $1 > 5$ is immediately false. No asterisks will be printed.
3.  **If `i++` is changed to `i--` :**
    The program will enter an infinite loop, assuming $N \ge 1$. The variable $i$ starts at 1, then becomes $0, -1, -2, \dots$ . The condition $i<=N$ (e.g., $1 \le 5$, $0 \le 5$, $-1 \le 5$) will always evaluate to true, causing the program to continuously print asterisks.

-----

### 2.2 Experiment 2: Square Star

1.  **If `iOuter = 1` is changed to `iOuter = 0` :**
    The outer loop will execute $N+1$ times. The condition is `iOuter <= N` . If $N=5$, the loop will run for `iOuter` values $0, 1, 2, 3, 4, 5$. This will result in 6 rows of asterisks being printed instead of 5.
2.  **If `i = 1` is changed to `i = 0` (inner loop) :**
    The inner loop will execute $N+1$ times. The condition is $i<=N$ . If $N=5$, the inner loop will run for $i$ values $0, 1, 2, 3, 4, 5$. This will result in 6 asterisks (`******`) being printed *per row*. The final output will be $N$ rows, each $N+1$ asterisks long.
3.  **Difference between outer and inner loop :**
      * **Outer Loop** (`for (int iOuter = 1; iOuter <= N; iOuter++)` ): Controls the vertical repetition (the number of rows). It executes $N$ times.
      * **Inner Loop** (`for (int i = 1; i <= N; i++)` ): Controls the horizontal repetition (the number of columns, or asterisks, *within* a single row). It executes $N$ times *for each iteration* of the outer loop.
4.  **Why `System.out.println();` is necessary :**
    This command moves the output cursor to a new line. It is placed *after* the inner loop completes (printing one full row of asterisks) but *inside* the outer loop .
      * **If omitted :** The `System.out.print("*")` from the inner loop would never be followed by a line break. All asterisks for all rows would be printed on a single, continuous line (e.g., for $N=5$, it would print `*************************`).

-----

### 2.3 Experiment 3: Triangle Star

1.  **Does the output match the display :**
    No. The provided code produces the following output for $N=5$:
    *(blank line)*
    `*`
    `**`
    `***`
    `****`
    `*****`
    This is because the outer loop runs from $i=0$ up to and including $i=N$ ($N+1$ iterations) . When $i=0$, the inner loop condition $j < i$ ($j < 0$) is false, so it prints nothing but the (missing) newline, resulting in a blank first line.

2.  **Parts to be improved/added :**
    Two modifications are required:

    1.  The outer loop condition `while (i <= N)` should be `while (i < N)` to make the loop execute $N$ times (for $i=0, 1, 2, 3, 4$).
    2.  A `System.out.println();` command must be added *after* the inner `while` loop but *before* the `i++;` to create a new line for each row.

    **Corrected Code:**

    ```java
    System.out.print("Enter the value of N: ");
    int N = sc.nextInt();
    int i = 0;
    while (i < N) { // Changed condition from <= N
        int j = 0;
        while (j <= i) { // Changed condition from j < i
            System.out.print("*");
            j++;
        }
        System.out.println(); // Added newline
        i++;
    }
    ```

    *(Note: An alternative fix is changing $i=0$ to $i=1$ , keeping $i<=N$ , and keeping $j<i$ , while still adding the `System.out.println();`.)*

-----

### 2.4 Experiment 4: Guess the Number Quiz

1.  **Program flow explanation :**
    The program uses two nested `do-while` loops.

      * **Outer Loop** : Controls the ability to "repeat the game". It initializes `menu = 'y'` and repeats as long as the user inputs 'Y' or 'y' at the end .
      * **Inner Loop** : Controls the guessing process for a single game.
        Inside the outer loop, a new random `number` (1-10) is generated, and `success` is set to `false` . The inner loop then starts. It repeatedly prompts the user to "Guess the number" . It checks if the `answer` equals the `number` and sets the `success` boolean accordingly . The inner loop continues to run as long as `!success` (the guess is wrong) . Once the guess is correct (`success` is `true`), the inner loop terminates, and the program asks the user to repeat the game .

2.  **How to discontinue the game :**
    When prompted "Do you want to repeat the game (Y/N)" , the user must input any character that is not 'Y' and not 'y' .

3.  **Modification for smaller/greater hint :**
    An `if-else if` structure should be added inside the inner `do-while` loop, after the user provides the `answer` and before the `success` variable is assigned .

    **Modified Inner Loop:**

    ```java
    do {
        System.out.print("Guess the number (1-10): ");
        int answer = input.nextInt();
        input.nextLine();
        
        if (answer < number) {
            System.out.println("Your guess is too small.");
        } else if (answer > number) {
            System.out.println("Your guess is too large.");
        }
        
        success = (answer == number);
    } while (!success);

    System.out.println("Congratulations, your guess was correct!"); // Optional success message
    ```

-----

### 2.5 Experiment 5: Filling and Displaying Arrays

1.  **Program flow explanation :**
    The program performs two main operations using nested loops on a 2D array `temps` (5 rows, 7 columns) .

      * **Part 1: Data Input**
        1.  An outer loop iterates $i$ from 0 to 4 (representing 5 cities) .
        2.  For each city $i$, it prints "City: $i$" .
        3.  An inner loop iterates $j$ from 0 to 6 (representing 7 days) .
        4.  For each day $j$, it prompts "Day $j+1$: ", reads a `double` from the user, and stores it in `temps[i][j]` .
        5.  After the inner loop finishes (all 7 days), it prints a newline .
      * **Part 2: Data Display**
        1.  A second outer loop iterates $i$ from 0 to 4 (cities) .
        2.  For each city $i$, it prints "City: $i$" .
        3.  A second inner loop iterates $j$ from 0 to 6 (days) .
        4.  It prints the value stored in `temps[i][j]` followed by a space .
        5.  After the inner loop finishes (all 7 temps for that city), it prints a newline .

2.  **Modify to display using `foreach` :**
    The second block of code (Data Display) can be replaced with nested `foreach` loops. An index variable is needed to replicate the "City: $i$" output.

    **Modification:**

    ```java
    // Replace the second loop block with this:
    int cityIndex = 0;
    for (double[] cityData : temps) {
        System.out.println("City: " + cityIndex);
        for (double dayTemp : cityData) {
            System.out.print(dayTemp + " ");
        }
        System.out.println();
        cityIndex++;
    }
    ```

3.  **Modify to display average value for each city :**
    The second block of code (Data Display) must be modified. Inside the outer loop, a `sum` variable must be initialized. The inner loop will sum the values. After the inner loop, the average is calculated and printed.

    **Modification:**

    ```java
    // Replace the second loop block with this:
    for (int i = 0; i < temps.length; i++) {
        System.out.println("City: " + i);
        double sum = 0;
        for (int j = 0; j < temps[0].length; j++) {
            System.out.print(temps[i][j] + " "); // Still display the value
            sum += temps[i][j]; // Add value to sum
        }
        System.out.println(); // Newline after listing days
        
        double average = sum / temps[0].length;
        System.out.printf("Average for City %d: %.2f\n", i, average);
        System.out.println(); // Add extra space for readability
    }
    ```
1. What is the use of the BREAK within the loop syntax?
   
    to get out of the loop once the condition in which the break is in is met.


2. Modify the program so that if the number of leave days requested is greater than the remaining entitlement, the program does not stop, allowing the user to enter the number of days according to the entitlement.
   
   ```
    import java.util.Scanner;

    public class DoWhileLeaveEntitlement06 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement = 0, numLeave = 0;
        String confirmation = "";
        System.out.print("Input your leave entitlement: ");
        leaveEntitlement = input.nextInt();
        do {
          System.out.print("Do you want to take a leave (y/n)? ");
          confirmation = input.next();
          if (confirmation.equalsIgnoreCase("y")) {
            System.out.print("How many day(s)? ");
            numLeave = input.nextInt();
            if (numLeave <= leaveEntitlement) {
              leaveEntitlement -= numLeave;
              System.out.println("Remaining leave entitlement: " + leaveEntitlement);
            } else {
              System.out.println("You don't have enough leave entitlement");
              System.out.print("Input your leave entitlement: ");
              leaveEntitlement = input.nextInt();
            }
          }
        } while (leaveEntitlement > 0);
      }
    }
   ```
  3. Commit and push the program code to GitHub.<br/>
     <a href="https://github.com/Bagassatwi/DasproPolinema/commit/fc56f5d065ec2366f20f22944a19e3ea35e22316">Github commit link</a>
  4. When typing "t" as the confirmation input, what happens? Why?
   
      it loops through the confirmation over and over because the condition to meet the code block inside the do while isn't met while the condition for the loop is met.
  5. Modify the program code so that when the user enters "t" as the confirmation input, the program will stop.
   
     ```
     import java.util.Scanner;
     public class DoWhileLeaveEntitlement06 {
       public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int leaveEntitlement = 0, numLeave = 0;
         String confirmation = "";
         System.out.print("Input your leave entitlement: ");
         leaveEntitlement = input.nextInt();
         do {
           System.out.print("Do you want to take a leave (y/n)? ");
           confirmation = input.next();
           if (confirmation.equalsIgnoreCase("y")) {
             System.out.print("How many day(s)? ");
             numLeave = input.nextInt();
             if (numLeave <= leaveEntitlement) {
               leaveEntitlement -= numLeave;
               System.out.println("Remaining leave entitlement: " + leaveEntitlement);
             } else {
               System.out.println("You don't have enough leave entitlement");
               System.out.print("Input your leave entitlement: ");
               leaveEntitlement = input.nextInt();
             }
           } else {
             break;
           }
         } while (leaveEntitlement > 0);
       }
     }
      ```

  Assignment (Open Challenge)
  1. Do a modification on the program from the lab 3, so you get this following result.
   
  <img src="./img/assignment.png" />
  <br />

  ```
  import java.util.Scanner;

public class TheTriangle06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input a number: ");
    int i = 0;
    String s = "";
    int numInput = input.nextInt();
    for (i = numInput; i > 0; i--) {
      s = "";
      for (int j = 0; j < i; j++) {
        s += " *";
      }
      System.out.println(s);
    }
  }
}

  ```