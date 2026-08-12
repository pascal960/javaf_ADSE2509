package com.adse2509.sess09_exceptions;

import com.adse2509.util.Spacer;

/**
 *  Java program to demonstrate some common array and string exceptions.
 *
 * @author pascal
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
                "i.e. a value less than zero or greater than array length - 1.");
        int [] numbers = {10,20, 30, 40, 50};
        try
        {
            System.out.println("Try to access index '10' while the actual array " +
                    "length is '" + numbers.length + "' elements.");
            System.out.println("Element at index 10 is : " + numbers[10]);
        }
        catch (ArrayIndexOutOfBoundsException aiobe)
        {
            System.err.println("Caught: " + aiobe + " " +
                    "\nMessage: " + aiobe.getLocalizedMessage() +
                    "\nValid indices are: 0 - " + (numbers.length - 1));
        }
    }

    // 2. Using a null array reference
    private static void demoNullArrayPointerException()
    {
        System.out.println("2. NullPointerException (Array)");
        System.out.println(" -> Occurs when you try to use an array that is null " +
                "(not instantiated or initialised with values).");
        int [] data = null;
        try
        {
            System.out.println("Try to get the number of elements in the array ");
            System.out.println("The number of elements in the 'data' array is: " + data.length);
        }
        catch (NullPointerException npe)
        {
            System.err.println("Caught: " + npe + " " +
                    "\nYou must first intialise the data array:" +
                    "\ne.g., int[] data = new int[8]; or int [] data = {1,2,3,4,58};" +
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

//        Object[] objects2 = new Object[3];
//        objects[0] = "Hello";
//        objects[1] = new Circle(14);
//        objects[2] = new Student();


        try
        {
            // Store elements in the objects array
            objects[0] = "Hello";
            objects[1] = "World";
            objects[2] = 123; // This will fail
            System.out.println("Try to get the number of elements in the array ");
        }
        catch (ArrayStoreException ase)
        {
            System.err.println("Caught: " + ase + " " +
                    "\nCannot store incompatible types in an array. :" +
                    "\ne.g., integer primitives in a String[] array." +
                    "\nMessage: " + ase.getLocalizedMessage() );
        }
    }

    // 4. Creating an array with negative size
    private static void demoNegativeArraySizeException()
    {
        System.out.println("4. NegativeArraySizeException ");
        System.out.println(" -> Occurs when you try to use a negative value for array size.");
        int size = -4;

        try
        {
            int[] nums = new int[size];
            System.out.println("The 'nums' array has been successfully created"); // Will never execute
        }
        catch (NegativeArraySizeException nase)
        {
            System.err.println("Caught: " + nase + "" +
                    "\nThe size of the array cannot be negative!.");
        }
    }

    // 5. String index out of bounds
    private static void demoStringIndexOutOfBoundsException()
    {
        System.out.println("5. StringIndexOutOfBoundsException ");
        System.out.println(" -> Occurs when you try to access a string with an " +
                "invalid index (< 0 or >= string length).");
        String string = "Hello";

        try
        {
            System.out.println("Accessing index 10 in the string '" + string + "'");
            System.out.println("The character at index 10 is: " + string.charAt(10));
        }
        catch (StringIndexOutOfBoundsException sioobe)
        {
            System.err.println("Caught: " + sioobe +
                    "\nMessage: " + sioobe.getLocalizedMessage());
        }
    }

    // 6. NumberFormatException
    private static void demoNumberFormatException()
    {
        System.out.println("6. NumberFormatException ");
        System.out.println(" -> Occurs when you try to parse an invalid string into a number.");

        String number = "two";
        try
        {
            int num = Integer.parseInt(number); // Will fail as Java can convert "two" -> 2
            System.out.println("Parsed number is " + number);
        }
        catch (NumberFormatException nfe)
        {
            System.err.println("Caught: " + nfe + "\nMessage: " + nfe.getLocalizedMessage());
        }
    }

    // 7. NullPointerException
    private static void demoNullStringPointerException()
    {
        System.out.println("7. NullPointerException with strings ");
        System.out.println(" -> Occurs when you try to call string.length() on a null string.");

        String str = null;
        try
        {
            System.out.println("The number of characters in the string 'str' is " + str.length());
        }
        catch (NullPointerException npe)
        {
            System.err.println("Caught: " + npe + "\nMessage: " + npe.getLocalizedMessage());
        }
    }

    // 8. ClassCastException
    private static void demoClassCastException()
    {
        System.out.println("8. Class Exception");
        System.out.println(" -> Occurs when you try to cast an object to an "
                + "incompatible class.\n");
        Object obj = "Hello";
        try
        {
            Integer num = (Integer) obj; // Invalid cast
            System.out.println("Casted number" + num);
        }
        catch (ClassCastException cce)
        {
            System.err.println("Caught: " + cce + "\nMessage: " +
                    cce.getLocalizedMessage());
        }
    }

    // 9. ArrayIndexOutOfBoundsException with multi-dimensional arrays
    private static void demoMultiDimensionalArrayIndexOutOfBoundsException()
    {
        System.out.println("9. ArrayIndexOutOfBoundsException (Multi-dimensional)");
        System.out.println(" -> Occurs when accessing an invalid index in a multi-dimensional array.\n");

        int[][] multiArray =
                {
                        {
                                1, 2, 3
                        },
                        {
                                4, 5, 6
                        }
                };

        try
        {
            System.out.println("Accessing invalid index [2][1] in the multi-dimensional array...");
            System.out.println("Element: " + multiArray[2][1]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException aiobe)
        {
            System.err.println("Caught: " + aiobe + "\nMessage: " + aiobe.getLocalizedMessage());
        }
    }

    // main method begins program execution
    public static void main(String[] args)
    {
        // Call the above methods to demonstrate various array & string exceptions
        demoArrayIndexOutOfBoundsException();
        Spacer.separator();

        demoNullArrayPointerException();
        Spacer.separator();

        demoArrayStoreException();
        Spacer.separator();

        demoNegativeArraySizeException();
        Spacer.separator();

        demoStringIndexOutOfBoundsException();
        Spacer.separator();

        demoNumberFormatException();
        Spacer.separator();

        demoNullStringPointerException();
        Spacer.separator();

        demoClassCastException();
        Spacer.separator();

        demoMultiDimensionalArrayIndexOutOfBoundsException();
        Spacer.separator();
    }
}