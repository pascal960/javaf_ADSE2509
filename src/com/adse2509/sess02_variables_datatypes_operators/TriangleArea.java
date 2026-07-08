package com.adse2509.sess02_variables_datatypes_operators;

import java.util.Scanner;

public class TriangleArea
{
    static Scanner sc;
     public static void main(String[] args){
             float height,base,area ;
               sc = new Scanner(System.in);
               
               System.out.println("please enter the base");
            base= sc.nextFloat();
              System.out.println("please enter the height");
               height= sc.nextFloat();
               area= (base*height)/2 ;
                       System.out.println(area) ;
                               sc.close();}
                       
}