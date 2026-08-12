package com.adse2509.sess10.date_time_api_enumaration;

import java.time.Clock;
import java.time.Instant;

/*** Java program to demonstrate the use of the Clock, Duration and Instant classes
* from the Java.time package.
* 
* 1. Clock provides access to the current time in a specific time zone.
* 2. Duration measures the amount of time between two points in time.
* 3. Instant represents a specific moment on the timeline (in UTC)
* 
 * @author pkivuitu
 */
public class TimeAPIDemo {

   //=============================================================
    // 1.Demonstrating the clock class
    //=============================================================

    public static void demoClock()
            
    {
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
    
}
