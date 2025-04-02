package ChapterSeven;

/*
Arrays can be used to greatly simplify coding for certain tasks. For example, suppose you wish to obtain the English name of a given month by its number. 
If the month names are stored in an array, the month name for a given month can be accessed simply via the index. 
The following code prompts the user to enter a month number and displays its month name
*/
import java.util.*;

public class SimpleCode {
    public static void main(String[] args) {
        String[] months = { "Jan", "Feb", "March", "April", "May", "June", "July", "August", "Sep", "Oct", "Nov",
                "Dec" };
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month number (1 to 12): ");
        int monthNumber = input.nextInt();

        System.out.println("The month is " + months[monthNumber - 1]);
    }
}
