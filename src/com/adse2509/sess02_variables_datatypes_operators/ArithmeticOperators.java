package com.adse2509.sess02_variables_datatypes_operators;

/**
 * Java program to demonstrate the various arithmetic and compound
 * assignment operators.
 *
 * @author Pascal
 */
public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println("=".repeat(70));
        System.out.println("\t JAVA ARITHMETIC OPERATORS DEMONSTRATION");
        System.out.println("=".repeat(70));

        // Variables to be used in the program
        int num1 = 10, num2 = 3;
        double num3 = 15.0, num4 = 3.0;

        // ======================================================================
        // 1. Basic Arithmetic Operators +, -, *, / and %
        // ======================================================================
        System.out.println("=".repeat(70));
        System.out.println("    1. BASIC ARITHMETIC OPERATORS");
        System.out.println("=".repeat(70));

        // Addition
        System.out.printf("%-23s %d + %d = %d%n%-24s %.2f + %.2f = %.2f%n",
                "Integer Addition",
                num1, num2, num1 + num2,
                "Float Addition",
                num3, num4, num3 + num4);

        System.out.println("=".repeat(70));

        // Subtraction
        System.out.printf("%-23s %d - %d = %d%n%-24s %.2f - %.2f = %.2f%n",
                "Integer Subtraction",
                num1, num2, num1 - num2,
                "Float Subtraction",
                num3, num4, num3 - num4);

        System.out.println("=".repeat(70));

        // Multiplication
        System.out.printf("%-23s %d * %d = %d%n%-24s %.2f * %.2f = %.2f%n",
                "Integer Multiplication",
                num1, num2, num1 * num2,
                "Float Multiplication",
                num3, num4, num3 * num4);

        System.out.println("=".repeat(70));

        // Division
        System.out.printf("%-23s %d / %d = %d%n%-24s %.2f / %.2f = %.2f%n",
                "Integer Division",
                num1, num2, num1 / num2,
                "Float Division",
                num3, num4, num3 / num4);

        System.out.println("=".repeat(70));

        // Modulus
        System.out.printf("%-23s %d %% %d = %d%n",
                "Integer Modulus",
                num1, num2, num1 % num2);

        System.out.println("=".repeat(70));

        // ======================================================================
        // 2. Unary Increment & Decrement Operators
        // ======================================================================
        System.out.println("=".repeat(70));
        System.out.println("    2. UNARY INCREMENT & DECREMENT OPERATORS");
        System.out.println("=".repeat(70));

        System.out.println("Initial value of num1 is: " + num1);

        // Pre-increment
        System.out.println("++num1 (pre-increment) = " + (++num1));
        System.out.println("num1 after pre-increment is: " + num1);

        System.out.println("-".repeat(55));

        // Post-increment
        System.out.println("num1++ (post-increment) = " + (num1++));
        System.out.println("num1 after post-increment is: " + num1);

        System.out.println("-".repeat(55));

        // Pre-decrement
        System.out.println("--num1 (pre-decrement) = " + (--num1));
        System.out.println("num1 after pre-decrement is: " + num1);

        System.out.println("-".repeat(55));

        // Post-decrement
        System.out.println("num1-- (post-decrement) = " + (num1--));
        System.out.println("num1 after post-decrement is: " + num1);

        System.out.println("=".repeat(70));

        // ======================================================================
        // 3. Compound Assignment Operators +=, -=, *=, /= and %=
        // ======================================================================
        System.out.println("=".repeat(70));
        System.out.println("    3. COMPOUND ASSIGNMENT OPERATORS");
        System.out.println("=".repeat(70));

        // Reassign and display the value of num2
        num2 = 20;
        System.out.println("Initial value of num2 is: " + num2);
        
        num2 += 5;   // same as num2 = num2 + 5
        System.out.println("After += 5 num2 is: " + num2);

        num2 -= 3;   // same as num2 = num2 - 3
        System.out.println("After -= 3 num2 is: " + num2);

        num2 *= 2;   // same as num2 = num2 * 2
        System.out.println("After *= 2 num2 is: " + num2);

        num2 /= 4;   // same as num2 = num2 / 4
        System.out.println("After /= 4 num2 is: " + num2);

        num2 %= 2;   // same as num2 = num2 % 2
        System.out.println("After %= 2 num2 is: " + num2);

        System.out.println("=".repeat(70));
    }
}