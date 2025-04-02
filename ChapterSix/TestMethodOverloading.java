package ChapterSix;

/*
A program that creates three methods. 
The first finds the maximum integer, the second finds the maximum double, and the third finds the maximum among three double values.
 All three are named max. 

 This Java code demonstrates **method overloading**, where the same method name (`max`) is used with different parameter types or numbers. Let's go through it step by step:

### Code Breakdown:

```java
public class TestMethodOverloading {
    public static void main(String[] args) {
        // Invoke the max method with int parameters
        System.out.println("The maximum of 3 and 4 is " + max(3, 4));

        // Invoke the max method with double parameters
        System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));

        // Invoke the max method with three double parameters
        System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
    }
}
```

### Main Method Execution:

1. **First Statement:**
   ```java
   System.out.println("The maximum of 3 and 4 is " + max(3, 4));
   ```
   - This calls the `max()` method with two **`int`** parameters (`3` and `4`).
   - The Java compiler will match the `max(int, int)` method.
   - It executes the following `max()` method:

     ```java
     public static int max(int num1, int num2) {
         if (num1 > num2) {
             return num1;
         } else {
             return num2;
         }
     }
     ```
   - The `max()` method compares `3` and `4`, and since `4 > 3`, it returns `4`.
   - The output is:
     ```
     The maximum of 3 and 4 is 4
     ```

2. **Second Statement:**
   ```java
   System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));
   ```
   - This calls the `max()` method with two **`double`** parameters (`3.0` and `5.4`).
   - The Java compiler will match the `max(double, double)` method.
   - It executes the following `max()` method:

     ```java
     public static double max(double num1, double num2) {
         if (num1 > num2) {
             return num1;
         } else {
             return num2;
         }
     }
     ```
   - The `max()` method compares `3.0` and `5.4`, and since `5.4 > 3.0`, it returns `5.4`.
   - The output is:
     ```
     The maximum of 3.0 and 5.4 is 5.4
     ```

3. **Third Statement:**
   ```java
   System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
   ```
   - This calls the `max()` method with **three `double` parameters** (`3.0`, `5.4`, and `10.14`).
   - The Java compiler will match the `max(double, double, double)` method.
   - The `max(double, double, double)` method is implemented like this:

     ```java
     public static double max(double num1, double num2, double num3) {
         return max(max(num1, num2), num3);
     }
     ```
   - This method first calculates the maximum between `num1` and `num2` by calling the `max(double, double)` method. So:
     - It compares `3.0` and `5.4`, and since `5.4 > 3.0`, it returns `5.4`.
   - Then, the result of that comparison (`5.4`) is compared to `num3` (which is `10.14`):
     - It compares `5.4` and `10.14`, and since `10.14 > 5.4`, it returns `10.14`.
   - The output is:
     ```
     The maximum of 3.0, 5.4, and 10.14 is 10.14
     ```

### Overall Flow:
1. The first `max` method (with `int` parameters) returns the maximum of `3` and `4` (which is `4`).
2. The second `max` method (with `double` parameters) returns the maximum of `3.0` and `5.4` (which is `5.4`).
3. The third `max` method (with three `double` parameters) first finds the max of `3.0` and `5.4` (which is `5.4`), then compares `5.4` to `10.14` and returns `10.14`.

### Output:
```
The maximum of 3 and 4 is 4
The maximum of 3.0 and 5.4 is 5.4
The maximum of 3.0, 5.4, and 10.14 is 10.14
```

### Key Points:
- **Method Overloading**: The `max()` method is overloaded in this class. Multiple versions of the same method exist, differentiated by the number or types of parameters.
- The `max()` method is called in three different ways, and Java automatically selects the correct version based on the type and number of arguments provided.
*/

public class TestMethodOverloading {
    public static void main(String[] args) {
        // Invoke the max method with int parameters
        System.out.println("The maximum of 3 and 4 is " + max(3, 4));

        // INvoke the max of double parameters
        System.out.println("The maximum of 3.0 and 5.4 is " + max(3.0, 5.4));

        // Invoke the max method with three double parameters
        System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0, 5.4, 10.14));
    }

    /* Find the max of two int values */
    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double max(double num1, double num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }
}
