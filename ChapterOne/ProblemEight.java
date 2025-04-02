package ChapterOne;

/**
 * Assume that a runner runs 14 kilometers in 45 minutes and 30 seconds.
 * Write a program that displays the average speed in miles per hour.
 * (1 mile is equal to 1.6 kilometers)
 * 
 * Average Speed in Miles
 * 
 */
public class ProblemEight {
    public static void main(String[] args) {
        double kilometers = 14;
        int minutes = 45;
        int seconds = 30;

        // convert kilometers to miles (1 mile = 1.6 km)
        double miles = kilometers / 1.6;

        // Convert total time in hours
        double totalTimeInHours = (minutes * 60 + seconds) / 3600.0;

        // Calculate the average speed in miles per hour
        double averageSpeed = miles / totalTimeInHours;

        // Display the result
        System.out.println("The average speed is " + Math.floor(averageSpeed) + " per hour in miles: " + miles);

    }

}
