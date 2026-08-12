package com.adse2509.sess04_classes_object_and_methods;

/**
 * A utility class demonstrating method overloading in Java.
 * This class provides multiple versions of the 'addNums' method that performs
 * addition operation on different parameter lists, showcasing the concept of
 * method overloading (compile-time/static polymorphism).
 * 
 * @author pascal
 */
public class MethodOverloading
{
    /**
     * Adds two integers and returns their sum as a long.
     * 
     * @param num1 the first integer to be added.
     * @param num2 the second integer to be added.
     * 
     * @return the sum of the two integers as a long value.
     */
    public long addNums(int num1, int num2) {return num1 + num2;}
    
    /**
     * Adds two integers and returns their sum as a long.
     * 
     * @param num1 the first integer to be added.
     * @param num2 the second integer to be added.
     * @param num3 the third integer to be added
     * 
     * @return the sum of the three integers as a long value.
     */
    public long addNums(int num1, int num2, int num3) {return num1 + num2 + num3;}
    
    /**
     * Adds a byte and an integer and returns their sum as a long.
     * 
     * @param num1 the byte operand (automatically converted/promoted to int)
     * @param num2 the integer operand to be added.
     * 
     * @return the sum of the byte and integer as a long value.
     */
    public long addNums(byte num1, int num2) {return num1 + num2;}
    
    /**
     * Adds two floats and returns their sum as a double.
     * 
     * @param num1 the first float to be added.
     * @param num2 the second float to be added.
     * 
     * @return the sum of the two floats as a double value.
     */
    public double addNums(float num1, float num2) {return num1 + num2;}
    
    
    /**
     * Adds a variable number of integer arguments using Java's varargs
     * feature.
     * 
     * This method provides the most flexible way to add number, as it can
     * handle any number of arguments including zero.
     * 
     * @param varArgs a variable number of integer arguments. (0 or more)
     *
     * @return the sum of all provided integers as a long value.
     */
    public long addNums(int...varArgs)
    {
        long sum = 0;
        for(int n: varArgs)
            sum += n;
        return sum;
    }
    
    
}