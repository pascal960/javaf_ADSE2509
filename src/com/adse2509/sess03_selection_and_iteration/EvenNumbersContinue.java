package com.adse2509.sess03_selection_and_iteration;

/**
*Java program that displays the even numbers between 20-50 using a for 
* loop and the continue keyword.
 * @author pascal
 */
public class EvenNumbersContinue
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
       //Variable to be used in the program
        int n = 20;
                System.out.println("The even numbers between 20-50 are");
                for (; n <= 50; n++)
                { 
                    if(n %2 == 1)
                        continue;
                    System.out.printf("%d ,",n);
                   
                }
                System.out.println();
    }
    
}
