
package com.adse2509.sess10.date_time_api_enumaration;

/**
 * Java program to demonstrate the use of the OffsetDateTime, OffsetTime,
 * ZonedDateTime, ZoneId, and ZoneOffset classes from the java.time package.
 * 
 * 1. OffsetDateTime: Represents a date-time with an offset from the UTC/Greenwich.
 * 2. OffsetTime: Represents a time with an offset from the UTC/Greenwich (no date).
 * 3. ZonedDateTime: Represents a date-time with a time zone.
 * 4. ZoneId: Represents a time zone identifier (e.g., "Africa/Nairobi").
 * 5. ZoneOffset: Represents a fixed offset from UTC/Greenwich.
 * @author Pascal
 */

public class ZonedDataTimeAPIDemo
{
    // Class methods
    //==================================================================
    // 1. Demonstrating the OffsetDateTime class
    //==================================================================
    private static void demoOffsetDateTime()
    {
        System.out.println("\n1. OffsetDateTime - Handles both date & time with an " +
                "offset from the UTC/Greenwich.");

        // Get and display the current date and time with an offset from the UTC
        OffsetDateTime nowWithOffset = OffsetDateTime.now();
        System.out.println("Current OffsetDateTime (with system default offset): " + nowWithOffset);

        // Create and display a specific OffsetDateTime (e.g., 2025-03-25T07:30:00+3:00)
OffsetDateTime birthdayOffset = OffsetDateTime.of(2025, 3, 25, 
        7, 30, 0, 0, ZoneOffset.ofHours(3));
System.out.println("Birthday with OffsetDateTime ('2025-03-25T07:30:00+3:00') : " + birthdayOffset);

// Add/subtract time with OffsetDateTime
OffsetDateTime fourDaysLater = nowWithOffset.plusDays(4);
System.out.println("Four Days after nowWithOffset: " + fourDaysLater);
OffsetDateTime twoHoursEarlier = nowWithOffset.minusHours(2);
System.out.println("Two hours before nowWithOffset: " + twoHoursEarlier);

    }
    //==================================================================
// 2. Demonstrating the OffsetTime class
//==================================================================
private static void demoOffsetTime()
{
    System.out.println("\n2. OffsetTime - Handles time with and offset (no Date) " +
            "from the UTC/Greenwich.");

    // Get and display the current time with an offset from the UTC
    OffsetTime currentTimeWithOffset = OffsetTime.now();
    System.out.println("Current OffsetTime (with system default offset) is: " + currentTimeWithOffset);
    
    // Create and display a specific OffsetTime (e.g., 15:30:00+2:00)
OffsetTime specificOffsetTime = OffsetTime.of(15, 30, 0, 0, ZoneOffset.ofHours(2));
System.out.println("Specific OffsetTime is: " + specificOffsetTime);

// Add/subtract and display time with OffsetTime
System.out.println("Three hours after the current offset time " +
        "will be : " + currentTimeWithOffset.plusHours(3));
System.out.println("Twenty five minutes before current offset time " +
        "was: " + currentTimeWithOffset.minusMinutes(25));

}

//==================================================================
// 3. Demonstrating the ZonedDateTime class
//==================================================================
private static void demoZonedDateTime()
{
    System.out.println("\n3. ZonedDateTime - handle date & time with a time zone.");

    // Get and display the current date & time in a specific
    // time zone (e.g., Nairobi, Tokyo, London, Moscow)
    // "Africa/Nairobi", "Asia/Tokyo", "Europe/London", "Europe/Moscow"
    ZonedDateTime nowInNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
    System.out.println("Current ZonedDateTime in New York is: " + nowInNewYork);
    
    // Create and display a specific ZonedDateTime (e.g., 2026-12-12T14:30:00+9:00[Asia/Tokyo])
ZonedDateTime tokyoZonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
System.out.println("Specific ZonedDateTime in " +
        "Tokyo, Japan (2026-12-12T14:30:00+9:00[Asia/Tokyo]) is: " + tokyoZonedDateTime);

// Convert ZonedDateTime to a different time zone (e.g., UTC)
System.out.println("NewYork ZonedDateTime converted to UTC is: "
        + nowInNewYork.withZoneSameInstant(ZoneId.of("UTC")));

}

    
}