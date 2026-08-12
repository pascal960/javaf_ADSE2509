package com.adse2509.sess09_exceptions;

/**
 * Java program to demonstrate some common array and string exception
 * 
 * @author Administrator
 */
public class ArrayAndStringExceptions
{
    //=============================================================
    // Class Methods
    //=============================================================
    
    // 1. Trying to access an index that doesn't exist
    private static void demoArrayIndexOutOfBoundsException()
    {
        System.out.println("1. ArrayIndexOutOfBoundsException");
        System.out.println(" -> Occurs when you try to access an array with an invalid index," +
            " i.e. a value less than zero or greater than array length - 1.");
        int [] numbers = {10, 20, 30, 40, 50};
        try
        {
            System.out.println("Try to access index '10' while the actual array " +
                "length is '" + numbers.length + "' elements.");
            System.out.println("Element at index 10 is : " + numbers);
        }
        catch (ArrayIndexOutOfBoundsException aiobe)
        {
            System.err.println("Caught: " + aiobe + " " +
                "\nMessage: " + aiobe.getLocalizedMessage() +
                "\nValid indices are: 0 - " + (numbers.length - 1));
        }
    }

    // 2. Using a null array reference
    private static void demoNullPointerException()
    {
        System.out.println("2. NullPointerException (Array)");
        System.out.println(" -> Occurs when you try to use an array that is null " +
            "(not instantiated or initialised with values).");
        int[] data = null;
        try
        {
            System.out.println("Try to get the number of elements in the array ");
            System.out.println("The number of elements in the 'data' array is: " + data.length);
        }
        catch (NullPointerException npe)
        {
            System.err.println("Caught: " + npe + " " +
                "\nYou must first intialise the data array:" +
                "\ne.g., int[] data = new int; or int [] data = {1,2,3,4,58};" +
                "\nMessage: " + npe.getLocalizedMessage() );
        }
    }

    // 3. Storing the wrong type in an Object[] array
    private static void demoArrayStoreException()
    {
        System.out.println("3. ArrayStoreException ");
        System.out.println(" -> Occurs when you try to store incompatible types in an array. ");

        // Declare an object array
        Object[] objects = new String[3];
        Object[] objects2 = new Object[3];
        
        try
        {
            // Store elements in the objects array
            objects[0] = "Hello";
            objects[1] = new Circle(14); // This will fail
            objects[2] = new Student(); // This will fail
            System.out.println("Try to get the number of elements in the array ");
        }
        catch (ArrayStoreException ase)
        {
            System.err.println("Caught: " + ase + " " +
                "\nMessage: " + ase.getLocalizedMessage());
        }
        catch (Exception e)
        {
            System.err.println("Error: " + e.getLocalizedMessage());
        }
    }
}
