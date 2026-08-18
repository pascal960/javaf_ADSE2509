package com.adse2509.sess10.date_time_api_enumaration;

import com.adse2509.util.Spacer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

/**
 * Java program to demonstrate the use of the LocalDate, LocalTime, LocalDateTime
 * and MonthDay classes from the java.time package.
 */
public class LocalDateTimeMonthlyDayDemo {

    //==================================================================
    // 1. Demonstrating the LocalDate class
    //==================================================================
    private static void demoLocalDate() {
        System.out.println("\n1. LocalDate - represents a date (year, month, day) without a time zone.");

        // Get the current date
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: " + today);

        // Create a specific LocalDate (e.g., Christmas 2026)
        LocalDate christmas = LocalDate.of(2026, 12, 25);
        System.out.println("Christmas 2026 will be on date: " + christmas);

        // Adding and subtracting days, months, and years
        LocalDate oneWeekLater = today.plusWeeks(1);
        System.out.println("One week after today will be on date: " + oneWeekLater);

        LocalDate oneMonthEarlier = today.minusMonths(1);
        System.out.println("One month before today was on date: " + oneMonthEarlier);

        // Check whether the current year is leap or not
        boolean isLeapYear = today.isLeapYear();
        System.out.println(today.getYear() + " is a leap year? " + isLeapYear);

        // Get the day of the week
        System.out.println("Today's day of the week is: " + today.getDayOfWeek());
    }

    //==================================================================
    // 2. Demonstrating the LocalTime class
    //==================================================================
    private static void demoLocalTime() {
        System.out.println("\n2. LocalTime - Handling a time (hours, minutes, seconds) without a date or timezone.");
        
        // Get the current time from the system the program is running on
        LocalTime now = LocalTime.now();
        System.out.println("The current system time is: " + now);

        // Create a specific LocalTime (e.g 15:30)
        LocalTime afternoonTime = LocalTime.of(15, 30, 8);
        System.out.println("Last class of the day will end at: " + afternoonTime);

        // Add/subtract time
        LocalTime twoHoursLater = now.plusHours(2);
        System.out.println("The time 2 hours from now will be: " + twoHoursLater);

        LocalTime thirty5MinEarlier = now.minusMinutes(35);
        System.out.println("The time 35 minutes ago was: " + thirty5MinEarlier);

        // Display current hour, minute and second
        System.out.printf("Current hour: %d\nCurrent minute: %d\nCurrent second: %d\n", 
                now.getHour(), now.getMinute(), now.getSecond());
    }

    //==================================================================
    // 3. Demonstrating the LocalDateTime class
    //==================================================================
    private static void demoLocalDateTime() {
        System.out.println("\n3. LocalDateTime - both date & time without the time zone.");

        // Get the current date and time from the system running this program
        LocalDateTime now = LocalDateTime.now();
        System.out.println("The current system time (date & time) is: " + now);

        // Create a specific LocalDateTime
        LocalDateTime examDateTime = LocalDateTime.of(2026, 8, 27, 11, 0);
        System.out.println("The SMAC exam will be on : " + examDateTime);

        // Adding/Subtracting time from a given date
        LocalDateTime threeDaysLater = now.plusDays(3);
        System.out.println("The date and time 3 days from now will be : " + threeDaysLater);

        // LocalDate and time 5 hours earlier
        System.out.println("The time 5 hours ago was: " + now.minusHours(5));

        // Format LocalDateTime using a custom formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("The formatted current date and time is: " + formattedDateTime);
    }

    //========================================================
    // 4. Demonstrating the MonthDay class
    //========================================================
    private static void demoMonthDay() {
        System.out.println("\n4. MonthDay - represents a specific month and day, without the year.");
        MonthDay currentMonthDay = MonthDay.now();
        System.out.println("Today's month & day are: " + currentMonthDay);

        // Create a specific MonthDay (e.g., Valentine's Day)
        MonthDay valentineDay = MonthDay.of(2, 14); // Feb. 14th
        System.out.println("Valentine's day is on: " + valentineDay);

        // Check whether today is Valentine's Day
        boolean isValentinesDay = currentMonthDay.equals(valentineDay);
        System.out.println("Is today Valentines day? " + isValentinesDay);

        // Check whether today's date is before or after Valentine's Day
        boolean isb4Valentines = currentMonthDay.isBefore(valentineDay);
        System.out.println("Is today before Valentines day? " + isb4Valentines);
        System.out.println("Is today after Valentines day? " + currentMonthDay.isAfter(valentineDay));
    }

    // main method begins program execution
    public static void main(String[] args) {
        // 1. Demonstrate the LocalDate class
        demoLocalDate();
        Spacer.separator();

        // 2. Demonstrate the LocalTime class
        demoLocalTime();
        Spacer.separator();

        // 3. Demonstrate the LocalDateTime class
        demoLocalDateTime();
        Spacer.separator();

        // 4. Demonstrate the MonthDay class
        demoMonthDay();
        Spacer.separator();
    }
}
