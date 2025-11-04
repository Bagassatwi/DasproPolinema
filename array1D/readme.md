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