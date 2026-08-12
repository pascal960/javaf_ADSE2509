package com.adse2509.sess05_arrays_and_strings;

/**
 * Java program to demonstrate a single dimension array using a user's rating
 * of a product.
 *
 * @author Pascal
 */
public class SingleDimArray
{
    public static void main(String[] args)
    {
        // Byte array to hold the user's rating of a product
        byte userRating[] = {4, 3, 5, 4, 3, 2, 5, 4, 3, 5, 3, 5, 4};

        // Integer value to hold the total of all the ratings
        int totalRating = 0;

        // Looping variable
        int n = 0;

        // Float variable to hold the mean/average rating
        float meanRating;

        // Use a for loop to calculate the total rating
        for (; n < userRating.length; n++)
            totalRating += userRating[n];

        // Calculate the product's average rating
        meanRating = totalRating / (float) userRating.length;

        // Display all user ratings of the product using a for-each loop
        System.out.println("All user ratings of the product are:");

        for (byte curRating : userRating)
        {
            System.out.printf("%d, ", curRating);
        }

        System.out.println();

        // Display the total and average product rating
        System.out.printf(
                """
                Total Product Rating: %d
                Average Product Rating: %.1f
                """,
                totalRating, meanRating);
    }
}