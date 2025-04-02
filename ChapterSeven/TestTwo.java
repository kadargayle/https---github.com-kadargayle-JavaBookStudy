package ChapterSeven;

public class TestTwo {
    public static void main(String[] args) {
        // a. Create an array to hold 10 double values
        double[] arrayOne = { 1.5, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // b. Assign the value 5.5 to the last array
        arrayOne[arrayOne.length - 1] = 5.5;

        for (int i = 0; i < arrayOne.length; i++) {
            System.out.println(arrayOne[i]);
        }

        // c. Display the sum of the first two elements
        double sum = arrayOne[0] + arrayOne[1];
        System.out.println("Element 1 + Element 2 = " + sum);

        // d. Write a loop that computes the sum of all elements in the array.
        double total = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            total += arrayOne[i];

        }
        System.out.println("Total sum = " + total);

        // e. Write a loop that finds the minimum element in the array.
        double minElement = arrayOne[0];
        for (int i = 1; i < arrayOne.length; i++) {
            if (arrayOne[i] < minElement) {
                minElement = arrayOne[i];
            }
        }
        System.out.println(minElement);

        // Randomly generate an index and display the element of this index in the
        // array.
        double[] randomNumbers = new double[10];
        double tempNumbers = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            tempNumbers = Math.floor(Math.random() * 10);
            randomNumbers[i] = tempNumbers;
            System.out.println("Index: " + i + " is " + randomNumbers[i]);
        }

        // g use an array initializer to create
        double[] secondArray = { 3.5, 5.5, 4.52, 5.6 };
        
    }

}
