package ChapterOne;

/**
 * display 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
 * and 4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
 * use 1.0 instead of 1 in your programming
 */
public class ProblemFive {
    public static void main(String[] args) {
        double problemOne = 4 * (1.0 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11);
        double problemTwo = 4 * (1.0 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 / 13);

        System.out.println(problemOne);
        System.out.println(problemTwo);
    }

}
