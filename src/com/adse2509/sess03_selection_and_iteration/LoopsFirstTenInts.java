package com.adse2509.sess03_selection_and_iteration;

/**
 * Java program to demonstrate the for, while and do...while loops
 * to display the first ten integers.
 *
 * @author Pascal
 */
public class LoopsFirstTenInts
{
    public static void main(String[] args)
    {
        // Looping variable
        int n;

        // -------------------------------------------------------------
        // 1. For loop
        // -------------------------------------------------------------
        System.out.println("=".repeat(70));
        System.out.println("First ten integers using a 'for' loop.");
        System.out.println("=".repeat(70));

        for (n = 1; n <= 10; n++)
            System.out.printf("%02d\n", n);

        System.out.println("");

        // -------------------------------------------------------------
        // 2. While loop
        // -------------------------------------------------------------
        System.out.println("=".repeat(70));
        System.out.println("First ten integers using a 'while' loop.");
        System.out.println("=".repeat(70));

        n = 1; // Re-assign n back to 1

        while (n <= 10)
        {
            System.out.printf("%02d\n", n);
            n++;
        }

        System.out.println("");

        // -------------------------------------------------------------
        // 3. Do...while loop
        // -------------------------------------------------------------
        System.out.println("=".repeat(70));
        System.out.println("First ten integers using a 'do...while' loop.");
        System.out.println("=".repeat(70));

        n = 1; // Re-assign n back to 1

        do
        {
            System.out.printf("%02d\n", n);
            n++;
        }
        while (n <= 10);
    }
}