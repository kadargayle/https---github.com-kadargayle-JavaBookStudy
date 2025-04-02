package ChapterSeven;

/*
Shift the elements left or right. An example of shifting the elements one position to the left and filling the last element 
with the first element. 
*/
public class ShiftingElements {
    public static void main(String[] args) {
        double[] myList = { 1, 5, 2, 3, 4, 5 };
        double temp = myList[0];

        // Shift elements left
        for (int i = 1; i < myList.length; i++) {
            myList[i - 1] = myList[i];
        }

        // Move the first element to fill in the last position
        myList[myList.length - 1] = temp;
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }

    }

}
