package ChapterSeven;

/**
 * 
 * There are three ways to copy arrays:
 * Use a loop to copy individual elements one by one.
 * 
 * Use the static method in the class.
 * 
 * Use the method to copy arrays; this will be introduced in Chapter 13,
 * Abstract Classes and Interfaces.
 * 
 * 
 */
public class CopyArrays {
    /**
     * 
     * You can write a loop to copy every element from the source array to the
     * corresponding element in the target array.
     * The following code, for instance, copies to using a loop:
     * 
     * @param args
     */
    public static void main(String[] args) {
        int[] sourceArray = { 2, 3, 1, 5, 10 };

        int[] targetArray = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
            System.out.println(targetArray[i]);
        }

        // use the arraycopy method to copy the following array to a target array t:
        int[] source = { 3, 4, 5 };
        int[] targetArrayT = new int[source.length];
        System.arraycopy(source, 0, targetArrayT, 0, source.length);

        System.out.print("Target Array: ");

         /*
             * for (int num : t) {
            System.out.print(num + " ");
             */
        for (int num = 0; num < targetArrayT.length; num++) {
            System.out.print(targetArrayT[num] + " ");

           
        }

    }

}
