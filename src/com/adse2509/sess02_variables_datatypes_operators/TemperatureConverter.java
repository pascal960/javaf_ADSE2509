package com.adse2509.sess02_variables_datatypes_operators;

import java.util.Scanner;
/**
 * Java program to demonstrate the temperature conversion 
 * 
 * @author pascal
 */

public class TemperatureConverter
        
{
     // Class field to get input from the user
    static Scanner sc;
    // main method begins program execution    
    public static void main(String[] args)
    {
        // Method level variables to be used in the program
        float fahrenheit, celsius;

        sc = new Scanner(System.in);
          // Read in the temp in fahrenheit from the user
        System.out.println("Please enter the temperature in Fahrenheit:");
        fahrenheit = sc.nextFloat();
        sc.close(); //close the program
        //calculate the temperature in celsius
        celsius = (fahrenheit - 32) / (9.0f / 5);
        //display the results of the calculation
        System.out.println("Temperature in Celsius: " + celsius + " degree celsius");

        
    }
}