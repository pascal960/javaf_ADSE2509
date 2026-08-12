package com.adse2509.sess08_interfaces_and_nested_classes;

import com.adse2509.sess07_inheritance_and_polymorphism.Shape;

/**
 * The {@code Circle} class represents a 2-dimensional Circle with
 * its radius, it provides methods to compute its area and circumference.
 *
 * @author pascal
 */
public class Circle extends Shape implements I2Dshape
{
    //=============================================================
    // Instance Fields
    //=============================================================

    /**
     * The radius of the circle
     */
    protected int radius;

    //=============================================================
    // Constructors
    //=============================================================

    public Circle()
    {
        radius = 0;
    }

    public Circle(int radius)
    {
        this.radius = radius;
    }

    //=============================================================
    // Getters and Setters
    //=============================================================

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    //=============================================================
    // Instance methods
    //=============================================================

    public float getCircumference()
    {
        return (float) (Math.PI * (this.radius * 2));
    }

    //=============================================================
    // Overridden methods
    //=============================================================

    @Override
    public float calcArea()
    {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    public String getName()
    {
        return "Circle";
    }

    @Override
    public String toString()
    {
        return String.format(
                """
                %s Details
                -------------------------------------------------------------
                Radius: %d
                Area: %.2f
                Circumference: %.2f
                -------------------------------------------------------------
                """,
                this.getName(),
                this.radius,
                this.calcArea(),
                this.getCircumference());
    }
}