package com.adse2509.sess02_variables_datatypes_operators;

/**
 * Java program to demonstrate working with enumeration type(s).
 *
 * @author pascal
 */
public class EnumDemo
{
    public static void main(String[] args)
    {
        // Declare a string representing a game
        String game = "Serious Sam";

        System.out.println("=".repeat(70));
        System.out.println("JAVA ENUMERATION TYPES DEMONSTRATION");
        System.out.println("=".repeat(70));

        //--------------------------------------
        // 1. Game difficulty enumeration
        //--------------------------------------
        GameDifficulty difficulty = GameDifficulty.MEDIUM;

        // Display game setting
        System.out.println("\nThe game " + game + " is being played on "
                + difficulty + " setting.");

        //--------------------------------------
        // 2. Payment method enumeration
        //--------------------------------------
        PaymentMethod payment = PaymentMethod.CASH;
        String customerName = "pascal";

        // Display customer's payment method
        System.out.println("\n" + customerName + " prefers paying via "
                + payment + ".");
    }
}