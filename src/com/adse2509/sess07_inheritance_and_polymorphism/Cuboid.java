package com.adse2509.sess07_inheritance_and_polymorphism;

/**
 * The {@code Cuboid} class represents a 3-dimensional Cuboid with its
 * length, width, and breadth (depth). It provides methods to compute
 * its surface area and volume.
 *
 * @author Pascal
 */
public class Cuboid extends Rectangle
{
    //=============================================================
    // Instance Fields
    //=============================================================

    /**
     * The breadth of the cuboid (in units)
     */
    protected int breadth;

    //=============================================================
    // Constructors
    //=============================================================

    public Cuboid()
    {
        super();

        this.name = "Cuboid";
        this.breadth = 0;
    }

    public Cuboid(int width, int length, int breadth)
    {
        super(width, length);

        this.name = "Cuboid";
        this.breadth = breadth;
    }

    //=============================================================
    // Getters & Setters
    //=============================================================

    public int getBreadth()
    {
        return breadth;
    }

    public void setBreadth(int breadth)
    {
        this.breadth = breadth;
    }

    //=============================================================
    // Instance Methods
    //=============================================================

    /**
     * Calculates and returns the cuboid's surface area.
     *
     * @return the cuboid's surface area.
     */
    protected long calculateSurfaceArea()
    {
        return 2 * ((length * width) + (length * breadth) + (width * breadth));
    }

    /**
     * Calculates and returns the cuboid's volume.
     *
     * @return the cuboid's volume.
     */
    protected long calculateVolume()
    {
        return length * width * breadth;
    }

    //=============================================================
    // Overridden Methods
    //=============================================================

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
                Width: %d
                Length: %d
                Breadth: %d
                Surface Area: %d
                Volume: %d
                -------------------------------------------------------------
                """,
                this.getName(),
                this.width,
                this.length,
                this.breadth,
                this.calculateSurfaceArea(),
                this.calculateVolume()
        );
    }
}