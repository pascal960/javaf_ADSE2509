package com.adse2509.sess05_arrays_and_strings;

/**
 *
 * @author Pascal
 */
public class ModifiedIf
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int first = 400, second = 700, result;
        result = first + second;

        // Evaluates the value of the result variable
        if(result > 1000)
            second += 100;
        System.out.println("The value of second is: " + second);
    }
}
