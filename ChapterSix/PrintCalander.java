package ChapterSix;

/**
 * Suppose that you write a program that displays the calendar for a given month
 * of the year.
 * The program prompts the user to enter the year and the month, and then
 * displays the entire calendar for the month,
 * 
 * 1. Get full year from the user input
 * 2. Get the month of the year from 1 to 12
 * 3. Print the month title and month body
 * 4. Month title consists of month and year and a dashed line, the names of the
 * seven days of the week. You need to get the month name (January) from the
 * numberic month (1)
 * using method getMonthName
 * 
 * In order to print the month body, you need to know which day of the week is
 * the first day of the month (getStartDay) and how many days the month has
 * (getNumberOfDaysInMonth),
 * For example, December 2013 has 31 days, and December 1, 2013 is a Sunday.
 * 
 * TOP DOWN APPROACH 
 * The top-down approach implements one method in the structure chart at a time from the top to the bottom. 
 * Stubs—a simple but incomplete version of a method—can be used for the methods waiting to be implemented. 
 * The use of stubs enables you to quickly build the framework of the program. 
 * Implement the  method first then use a stub for the  method. For example, let  display the year and the month in the stub. 
 * 
 * To implement , you need to compute the total number of days () between January 1, 1800 and the first day of the calendar month. 
 * You could find the total number of days between the year 1800 and the calendar year then figure out the total number of days prior to the calendar month in the calendar year. 
 * The sum of these two totals is .
 */
import java.util.*;

public class PrintCalander {
    public static void main(String[] args) {
        // Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter year
        System.out.print("Enter full year (ex: 2012): ");
        int year = input.nextInt();

        // Prompt the user to enter month
        System.out.print("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        // Print calendar for the month of the year
        printMonth(year, month);
    }

    // print the calendar for a month in a year
    public static void printMonth(int year, int month) {
        // Print the headings of the calendar
        printMonthTitle(year, month);

        // Print the body of the calendar
        printMonthBody(year, month);
    }

    // A stub for printMonthTitle may look like this
    public static void printMonthTitle(int year, int month) {
        System.out.println("\t" + getMonthName(month) + " " + year);
        System.out.println("--------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

    }

    // A stub for printMonthBody
    public static void printMonthBody(int year, int month) {
        // Get start day of the weekfor the first date in the month
        int startDay = getStartDay(year, month);

        // Get number of days in the month
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);

        // Pad space before the first day of the month
        int i = 0;
        for (i = 0; i < startDay; i++) {
            System.out.print("  ");
        }

        for (i = 1; i <= numberOfDaysInMonth; i++) {
            System.out.printf("%4d", i);
            if ((i + startDay) % 7 == 0) {
                System.out.println();
            }
        }

        System.out.println();
    }

    // A stub for getMonthName
    public static String getMonthName(int month) {
        String monthName = "";
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
        }
        return monthName;
    }

    // getStartDay
    public static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1800 = 3;
        // get total number of days from 1/1/1800 to month/1/year
        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        // return the start day of month/1/year
        return (totalNumberOfDays + START_DAY_FOR_JAN_1800) % 7;
    }

    // getTotalNumberOfDays
    public static int getTotalNumberOfDays(int year, int month) {
        int total = 0;

        // Get the total days from 1800 to 1/1/year
        for (int i = 1800; i < year; i++) {
            if (isLeapyear(i)) {
                total = total + 366;
            } else {
                total = total + 365;
            }
        }
        // Adds days from Jan to the month prior to the calendar month
        for (int i = 1; i < month; i++) {
            total = total + getNumberOfDaysInMonth(year, i);
        }
        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            return isLeapyear(year) ? 29 : 28;
        }
        return 0; // if month is incorrect
    }

    public static boolean isLeapyear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
