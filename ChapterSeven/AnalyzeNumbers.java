package ChapterSeven;

/*
 * Read 100 numbers, get the average of these numbers, and find the number of the items
 * greater than the average. To be flexible for handling any number of inputs, we will let the user enter the number
 * of inputs, rather than fixing it to 100. 
 */
import java.util.*;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];

        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;

        int count = 0; // the number of elements above average
        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
    }

}
