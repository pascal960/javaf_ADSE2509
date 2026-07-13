package com.adse2509.sess03_selection_and_iteration;

import com.adse2509.sess02_variables_datatypes_operators.GameDifficulty;
import com.adse2509.sess02_variables_datatypes_operators.PaymentMethod;

/**
 * Java program to demonstrate the for... each loop to display all items in
 * an enumeration.
 *
 * @author pascal
 */
public class ForEachEnumItem
{
    public static void main(String[] args)
    {
           // Every enumeration automatically provides a values() method to
        // return an array containig all enum constants.
        System.out.println("\nAVAILABLE GAME DIFFICULTY LEVELS");
        System.out.println("-".repeat(55));
        for (GameDifficulty level : GameDifficulty.values())
            System.out.println(level);

        System.out.println("\nAVAILABLE PAYMENT METHODSS");
        System.out.println("-".repeat(55));
        for (PaymentMethod payment : PaymentMethod.values())
            System.out.println(payment);
        //TODO:Display enum ordinals-> covered in session 10
       
    }


}
