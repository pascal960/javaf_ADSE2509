
package com.adse2509.sess09_exceptions;

/**
 *
 * @author Administrator
 */
public class InvalidNumberFormatException extends Exception
{
    // Constructor that accepts a custom error message
    public InvalidNumberFormatException(String message)
    {
        super(message);
    }
}
