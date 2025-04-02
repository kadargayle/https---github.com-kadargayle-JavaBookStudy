package ChapterSix;

/**
 * When you invoke a method with an argument, the value of the argument is
 * passed to the parameter.
 * This is referred to as pass-by-value. If the argument is a variable rather
 * than a literal value, the value of the variable is passed to the parameter.
 * The variable is not affected, ­regardless of the changes made to the
 * parameter inside the method.
 * As given in Listing 6.4, the value of () is passed to the parameter to invoke
 * the method (line 5).
 * The parameter is incremented by in the method (line 10), but is not changed
 * no matter what the method does.
 * 
 * 
 */

public class Increment {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the call, x is " + x);
        increment(x);
        System.out.println("After the call, x is " + x);
    }

    public static void increment(int n) {
        n++;
        System.out.println("n inside the increment method " + n);
    }

}
