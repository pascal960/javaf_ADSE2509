package com.adse2509.sess07_inheritance_and_polymorphism;


/** The {@code Rectangle} class represents a 2-dimensional Rectangle with
 * its length and width. It provides methods to compute its area and perimeter.
 *
 * @author pascal
 */
public class Rectangle extends Shape
{
    //=============================================================
    // Instance Fields
    //=============================================================
    /**
     * The width of the rectangle (in units)
     */
    protected int width;
    /**
     * The length of the rectangle (in units)
     */
    protected int length;

    //=============================================================
    // Constructors
    //=============================================================
    public Rectangle()
    {
        this.name = "Rectangle";
        this.width = 0;
        this.length = 0;
    }

    public Rectangle(int width, int length)
    {
        this.name = "Rectangle";
        this.width = width;
        this.length = length;
    }

    //=============================================================
    // Getters & Setters
    //=============================================================

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }


    //=============================================================
    // Instance Methods
    //=============================================================

    /**
     *  Calculates and returns the rectangle's area (in square units).
     *
     * @return the rectangle's area (in square units).
     */
    protected long calculateArea()
    {
        return width * length;
    }

    protected long calculatePerimeter()
    {
        return 2 * (width + length);
    }

    //=============================================================
    // Overriden Methods
    //=============================================================
    /**
     *  Method to return the name of the shape as a String
     *
     * @return the shape's name as a String.
     */
    @Override
    public String getName()
    {
        return this.name;
    }

    @Override
    public String toString()
    {
        return String.format(
                """
                %s Details
                -------------------------------------------------------------
                Width: %d, 
                Length: %d, 
                Area: %d
                Perimeter: %d
                -------------------------------------------------------------
                """, this.getName(), this.width, this.length,
                this.calculateArea(), this.calculatePerimeter()
        );
    }

}