package com.adse2509.sess11_additional_java_features;
 
/**
 * Functional interface for various mathematical operations.
 *
 * @author pascal
 */
@FunctionalInterface
interface MathOperation {
    int operation(int num1, int num2);
}
 
/**
 * Java program that demonstrates a functional interface and the use of
 * lambda expressions for mathematical operations.
 *
 * This class performs basic arithmetic operations using lambdas.
 *
 * @author pkivuitu
 */
public class SampleLambda {
 
    /**
     * Executes a mathematical operation on two numbers and returns the result.
     *
     * @param num1 The first number to be used in the operation.
     * @param num2 The second number to be used in the operation.
     * @param mo The operation to be performed on the two numbers.
     * @return The result of the arithmetic operation.
     */
    private int operate(int num1, int num2, MathOperation mo) { return mo.operation(num1, num2); }
 
    // Main method begins program execution
    public static void main(String[] args) {
 
        SampleLambda sl = new SampleLambda();
 
        // Compact/succinct lambda expression for each arithmetic operation
        MathOperation sum = (num1, num2) -> num1 + num2; // Addition
 
        MathOperation difference = (num1, num2) -> num1 - num2; // Subtraction
 
        MathOperation product = (num1, num2) -> num1 * num2; // Multiplication
 
        MathOperation multiplication = (num1, num2) -> { return num1 * num2; };
 
        MathOperation quotient = (num1, num2) -> { if (num2 == 0) { throw new ArithmeticException("Cannot divide by zero\nPlease use a non-zero denominator"); } return num1 / num2; };
 
        MathOperation modulo = (num1, num2) -> num1 % num2;
 
        // Perform the various arithmetic operations and display/print the results
        try {
            System.out.println("Addition operation: 20 + 10 = " + sl.operate(20, 10, sum));
            System.out.println("Subtraction operation: 7 - 2 = " + sl.operate(7, 2, difference));
            System.out.println("Multiplication operation: 8 x 5 = " + sl.operate(8, 5, product));
            System.out.println("Multiplication operation: 4 x 3 = " + sl.operate(4, 3, multiplication));
            System.out.println("Division operation: 20 ÷ 5 = " + sl.operate(20, 5, quotient));
            System.out.println("Division operation: 4 ÷ 0 = " + sl.operate(4, 0, quotient));
            System.out.println("Modulo operation: 8 % 5 = " + sl.operate(8, 5, modulo));
        } catch (ArithmeticException ae) { System.err.println("Error: " + ae.getLocalizedMessage()); }
        catch (Exception e) { System.err.println("Error: " + e.getLocalizedMessage()); }
    }
}
