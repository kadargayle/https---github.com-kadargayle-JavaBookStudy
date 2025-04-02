package ChapterOne;

/*
 * Runner runs 24 miles in 1 hour, 40 minutes and 50 seconds
 * Write a program that displays the average speed in kilometers per hour. 
 * 1 mile is 1.6 kilometers
 * 
*/
public class AverageSpeedInKilometers {
    public static void main(String[] args) {
        double miles = 24;
        double hour = 1;
        double minutes = 40;
        double seconds = 50;

        // Convert miles to kilometers
        double milesToKilometers = miles * 1.6;

        // convert total time in hours
        double totalTimeInHours = hour + (minutes / 60) + (seconds / 3600.0);

        double averageSpeed = milesToKilometers / totalTimeInHours;

        System.out.println("The average speed is " + Math.floor(averageSpeed));
    }

}
