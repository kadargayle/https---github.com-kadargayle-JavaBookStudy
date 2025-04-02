package ChapterSix;

public class RandomCharacter {
    // **Generate a random char between ch1 and ch2 */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1) + 1);
    }

    // ** Generate a random lowercase letter */
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    // Generate a random uppercase letter
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    // Generate random digit character
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    // Generate a random character
    public static char getRandomCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }

    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 175;
        final int CHARS_PER_LINE = 25;

        // Print random characters between 'a' and 'z' 25 chars per line
        for (int i = 0; i < NUMBER_OF_CHARS; i++) {

            // invokes defined in the class. Note does not have any parameters, but you
            // still have to use the parentheses when defining and invoking the method.
            char ch = RandomCharacter.getRandomLowerCaseLetter();
            if ((i + 1) % CHARS_PER_LINE == 0) {
                System.out.println(ch);
            } else {
                System.out.print(ch);
            }
        }
    }

}
