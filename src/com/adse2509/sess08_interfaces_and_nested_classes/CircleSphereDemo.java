package com.adse2509.sess08_interfaces_and_nested_classes;

import java.util.Scanner;

/**
 * Java program to demonstrate declaration and instantiation of Circle
 * and Sphere objects, and displaying their details.
 *
 * @author Administrator
 * @version 1.0
 */
public class CircleSphereDemo
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Declare Circle and Sphere objects
        Circle c1, c2;
        Sphere sp1, sp2;

        // Prompt the user for the radius of circle 'c2' and sphere 's2'
        System.out.println("Please enter the radius of the circle 'c2' "
                + "in cm:\n");
        int rad1 = sc.nextInt();

        System.out.println("Please enter the radius of the sphere 's2' "
                + "in cm:\n");
        int rad2 = sc.nextInt();

        // Instantiate the circles then the spheres
        c1 = new Circle(); // Using the no-argument constructor
        c1.setRadius(7);

        c2 = new Circle(rad1); // Using the parameterised constructor

        sp1 = new Sphere(); // Using the no-argument constructor
        sp1.setRadius(7);

        sp2 = new Sphere(rad2); // Using the parameterised constructor

        // Display the dimensions of the circles and spheres
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(sp1);
        System.out.println(sp2);

        sc.close();
    }
}