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