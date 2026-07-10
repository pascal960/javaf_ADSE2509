package com.adse2509.sess03_selection_and_iteration;

import com.adse2509.sess02_variables_datatypes_operators.GameDifficulty;
import com.adse2509.sess02_variables_datatypes_operators.PaymentMethod;

import java.util.Scanner;

/**
 * Java program to demonstrate the various selection/decision/conditional
 * constructs.
 * 
 * @author pascal
 */
public class JavaDecisionConstructs
{

    // Class variable to get input from the user
    static Scanner sc = new Scanner(System.in);

    // main method begins program execution
    public static void main(String[] args)
    {
       //variables to be used in the program
        float temperature;
        String password = "";
        
               // Get the temperature from the user
        System.out.println("Please enter today's temperature in °C:");
        temperature = Float.parseFloat(sc.nextLine());

        // ----------------------------------------------------------------------
        // 1. if
        // ----------------------------------------------------------------------
        System.out.println("=".repeat(70));
        System.out.println(" if SELECTION CONSTRUCT");
        System.out.println("=".repeat(70));
        if (temperature > 25.0f)
            System.out.println("Hooray 🏖️, it's a warm day, let's head to "
                    + "the beach 🌴🌴");
        if (password.equals(""))
            System.out.println("Please enter your password!");
                // ----------------------------------------------------------------------
        // 2. if... else
        // ----------------------------------------------------------------------
        System.out.println("=".repeat(70));
        System.out.println("2. if ... else SELECTION CONSTRUCT");
        System.out.println("=".repeat(70));
        // Prompt the user for a number and tell them if it's odd or even
        System.out.println("Please enter a number and I'll tell you if "
                + "it's odd or even ->");
        int userNum = Integer.parseInt(sc.nextLine().trim());
        if (userNum % 2 == 1)
            System.out.printf("\n%d is an odd number.", userNum);     
        else
            System.out.printf("\n%d is an even number.", userNum);
        
             //prompt the user for their exam score and tell them if they've passed
             //or failed
                    System.out.println("Please enter your score and I'll tell you if "
                + "passed or failed ->");
        int score = sc.nextInt();
        if (score >= 40)// >=
            System.out.printf("\nCongratulations, with a score of %d%%, you've "
                    + "passed the exam!🪅🪅", score);
        else
            System.out.printf("\nUnfortunately, with a score of %d%%, you've "
                    + "failed the exam!😢😢", score);
        System.out.printf(score >= 40 ? "\nCongratulations, with a score of %d%%, you've "
                + "passed the exam!🪅🪅" : "\nUnfortunately, with a score of %d%%, you've "
                + "failed the exam!😢😢\n", score);//succintness  compressed code that does the exact thing
                //--------------------------------------------------------------
                 // 3. if ... else if ... else
                // -------------------------------------------------------------
                System.out.println("=".repeat(70));
                System.out.println("3. if ... else if ... else SELECTION CONSTRUCT");
                System.out.println("=".repeat(70));
                // Grade student based on their score
                if(score >= 70 && score <= 100)
                    System.out.printf("\nWith a score of %d, you got grade 'A'\n", score);
                else if(score >= 60)
                    System.out.printf("\nWith a score of %d, you got grade 'B'\n", score);
                else if(score >= 50)
                    System.out.printf("\nWith a score of %d, you got grade 'C'\n", score);
                else if(score >= 40)
                    System.out.printf("\nWith a score of %d, you got grade 'D'\n", score);
                else
                    System.out.printf("\nWith a score of %d, you got grade 'E'\n", score);

                    // -------------------------------------------------------------
                    // 4. switch ... case for payment enumeration
                    // -------------------------------------------------------------
                    System.out.println("=".repeat(70));
                    System.out.println("4. switch ... case SELECTION CONSTRUCT");
                    System.out.println("=".repeat(70));
                    System.out.println("\nPAYMENT PROCESS");
                    System.out.println("=".repeat(55));

                    PaymentMethod payment = PaymentMethod.DEBIT_CARD;
                    switch(payment)
                            { 
                            case CREDIT_CARD:
                              System.out.println("Processing credit card ...");
                              break;
                          case CASH:
                              System.out.println("Customer pays with cash.");
                              break;
                          case DEBIT_CARD:
                              System.out.println("Processing debit card ...");
                              break;
                          case MOBILE_MONEY:
                              System.out.println("Confirm payment using your mobile phone.");
                              break;
                          case BANK_TRANSFER:
                              System.out.println("Waiting for bank transfer confirmation.");
                              break;
                    }

                // Newer pattern-matching switch (Java 17+)
              GameDifficulty  difficulty = GameDifficulty.EASY;
                System.out.println("\nGAME DIFFICULTY SETTINGS");
                System.out.println("-".repeat(55));

                switch(difficulty)
                {
                    case EASY ->
                        System.out.println("\n" + difficulty + "\nPerfect for beginners.");
                    case MEDIUM ->
                        System.out.println("\n" + difficulty + "\nBalanced challenge.");
                    case HARD ->
                        System.out.println("\n" + difficulty + "\nGood challenge.");
                    case EXPERT ->
                        System.out.println("\n" + difficulty + "\nFor experienced players.");
                    case NIGHTMARE ->
                        System.out.println("\n" + difficulty + "\nOnly the best survive!.");
                }


    }
}
