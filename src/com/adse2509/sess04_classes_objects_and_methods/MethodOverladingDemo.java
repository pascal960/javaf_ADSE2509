package com.adse2509.sess04_classes_objects_and_methods;

import com.adse2509.sess04_classes_object_and_methods.MethodOverloading;

/**
 *java program to demo how to use overloading
 * @author pascal
 */
public class MethodOverladingDemo
{

    public static void main(String[] args)
    {
            // Variables to be used in the program
       int firstNum = 3, secondNum = 5, thirdNum = 7, fourthNum = 8;
       byte firstByte = 4;
       long answer;

       // Declare and instantiate an object of MethodOverloading class
        MethodOverloading ml = new MethodOverloading();
       // Add two integers and display their sum
       answer = ml.addNums(firstNum, secondNum);
       System.out.println("The sum of " + firstNum + " and " + secondNum +
       " is " + answer);
       // Add three integers and display their sum
        answer = ml.addNums(firstNum, secondNum, thirdNum);
        System.out.println("The sum of " + firstNum + ", " + secondNum + ", and "
        + thirdNum + " is " + answer);

        // Add a byte and integer and display their sum
        answer = ml.addNums(firstByte, fourthNum);
        System.out.println("The sum of " + firstByte + " and " + fourthNum +
        " is " + answer);

        float num1 = 5.5f, num2 = 2.5f;
        // Add two floats and display their sum
        double result = ml.addNums(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 +
        " is " + result);
        
                // Add several integers and display their sum
        answer = ml.addNums(45, 56);
        System.out.println("The sum of 45, and 56 is: " + answer);
        answer = ml.addNums(49, 27, 37, 95);
        System.out.println("The sum of 49, 27, 37, and 95 is: " + answer);



    }
    
}
