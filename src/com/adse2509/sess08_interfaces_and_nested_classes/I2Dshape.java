package com.adse2509.sess08_interfaces_and_nested_classes;

/**
 * The {@code I2Dshape} interface represents a two-dimensional geometric shape.
 * It defines a contract for calculating the area of the shape that implements it.
 * Any class implementing this interface must provide its own implementation of the
 * {@link #calcArea()} method.
 * @author pascal
 */
@FunctionalInterface
public interface I2Dshape
{
    /** Calculates the area of the 2-D shape as a {@code float}
     * 
     * @return the area of the 2-D shape as a {@code float}. The area is 
     * typically expressed in square units (e.g., square cm, or feet).
     */
    public float calcArea();
}
