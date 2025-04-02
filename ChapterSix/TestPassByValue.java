package ChapterSix;

public class TestPassByValue {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;

        System.out.println("Before invoking the swap method, num 1 is " + num1 + " and num2 is " + num2);

        // Invoke the swap method to attempt the swap two variables
        swap(num1, num2);

        System.out.println("After invoking the swap method, num1 is " + num1 + " and num2 is " + num2);
    }

    public static void swap(int n1, int n2) {

        System.out.println("\tInside the swap method");
        System.out.println("\tBefore swapping, n1 is " + n1 + " and n2 is " + n2);

        // Swap n1 with n2
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("\tAfter swapping, n1 is " + n1 + " and n2 is " + n2);
    }
}

/*
 * Another twist is to change the parameter name in to . What effect does this
 * have? No change occurs, because it makes no difference whether the parameter
 * and the argument have the same name.
 * The parameter is a variable in the method with its own memory space. The
 * variable is allocated when the method is invoked, and it disappears when the
 * method is returned to its caller.
 * 
 */