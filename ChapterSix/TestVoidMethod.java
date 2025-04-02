package ChapterSix;

/*
 * A void method does not return a value
 * 
 * The  method is a  method because it does not return any value. 
 * A call to a  method must be a statement. 
 * Therefore, it is invoked as a statement in line 4 in the  method. Like any Java statement, it is terminated with a semicolon.
 * 
*/
public class TestVoidMethod {
    public static void main(String[] args) {
        System.out.print("The grade is ");
        printGrade(78.5);

        System.out.print("The grade is ");
        printGrade(59.5);

    }

    public static void printGrade(double score) {
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
