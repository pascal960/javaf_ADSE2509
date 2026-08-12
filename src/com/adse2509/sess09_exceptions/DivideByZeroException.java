package com.adse2509.sess09_exceptions;

/**
 * A custom exception that represents an attempt to divide a number by zero.
 *
 * @author pascal
 */
public class DivideByZeroException extends ArithmeticException
{
    //=============================================================
    // Constructors
    //=============================================================

    /**
     * Constructs a new {@code DivideByZeroException} with a default message.
     */
    public DivideByZeroException()
    {
        super("Division by zero is not allowed.");
    }

    /**
     * Constructs a new {@code DivideByZeroException} with the specified detail
     * message.
     *
     * @param message the detail message explaining the reason for the exception
     */
    public DivideByZeroException(String message)
    {
        super(message);
    }
}