
package com.adse2509.sess02_variables_datatypes_operators;
import java.util.Scanner;
/**
 *
 * @author pascal
 */
public class Temp
{

   static Scanner sc;
    public static void main(String[] args)
    {
            float degrees, fahrenheit;
             sc = new Scanner(System.in);
              System.out.println("please enter temp in degrees");
            degrees= sc.nextFloat();
             fahrenheit=1.8f*degrees+32;
            
                       System.out.println(fahrenheit) ;
                               sc.close();}
                    
            
    
}
