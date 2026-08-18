package com.adse2509.sess10.date_time_api_enumaration;

import com.adse2509.util.Spacer;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;

/**
 * Java program to demonstrate the use of the Clock, Duration and Instant classes
 * from the java.time package.
 * 
 * 1. Clock provides access to the current time in a specific time zone.
 * 2. Duration measures the amount of time between two points in time.
 * 3. Instant represents a specific moment on the timeline (in UTC)
 * 
 * @author pkivuitu
 */
public class TimeAPIDemo {

    //============================================================= 
    // 1. Demonstrating the Clock class
    //=============================================================
    public static void demoClock() {
        System.out.println("1. Clock: Getting the current time");
        
        // Get the system clock in the default time zone (system default)
        Clock clock = Clock.systemDefaultZone();

        // Get the current time using clock
        Instant now = clock.instant();
        System.out.println("Current instant is " + now);
        
        // Get the current time in a specific time zone (UTC)
        Clock utcClock = Clock.systemUTC();
        Instant utcNow = utcClock.instant();
        System.out.println("Current instant in UTC is: " + utcNow);

        // Get the current time in a specific time zone (Asia/Tokyo)
        Clock tokyoClock = Clock.system(ZoneId.of("Asia/Tokyo"));
        Instant tokyoNow = tokyoClock.instant();
        System.out.println("Current instant in Tokyo, Japan is: " + tokyoNow);
    }

    //============================================================= 
    // 2. Demonstrating the Duration class
    //=============================================================
    public static void demoDuration() {
        System.out.println("\n2. Duration - measuring the time between two instants");
         
        // Create 2 instants : one for the current moment and one in the past 
        Instant start = Instant.now();
        
        // Simulate some processing for 2.5 seconds
        try {
            Thread.sleep(2500); // put the thread to sleep for 2.5 seconds
        } catch (InterruptedException ie) {
            System.err.println("Thread interrupted.\n" + ie.getLocalizedMessage());
        }
        
        Instant end = Instant.now();

        // Calculate the duration between the start and end moments
        Duration duration = Duration.between(start, end);
        System.out.println("Time elapsed: " + duration.toMillis() + " milliseconds. ");
        System.out.println("Time elapsed in seconds: " + duration.getSeconds() + " seconds.");

        // Convert duration to minutes and hours
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        System.out.println("Duration in hours: " + hours + " hours.");
        System.out.println("Duration in minutes: " + minutes + " minutes.");
    }
    
    //============================================================= 
    // 3. Demonstrating the instant class 
    //=============================================================
    
    private static void demoInstant ()
    {
            System.out.println("\n3. Instant - representing a specific point in time.");

    // Create an Instant representing the current moment in time
    Instant instantNow = Instant.now();
    System.out.println("Current instant (in UTC) is: " + instantNow);

    // Convert Instant to a different time zone (e.g., Nairobi)
    System.out.println("Current instant in Nairobi is: " 
            + instantNow.atZone(ZoneId.of("Africa/Nairobi")));
    
        // Add or subtract time to/from an Instant
    Instant instantInFuture = instantNow.plus(Duration.ofDays(10)); // 10 days later
    System.out.println("Ten days after Instant: " + instantInFuture);

    Instant instantInPast = instantNow.minus(Duration.ofHours(5)); // 5 hours earlier
    System.out.println("Five hours before instant: " + instantInPast);

    }
    // main method begins program execution
public static void main(String[] args)
{
    // Demonstrate the clock class
    demoClock();
    Spacer.separator();

    // Demonstrate the Duration class
    demoDuration();
    Spacer.separator();

    // Demonstrate the Instant class
    demoInstant();
    Spacer.separator();
}

    

    }