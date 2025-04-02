package ChapterOne;

/**
 * (Area and perimeter of a circle) Write a program that displays the area and
 * perimeter of a circle that has a radius of 5.5 using the following formulas:
 * 
 * perimeter = 2 * radius * pie
 * area = radius * radius * pie
 * 
 */
public class ProblemSix {
    public static void main(String[] args) {

        double perimeter = 2 * 5.5 * Math.PI;
        double area = 5.5 * 5.5 * Math.PI;

        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is " + area);

    }

}
