package ChapterSeven;

import java.util.*;

public class ArraysNotes {

    public static void main(String[] args) {

        /**
         * Initializing arrays with input values: The following loop initializes the
         * array with user input values:
         * 
         */
        Scanner input = new Scanner(System.in);
        double[] myList = new double[10];
        System.out.print("Enter " + myList.length + " values: ");
        for (int i = 0; i < myList.length; i++) {
            myList[i] = input.nextDouble();
        }
        System.out.println(myList[0]);

        /*
         * Initialiing arrays with random values: The folloowing loop initializes the
         * array myList with random values between 0.0 and 100.0 but less than 100.0
         * 
         */
        double[] secondList = new double[10];
        for (int i = 0; i < secondList.length; i++) {
            secondList[i] = Math.random() * 100;
        }
        System.out.println(Math.floor(secondList[2]));

        /*
         * Displaying arrays: To print an array, you have to print each element in the
         * array using a loop such as
         */
        double[] thirdList = new double[10];
        for (int i = 0; i < thirdList.length; i++) {
            System.out.println(thirdList[i] + " ");
        }

        /*
         * Summing all elements: Use a variable named total to store the sum. Initially
         * total is 0. Add each element in the array to total using a loop such as the
         * following.
         * 
         */
        System.out.println("Examle 4: -----------------------------");
        double total = 0;
        double[] fourthList = { 1.9, 2.9, 3.4, 3.5 };

        for (int i = 0; i < fourthList.length; i++) {
            total += fourthList[i];

        }
        System.out.println(total);

        /**
         * Example 5: Finding the largest element: Use a variable named max to store the
         * largest element. Initially max is
         * myList[0]. To find the largest element in the array myList, compare each
         * element with max, and update max if the element is greater than max.
         * 
         */
        System.out.println("Example 5: ------------------");
        double[] fifthList = { 0, 5, 6, 7, 8, 9, 10 };
        double max = fifthList[0];
        for (int i = 1; i < fifthList.length; i++) {
            if (fifthList[i] > max) {
                max = fifthList[i];
            }
        }
        System.out.println(max);

        System.out.println("Example 6: -------------------");
        /**
         * Finding the smallest index of the largest element:
         * Suppose the array myList is {1,5,3,4,5,5}.
         * The largest element is 5 and the smallest index for 5 is 1.
         * Use a variable named max to store the largest element,
         * and a variable named indexOfMax to denote the index of the largest element.
         * Initially max is myList[0] and indexOfMax is 0.
         * Compare each element in myList with max and update max and indexOfMax if the
         * element is greater than max.
         */
        double[] sixthList = { 1, 5, 3, 4, 5, 5 };
        double maxNumber = sixthList[0];
        int indexOfMax = 0;
        for (int i = 1; i < sixthList.length; i++) {
            if (sixthList[i] > max) {
                max = myList[i];
                indexOfMax = i;
            }
        }

        System.out.println("Example 7:-----------------------");
        /*
         * You need to randomly reorder the elements in an array. This is called
         * shuffling. To accomplish this, for each element myList[i], randomly generate
         * an index
         * j and swap myList[i] with myList[j]
         */
        for(int i = 0; i < myList.length - 1; i++){
            // generate an index j randomly
            int j = (int)(Math.random() * myList.length);

            //Swap myList[i] with myList[j]
            double temp = myList[i];
            myList[i] = myList[j];
            myList[j] = temp;
        }
    }

}
