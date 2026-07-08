package com.adse2509.sess2_variables_datatypes_operators;

/**
 *
 * @author Administrator
 */
public class TempConverter {

    public static void main(String[] args) {

        // Temperature conversion: Fahrenheit to Celsius
        double fahrenheit = 77.0;
        double celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
        System.out.println("Temperature Conversion");
        System.out.println(fahrenheit + "°F = " + celsius + "°C");

        // Temperature conversion: Celsius to Fahrenheit
        double celsius2 = 30.0;
        double fahrenheit2 = (celsius2 * 9.0 / 5.0) + 32.0;

        System.out.println(celsius2 + "°C = " + fahrenheit2 + "°F");
    }
}