package com.adse2509.sess08_interfaces_and_nested_classes;

import com.adse2509.sess07_inheritance_and_polymorphism.Shape;

/**
 * The {@code Sphere} class represents a 3-dimensional Sphere
 * with its radius.
 *
 * @author pascal
 */
public class Sphere extends Shape implements I3DShape
{
    //=============================================================
    // Instance Fields
    //=============================================================

    /**
     * The radius of the sphere
     */
    protected int radius;

    //=============================================================
    // Constructors
    //=============================================================

    public Sphere()
    {
        radius = 0;
    }

    public Sphere(int radius)
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
    // Instance methods (Interface Implementation)
    //=============================================================

    @Override
    public float calcSurfaceArea()
    {
        // Lecturer style: 4 * PI * r * r
        return (float) (4 * Math.PI * radius * radius);
    }

    @Override
    public float calcVolume()
    {
        // Lecturer style: (4.0 / 3.0) * PI * r * r * r
        return (float) ((4.0 / 3.0) * Math.PI * radius * radius * radius);
    }

    //=============================================================
    // Overridden methods
    //=============================================================

    @Override
    public String toString()
    {
        return String.format(
                """
                %s Details
                -------------------------------------------------------------
                Radius: %d
                Surface Area: %.2f
                Volume: %.2f
                -------------------------------------------------------------
                """,
                this.getName(),
                this.radius,
                this.calcSurfaceArea(), 
                this.calcVolume());     
    }

    @Override
    public String getName()
    {
        return "Sphere";
    }
}
